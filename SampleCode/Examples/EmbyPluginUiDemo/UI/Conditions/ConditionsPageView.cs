namespace EmbyPluginUiDemo.UI.Conditions
{
    using EmbyPluginUiDemo.UI.Basics;
    using EmbyPluginUiDemo.UIBaseClasses.Views;

    using MediaBrowser.Model.Plugins;

    internal class ConditionsPageView : PluginPageView
    {
        public ConditionsPageView(PluginInfo pluginInfo)
        : base(pluginInfo.Id)
        {
            this.ContentData = new ConditionsUI();
        }

        public ConditionsUI ConditionsUI => this.ContentData as ConditionsUI;
    }
}
