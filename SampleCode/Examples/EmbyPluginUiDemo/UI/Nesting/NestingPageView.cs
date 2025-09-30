namespace EmbyPluginUiDemo.UI.Nesting
{
    using EmbyPluginUiDemo.UIBaseClasses.Views;

    using MediaBrowser.Model.Plugins;

    internal class NestingPageView : PluginPageView
    {
        public NestingPageView(PluginInfo pluginInfo)
        : base(pluginInfo.Id)
        {
            this.ContentData = new NestingUI();
        }

        public NestingUI NestingUI => this.ContentData as NestingUI;
    }
}
