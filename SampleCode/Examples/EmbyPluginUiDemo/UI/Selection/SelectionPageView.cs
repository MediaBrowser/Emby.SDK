namespace EmbyPluginUiDemo.UI.Selection
{
    using EmbyPluginUiDemo.UIBaseClasses.Views;

    using MediaBrowser.Model.Plugins;

    internal class SelectionPageView : PluginPageView
    {
        public SelectionPageView(PluginInfo pluginInfo)
        : base(pluginInfo.Id)
        {
            this.ContentData = new SelectionUI();
        }

        public SelectionUI SelectionUI => this.ContentData as SelectionUI;
    }
}
