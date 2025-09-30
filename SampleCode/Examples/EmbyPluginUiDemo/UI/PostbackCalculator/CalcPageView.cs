namespace EmbyPluginUiDemo.UI.PostbackCalculator
{
    using System;
    using System.Threading.Tasks;
    using EmbyPluginUiDemo.UIBaseClasses.Views;
    using MediaBrowser.Model.Plugins;
    using MediaBrowser.Model.Plugins.UI.Views;

    internal class CalcPageView : PluginPageView
    {
        public const string PostBackCommand = nameof(PostBackCommand);

        public CalcPageView(PluginInfo pluginInfo)
        : base(pluginInfo.Id)
        {
            this.ContentData = new CalcDialogUI();
        }

        public CalcDialogUI CalcDialogUI => this.ContentData as CalcDialogUI;

        public override Task<IPluginUIView> RunCommand(string itemId, string commandId, string data)
        {
            if (commandId == PostBackCommand)
            {
                this.Calculate();
                return Task.FromResult((IPluginUIView)this);
            }

            return base.RunCommand(itemId, commandId, data);
        }

        private void Calculate()
        {
            var ui = this.CalcDialogUI;
            ui.ErrorText = null;

            try
            {
                switch (ui.Operation)
                {
                    case CalcDialogUI.OperationType.Add:
                        ui.Result = ui.Operand1 + ui.Operand2;
                        break;
                    case CalcDialogUI.OperationType.Subtract:
                        ui.Result = ui.Operand1 - ui.Operand2;
                        break;
                    case CalcDialogUI.OperationType.Multiply:
                        ui.Result = ui.Operand1 * ui.Operand2;
                        break;
                    case CalcDialogUI.OperationType.Divide:
                        ui.Result = (double)ui.Operand1 / ui.Operand2;

                        if (double.IsNaN(ui.Result))
                        {
                            ui.Result = 0;
                            throw new Exception("Result is NaN!");
                        }

                        if (double.IsInfinity(ui.Result))
                        {
                            ui.Result = 0;
                            throw new Exception("Result is infinity!");
                        }
                        break;
                    default:
                        throw new ArgumentOutOfRangeException();
                }
            }
            catch (Exception ex)
            {
                ui.ErrorText = ex.Message;
            }
        }
    }
}
