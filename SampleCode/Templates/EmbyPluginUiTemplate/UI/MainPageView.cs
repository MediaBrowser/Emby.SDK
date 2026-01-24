using System.Threading.Tasks;
using Emby.Media.Common.Extensions;
using Emby.Web.GenericEdit.Elements;
using EmbyPluginUiTemplate.Storage;
using EmbyPluginUiTemplate.UIBaseClasses.Views;
using MediaBrowser.Controller.Tasks;
using MediaBrowser.Model.Logging;
using MediaBrowser.Model.Plugins;
using MediaBrowser.Model.Plugins.UI.Views;

namespace EmbyPluginUiTemplate.UI.Basics
{
    internal class MainPageView : PluginPageView
    {
        private readonly MyOptionsStore store;

        public MainPageView(PluginInfo pluginInfo, MyOptionsStore store)
        : base(pluginInfo.Id)
        {
            this.store = store;
            this.ContentData = store.GetOptions();
        }

        public MainPageUI MainPageUi => this.ContentData as MainPageUI;

        public override Task<IPluginUIView> RunCommand(string itemId, string commandId, string data)
        {
            switch (commandId)
            {
                case "ActionButton1":
                    Task.Run(this.HandleActionButton1).FireAndForget(new NullLogger());
                    return Task.FromResult<IPluginUIView>(this);
            }

            return base.RunCommand(itemId, commandId, data);
        }

        private async Task HandleActionButton1()
        {
            this.MainPageUi.ActionButton1.IsEnabled = false;
            this.MainPageUi.StatusItem1.StatusText = "Work in progress...";
            this.MainPageUi.StatusItem1.Status = ItemStatus.InProgress;
            this.RaiseUIViewInfoChanged();

            await Task.Delay(5.seconds());

            this.MainPageUi.ActionButton1.IsEnabled = true;
            this.MainPageUi.StatusItem1.StatusText = "Operation completed successfully";
            this.MainPageUi.StatusItem1.Status = ItemStatus.Succeeded;
            this.RaiseUIViewInfoChanged();
        }

        public override Task<IPluginUIView> OnSaveCommand(string itemId, string commandId, string data)
        {
            this.store.SetOptions(this.MainPageUi);
            return base.OnSaveCommand(itemId, commandId, data);
        }
    }
}
