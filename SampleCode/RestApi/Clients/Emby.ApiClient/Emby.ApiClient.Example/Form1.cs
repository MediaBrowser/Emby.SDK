namespace Emby.RestClient.SampleApp
{
    using System;
    using System.Threading.Tasks;
    using System.Windows.Forms;

    using Emby.ApiClient.Api;
    using Emby.ApiClient.Client;
    using Emby.ApiClient.Client.Authentication;

    using RestSharp;

    using YamlDotNet.Serialization;

    public partial class Form1 : Form
    {
        private const string ApiResultLogHeader = "\r\nREST API Result:\r\n";
        private const string DeviceId = "05188728-E1DC-49C8-A580-AB0059D9EEC1";
        private ApiClient apiClient;

        public Form1()
        {
            this.InitializeComponent();
        }

        public bool IsConnected
        {
            get { return this.apiClient != null; }
        }

        protected override void OnLoad(EventArgs e)
        {
            base.OnLoad(e);
            this.SetControlState();
        }

        private async Task Connect()
        {
            if (this.apiClient != null)
            {
                this.apiClient = null;
                this.SetControlState();
                return;
            }

            using (new WaitHelper(this))
            {
                // Allow for immediate UI state change
                await Task.Delay(1);

                try
                {
                    ApiClient newApiClient;

                    switch (this.tabControlAuth.SelectedIndex)
                    {
                        case 0:

                            var authInfo = new EmbyAuthInfo(this.textUserName.Text, Application.ProductName, Environment.MachineName, DeviceId, Application.ProductVersion);
                            var embyAuthenticator = new EmbyPasswordAuthenticator(authInfo, this.textUserName.Text, this.textPassword.Text);

                            newApiClient = new ApiClient(this.textServer0.Text, embyAuthenticator);
                            this.textServer1.Text = this.textServer0.Text;

                            break;

                        case 1:

                            var embyAuthenticator1 = new EmbyApiKeyAuthenticator(this.textApiKey.Text);

                            newApiClient = new ApiClient(this.textServer1.Text, embyAuthenticator1);
                            this.textServer0.Text = this.textServer1.Text;

                            break;

                        default:
                            throw new ArgumentException("Invalid Auth mode");
                    }

                    this.AppendLog("\r\nCalling GET /System/Info...");

                    var systemService = new SystemServiceApi(newApiClient);

                    var result = await systemService.GetSystemInfo();

                    result.ThrowIfError();

                    this.LogApiResult(result.Data);

                    this.apiClient = newApiClient;
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
                this.buttonConnect.Text = @"Execute";
            }
        }
    }
}
