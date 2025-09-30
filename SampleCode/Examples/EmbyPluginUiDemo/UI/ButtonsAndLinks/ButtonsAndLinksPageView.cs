namespace EmbyPluginUiDemo.UI.ButtonsAndLinks
{
    using System.Linq;
    using System.Threading.Tasks;
    using Emby.Media.Common.Extensions;
    using Emby.Web.GenericEdit.Elements;
    using EmbyPluginUiDemo.UIBaseClasses.Views;
    using MediaBrowser.Controller.Tasks;
    using MediaBrowser.Model.Logging;
    using MediaBrowser.Model.Plugins;
    using MediaBrowser.Model.Plugins.UI.Views;

    internal class ButtonsAndLinksPageView : PluginPageView
    {
        private readonly ILogger logger;

        public ButtonsAndLinksPageView(PluginInfo pluginInfo, ILogger logger)
        : base(pluginInfo.Id)
        {
            this.logger = logger;
            this.ContentData = new ButtonsAndLinksUI();
            this.ShowSave = false;
        }

        public ButtonsAndLinksUI ButtonsUI => this.ContentData as ButtonsAndLinksUI;

        public override Task<IPluginUIView> RunCommand(string itemId, string commandId, string data)
        {
            switch (commandId)
            {
                case "Button4Action":
                    this.ButtonsUI.Button5.IsVisible = !this.ButtonsUI.Button5.IsVisible;
                    return Task.FromResult<IPluginUIView>(this);
                case "ActionButton1":
                    Task.Run(this.HandleActionButton1).FireAndForget(this.logger);
                    return Task.FromResult<IPluginUIView>(this);
                case "ActionButton2":
                    Task.Run(this.HandleActionButton2).FireAndForget(this.logger);
                    return Task.FromResult<IPluginUIView>(this);
                case "Donothing":
                    return Task.FromResult<IPluginUIView>(this);
            }
            return base.RunCommand(itemId, commandId, data);
        }

        private async Task HandleActionButton1()
        {
            this.ButtonsUI.ActionButton1.IsEnabled = false;
            this.ButtonsUI.StatusItem1.StatusText = "Work in progress...";
            this.ButtonsUI.StatusItem1.Status = ItemStatus.InProgress;
            this.RaiseUIViewInfoChanged();

            await Task.Delay(5.seconds());

            this.ButtonsUI.ActionButton1.IsEnabled = true;
            this.ButtonsUI.StatusItem1.StatusText = "Operation failed";
            this.ButtonsUI.StatusItem1.Status = ItemStatus.Failed;
            this.RaiseUIViewInfoChanged();
        }

        private async Task HandleActionButton2()
        {
            var listItem = this.ButtonsUI.GenericItemList1.First();

            this.ButtonsUI.ActionButton2.IsEnabled = false;
            listItem.SecondaryText = "Work in progress...";
            listItem.Status = ItemStatus.InProgress;
            listItem.HasPercentage = true;
            this.RaiseUIViewInfoChanged();

            for (int i = 0; i < 50; i++)
            {
                listItem.PercentComplete = 100 / 50 * i;
                this.RaiseUIViewInfoChanged();
                await Task.Delay(100.ms());
            }

            this.ButtonsUI.ActionButton2.IsEnabled = true;
            listItem.HasPercentage = false;
            listItem.SecondaryText = "Operation completed successfully";
            listItem.Status = ItemStatus.Succeeded;
            this.RaiseUIViewInfoChanged();
        }
    }
}
