namespace EmbyPluginUiDemo.UI.ChildCollections
{
    using System.Threading.Tasks;
    using Emby.Media.Common.Extensions;
    using EmbyPluginUiDemo.UIBaseClasses.Views;
    using MediaBrowser.Model.Plugins;
    using MediaBrowser.Model.Plugins.UI.Views;

    internal class ChildCollectionsView : PluginPageView
    {
        public ChildCollectionsView(PluginInfo pluginInfo)
        : base(pluginInfo.Id)
        {
            this.ContentData = new ChildCollectionsUI();
        }

        public ChildCollectionsUI ChildCollectionsUI => this.ContentData as ChildCollectionsUI;

        public override bool IsCommandAllowed(string commandKey)
        {
            if (commandKey == "PostBack")
            {
                return true;
            }

            return base.IsCommandAllowed(commandKey);
        }

        public override Task<IPluginUIView> RunCommand(string itemId, string commandId, string data)
        {
            if (commandId == "PostBack")
            {
                this.ChildCollectionsUI.Collection.RemoveAll(e => e.File.IsNullOrEmpty());
                this.ChildCollectionsUI.Collection.Add(new ChildCollectionItem());
                return Task.FromResult((IPluginUIView)this);
            }

            return base.RunCommand(itemId, commandId, data);
        }
    }
}
