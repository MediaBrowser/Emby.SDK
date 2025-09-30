namespace EmbyPluginUiDemo.UI.Basics
{
    using System.Threading.Tasks;
    using EmbyPluginUiDemo.Storage;
    using EmbyPluginUiDemo.UIBaseClasses.Views;

    using MediaBrowser.Model.Plugins;
    using MediaBrowser.Model.Plugins.UI.Views;

    internal class BasicsPageView : PluginPageView
    {
        private readonly BasicsOptionsStore store;

        public BasicsPageView(PluginInfo pluginInfo, BasicsOptionsStore store)
        : base(pluginInfo.Id)
        {
            this.store = store;
            this.ContentData = store.GetOptions();
        }

        public BasicsUI BasicsUI => this.ContentData as BasicsUI;

        public override Task<IPluginUIView> OnSaveCommand(string itemId, string commandId, string data)
        {
            this.store.SetOptions(this.BasicsUI);
            return base.OnSaveCommand(itemId, commandId, data);
        }
    }
}
