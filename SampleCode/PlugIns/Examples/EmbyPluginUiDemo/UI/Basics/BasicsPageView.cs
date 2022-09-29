namespace EmbyPluginUiDemo.UI.Basics
{
    using EmbyPluginUiDemo.UIBaseClasses.Views;

    using MediaBrowser.Model.Plugins;

    internal class BasicsPageView : PluginPageView
    {
        public BasicsPageView(PluginInfo pluginInfo)
        : base(pluginInfo.Id)
        {
            this.ContentData = new BasicsUI();
        }

        public BasicsUI BasicsUI => this.ContentData as BasicsUI;
    }
}
