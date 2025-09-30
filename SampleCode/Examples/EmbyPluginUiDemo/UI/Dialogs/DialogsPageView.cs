namespace EmbyPluginUiDemo.UI.Dialogs
{
    using System.Collections.Generic;
    using System.Linq;
    using System.Threading.Tasks;
    using EmbyPluginUiDemo.Model;
    using EmbyPluginUiDemo.UI.ConfigWizard;
    using EmbyPluginUiDemo.UI.ConfigWizard.Start;
    using EmbyPluginUiDemo.UI.DialogFullscreenGrid;
    using EmbyPluginUiDemo.UI.HelpDialog;
    using EmbyPluginUiDemo.UI.SelectDialog;
    using EmbyPluginUiDemo.UIBaseClasses.Views;
    using MediaBrowser.Common;
    using MediaBrowser.Controller.Entities;
    using MediaBrowser.Controller.Library;
    using MediaBrowser.Model.Logging;
    using MediaBrowser.Model.Plugins;
    using MediaBrowser.Model.Plugins.UI.Views;

    internal class DialogsPageView : PluginPageView
    {
        private readonly PluginInfo pluginInfo;
        private readonly ILogger logger;
        private readonly IApplicationHost appHost;
        private List<GridDataItem> itemList;

        public DialogsPageView(PluginInfo pluginInfo, ILogger logger, IApplicationHost appHost)
        : base(pluginInfo.Id)
        {
            this.pluginInfo = pluginInfo;
            this.logger = logger;
            this.appHost = appHost;
            this.ContentData = new DialogsUI();
            this.ShowSave = false;
        }

        public DialogsUI DialogsUI => this.ContentData as DialogsUI;

        public override Task<IPluginUIView> RunCommand(string itemId, string commandId, string data)
        {
            switch (commandId)
            {
                case "HelpDialog":

                    var helpDialog = new ConfigHelpView(this.pluginInfo);
                    return Task.FromResult<IPluginUIView>(helpDialog);

                case "ChooseItem":

                    this.LoadData();
                    var newView1 = new SelectDialogView(this.pluginInfo, this.itemList);
                    return Task.FromResult<IPluginUIView>(newView1);

                case "FullScreenDialog":

                    this.LoadData();
                    var newView2 = new FullScreenDialogView(this.pluginInfo, this.itemList);
                    return Task.FromResult<IPluginUIView>(newView2);

                case "ConfigWizard":

                    var demoSetup = new DemoSetup();
                    var wizardManager = new ConfigWizardManager(this.appHost, demoSetup, this.pluginInfo);

                    var newView = new ConfigWizardStartView(wizardManager, this.pluginInfo.Id);
                    return Task.FromResult<IPluginUIView>(newView);
            }

            return base.RunCommand(itemId, commandId, data);
        }

        public override void OnDialogResult(IPluginUIView dialogView, bool completedOk, object data)
        {
            if (dialogView is SelectDialogView dialog && completedOk)
            {
                this.DialogsUI.SelectedItem = dialog.SelectedItem?.Name;
                this.RaiseUIViewInfoChanged();
            }

            base.OnDialogResult(dialogView, completedOk, data);
        }

        private void LoadData()
        {
            if (this.itemList != null)
            {
                return;
            }

            var libraryManager = this.appHost.Resolve<ILibraryManager>();

            var query = new InternalItemsQuery
            {
                IncludeItemTypes = new[] { "Movie", "Episode" },
                Limit = 2000,
            };

            this.itemList = libraryManager
                .GetItemList(query)
                .Select(GridDataItem.FromBaseIte)
                .ToList();
        }
    }
}
