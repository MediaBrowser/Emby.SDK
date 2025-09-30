namespace Emby.RestClient.SampleApp
{
    using System;
    using System.Windows.Forms;

    internal class WaitHelper : IDisposable
    {
        private readonly Form1 form1;

        public WaitHelper(Form1 form1)
        {
            this.form1 = form1;
            this.EnDisable(false);
        }

        private void EnDisable(bool enable)
        {
            if (this.form1.InvokeRequired)
            {
                this.form1.BeginInvoke(new Action(() => this.EnDisable(enable)));
                return;
            }

            this.form1.buttonConnect.Enabled = enable;
            this.form1.tabControlTop.Enabled = enable;

            this.form1.UseWaitCursor = !enable;
            Application.UseWaitCursor = !enable;
        }

        public void Dispose()
        {
            this.EnDisable(true);
        }
    }
}
