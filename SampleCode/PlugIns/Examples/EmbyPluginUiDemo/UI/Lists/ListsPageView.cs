namespace EmbyPluginUiDemo.UI.Lists
{
    using System.Threading.Tasks;

    using EmbyPluginUiDemo.UIBaseClasses.Views;

    using MediaBrowser.Controller;
    using MediaBrowser.Controller.Library;
    using MediaBrowser.Controller.Persistence;
    using MediaBrowser.Model.Activity;
    using MediaBrowser.Model.Plugins;
    using MediaBrowser.Model.Plugins.UI.Views;

    internal class ListsPageView : PluginPageView
    {
        private readonly IServerApplicationHost applicationHost;

        public const string PostBackCommand = nameof(PostBackCommand);

        public ListsPageView(PluginInfo pluginInfo, IServerApplicationHost applicationHost)
        : base(pluginInfo.Id)
        {
            this.applicationHost = applicationHost;
            this.ContentData = new ListsUI();
            this.ListsUI.CreateListItems(applicationHost.Resolve<IActivityManager>(), applicationHost.Resolve<ILibraryManager>(), applicationHost.Resolve<IItemRepository>());
        }

        public ListsUI ListsUI => this.ContentData as ListsUI;

        public override bool IsCommandAllowed(string commandKey)
        {
            switch (commandKey)
            {
                case PostBackCommand:
                    return true;
            }
            return base.IsCommandAllowed(commandKey);
        }

        public override Task<IPluginUIView> RunCommand(string itemId, string commandId, string data)
        {
            switch (commandId)
            {
                case PostBackCommand:
                    this.ListsUI.CreateListItems(this.applicationHost.Resolve<IActivityManager>(), this.applicationHost.Resolve<ILibraryManager>(), this.applicationHost.Resolve<IItemRepository>());
                    return Task.FromResult<IPluginUIView>(this);
            }

            return base.RunCommand(itemId, commandId, data);
        }
    }
}
