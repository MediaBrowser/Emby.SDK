namespace Emby.RestClient.SampleApp
{
    using System;
    using System.Threading.Tasks;
    using System.Windows.Forms;
    using EmbyClient.Dotnet.Api;
    using EmbyClient.Dotnet.Client;
    using EmbyClient.Dotnet.Model;
    using YamlDotNet.Serialization;

    public partial class Form1 : Form
    {
        private const string ApiResultLogHeader = "\r\nREST API Result:\r\n";
        private const string DeviceId = "05188728-E1DC-49C8-A580-AB0059D9EEC1";
        private Configuration apiConfiguration;

        public Form1()
        {
            this.InitializeComponent();
        }

        public bool IsConnected
        {
            get { return this.apiConfiguration != null; }
        }

        protected override void OnLoad(EventArgs e)
        {
            base.OnLoad(e);
            this.SetControlState();
        }

        private async Task Connect()
        {
            if (this.apiConfiguration != null)
            {
                this.apiConfiguration = null;
                this.SetControlState();
                return;
            }

            using (new WaitHelper(this))
            {
                // Allow for immediate UI state change
                await Task.Delay(1);

                try
                {
                    var newConfig = new Configuration();

                    switch (this.tabControlAuth.SelectedIndex)
                    {
                        case 0:

                            this.textServerApiKey.Text = this.textServerUserAuth.Text;
                            newConfig.BasePath = this.textServerUserAuth.Text;

                            this.AppendLog("\r\nCalling POST /Users/AuthenticateByName...");

                            var payLoad = new AuthenticateUserByName(this.textUserName.Text, this.textPassword.Text);
                            var userClient = new UserServiceApi(newConfig);

                            var authResult = await userClient.PostUsersAuthenticatebynameAsync(payLoad, this.GetTempAuthHeader());
                                this.LogApiResult(authResult);
                                var authHeader = this.GetAuthHeader(authResult);
                                newConfig.DefaultHeader.Add("Authorization", authHeader);

                            break;

                        case 1:

                            this.textServerUserAuth.Text = this.textServerApiKey.Text;
                            newConfig.BasePath = this.textServerApiKey.Text;
                            newConfig.DefaultHeader.Add("X-Emby-Token", this.textApiKey.Text);

                            break;
                    }

                    this.AppendLog("\r\nCalling GET /System/Info...");

                    var systemService = new SystemServiceApi(newConfig);

                    var info = await systemService.GetSystemInfoAsync();
                        this.LogApiResult(info);

                    this.apiConfiguration = newConfig;
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
                result.User.Id, result.SessionInfo._Client, result.SessionInfo.DeviceName, result.SessionInfo.DeviceId,
                Application.ProductVersion, result.AccessToken);
        }
    }
}
