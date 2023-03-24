namespace Emby.RestClient.SampleApp
{
    using System;
    using System.Net.Http;
    using System.Threading;
    using System.Threading.Tasks;
    using System.Windows.Forms;
    using EmbyClient.MsRest;
    using EmbyClient.MsRest.Models;
    using YamlDotNet.Serialization;

    public partial class Form1 : Form
    {
        private const string ApiResultLogHeader = "\r\nREST API Result:\r\n";
        private const string DeviceId = "05188728-E1DC-49C8-A580-AB0059D9EEC1";
        private readonly HttpClientHandler clientHandler;
        private RestClient client;

        public Form1()
        {
            this.InitializeComponent();

            this.clientHandler = new HttpClientHandler();
        }

        public bool IsConnected
        {
            get { return this.client != null; }
        }

        protected override void OnLoad(EventArgs e)
        {
            base.OnLoad(e);
            this.SetControlState();
        }

        private async Task Connect()
        {
            if (this.client != null)
            {
                this.client.Dispose();
                this.client = null;
                this.SetControlState();
                return;
            }

            using (new WaitHelper(this))
            {
                // Allow for immediate UI state change
                await Task.Delay(1);

                try
                {
                    var newClient = new RestClient(this.clientHandler);

                    switch (this.tabControlAuth.SelectedIndex)
                    {
                        case 0:

                            this.textServerApiKey.Text = this.textServerUserAuth.Text;
                            newClient.BaseUri = new Uri(this.textServerUserAuth.Text);

                            this.AppendLog("\r\nCalling POST /Users/AuthenticateByName...");

                            var payLoad = new AuthenticateUserByName(this.textUserName.Text, this.textPassword.Text);
                            using (var authResult = await newClient.PostUsersAuthenticatebynameWithHttpMessagesAsync(payLoad, this.GetTempAuthHeader()))
                            {
                                authResult.Response.EnsureSuccessStatusCode();
                                this.LogApiResult(authResult.Body);
                                var authHeader = this.GetAuthHeader(authResult.Body);
                                newClient.HttpClient.DefaultRequestHeaders.Add("Authorization", authHeader);
                            }

                            break;

                        case 1:

                            this.textServerUserAuth.Text = this.textServerApiKey.Text;
                            newClient.BaseUri = new Uri(this.textServerApiKey.Text);
                            newClient.HttpClient.DefaultRequestHeaders.Add("X-Emby-Token", this.textApiKey.Text);

                            break;
                    }

                    this.AppendLog("\r\nCalling GET /System/Info...");

                    using (var info = await newClient.GetSystemInfoWithHttpMessagesAsync(null, CancellationToken.None))
                    {
                        info.Response.EnsureSuccessStatusCode();
                        this.LogApiResult(info.Body);
                    }

                    this.client = newClient;
                    this.SetControlState();
                    this.AppendLog("\r\nConnected Successfully!");
                }
                catch (Exception ex)
                {
                    this.LogException(ex);
                }
            }
        }

        private async void ButtonConnect_Click(object sender, EventArgs e)
        {
            switch (this.tabControlTop.SelectedIndex)
            {
                case 0:
                    await this.Connect();
                    return;
            }
        }

        private void LogApiResult(object obj)
        {
            this.AppendLog(ApiResultLogHeader);
            var serializer = new SerializerBuilder().Build();
            var yaml = serializer.Serialize(obj);
            this.AppendLog(yaml);
        }

        private void LogException(Exception ex)
        {
            var indent = string.Empty;

            do
            {
                this.AppendLog(indent + ex.Message);
                ex = ex.InnerException;
                indent += "    ";
            } while (ex != null);
        }

        private void AppendLog(string message)
        {
            LogHelper.AppendText(this.textBoxLog, "\r\n");
            LogHelper.AppendText(this.textBoxLog, message);
        }

        private void TabControlTop_SelectedIndexChanged(object sender, EventArgs e)
        {
            this.SetControlState();
        }

        private void SetControlState()
        {
            if (!this.IsConnected && this.tabControlTop.SelectedIndex != 0)
            {
                this.tabControlTop.SelectedIndex = 0;
                return;
            }

            var tabs = this.tabControlTop.TabPages;
            for (int i = 1; i < tabs.Count; i++)
            {
                tabs[i].Visible = this.IsConnected;
            }

            if (this.tabControlTop.SelectedIndex == 0)
            {
                this.buttonConnect.Text = this.IsConnected ? "Disconnect" : "Connect";
            }
            else
            {
                this.buttonConnect.Text = "Execute";
            }
        }

        private string GetTempAuthHeader()
        {
            return string.Format("Emby UserId=\"{0}\", Client=\"{1}\", Device=\"{2}\", DeviceId=\"{3}\", Version=\"{4}\", Token=\"{5}\"",
                "somebody", Application.ProductName, Environment.MachineName, DeviceId, Application.ProductVersion, string.Empty);
        }

        private string GetAuthHeader(AuthenticationAuthenticationResult result)
        {
            return string.Format("Emby UserId=\"{0}\", Client=\"{1}\", Device=\"{2}\", DeviceId=\"{3}\", Version=\"{4}\", Token=\"{5}\"",
                result.User.Id, result.SessionInfo.Client, result.SessionInfo.DeviceName, result.SessionInfo.DeviceId,
                Application.ProductVersion, result.AccessToken);
        }
    }
}
