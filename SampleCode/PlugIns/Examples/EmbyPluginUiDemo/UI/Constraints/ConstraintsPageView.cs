namespace EmbyPluginUiDemo.UI.Constraints
{
    using EmbyPluginUiDemo.UIBaseClasses.Views;

    using MediaBrowser.Model.Plugins;

    internal class ConstraintsPageView : PluginPageView
    {
        public ConstraintsPageView(PluginInfo pluginInfo)
        : base(pluginInfo.Id)
        {
            this.ContentData = new ConstraintsUI();
        }

        public ConstraintsUI ConstraintsUI => this.ContentData as ConstraintsUI;
    }
}
