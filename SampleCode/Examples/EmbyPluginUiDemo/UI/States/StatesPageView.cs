namespace EmbyPluginUiDemo.UI.States
{
    using EmbyPluginUiDemo.UIBaseClasses.Views;

    using MediaBrowser.Model.Plugins;

    internal class StatesPageView : PluginPageView
    {
        public StatesPageView(PluginInfo pluginInfo)
        : base(pluginInfo.Id)
        {
            this.ContentData = new StatesUI();
        }

        public StatesUI StatesUI => this.ContentData as StatesUI;
    }
}
