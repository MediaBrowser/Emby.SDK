namespace EmbyPluginUiDemo.UI.Lists
{
    using EmbyPluginUiDemo.UIBaseClasses.Views;

    using MediaBrowser.Controller;
    using MediaBrowser.Controller.Library;
    using MediaBrowser.Model.Activity;
    using MediaBrowser.Model.Plugins;

    internal class ListsPageView : PluginPageView
    {
        public ListsPageView(PluginInfo pluginInfo, IServerApplicationHost applicationHost)
        : base(pluginInfo.Id)
        {
            this.ContentData = new ListsUI();
            this.ListsUI.CreateListItems(applicationHost.Resolve<IActivityManager>(), applicationHost.Resolve<ILibraryManager>());
        }

        public ListsUI ListsUI => this.ContentData as ListsUI;
    }
}
