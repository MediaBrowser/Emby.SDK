namespace EmbyPluginUiDemo.UI
{
    using System.Collections.Generic;
    using System.Threading.Tasks;

    using EmbyPluginUiDemo.Storage;
    using EmbyPluginUiDemo.UI.Basics;
    using EmbyPluginUiDemo.UI.ButtonsAndLinks;
    using EmbyPluginUiDemo.UI.ChildCollections;
    using EmbyPluginUiDemo.UI.Conditions;
    using EmbyPluginUiDemo.UI.Constraints;
    using EmbyPluginUiDemo.UI.Dialogs;
    using EmbyPluginUiDemo.UI.Lists;
    using EmbyPluginUiDemo.UI.Nesting;
    using EmbyPluginUiDemo.UI.Selection;
    using EmbyPluginUiDemo.UI.States;
    using EmbyPluginUiDemo.UI.Validation;
    using EmbyPluginUiDemo.UIBaseClasses;

    using MediaBrowser.Controller;
    using MediaBrowser.Model.Logging;
    using MediaBrowser.Model.Plugins;
    using MediaBrowser.Model.Plugins.UI;
    using MediaBrowser.Model.Plugins.UI.Views;

    internal class MainPageController2 : ControllerBase, IHasTabbedUIPages
    {
        private readonly PluginInfo pluginInfo;
        private readonly BasicsOptionsStore basicsOptionsStore;
        private readonly List<IPluginUIPageController> tabPages = new List<IPluginUIPageController>();
        private readonly ILogger logger;

        /// <summary>Initializes a new instance of the <see cref="ControllerBase" /> class.</summary>
        /// <param name="pluginInfo">The plugin information.</param>
        /// <param name="applicationHost"></param>
        /// <param name="basicsOptionsStore"></param>
        public MainPageController2(PluginInfo pluginInfo, IServerApplicationHost applicationHost, BasicsOptionsStore basicsOptionsStore)
            : base(pluginInfo.Id)
        {
            this.logger = applicationHost.Resolve<ILogManager>().GetLogger(nameof(MainPageController2));
            this.pluginInfo = pluginInfo;
            this.basicsOptionsStore = basicsOptionsStore;
            this.PageInfo = new PluginPageInfo
                            {
                                Name = "PluginUiDemo2",
                                EnableInMainMenu = true,
                                DisplayName = "Plugin UI Demo 2",
                                MenuIcon = "list_alt",
                                IsMainConfigPage = false,
                            };

            this.tabPages.Add(new TabPageController(pluginInfo, nameof(ListsPageView), "Lists", e => new ListsPageView(pluginInfo, applicationHost)));
            this.tabPages.Add(new TabPageController(pluginInfo, nameof(NestingPageView), "Nested Objects", e => new NestingPageView(pluginInfo)));
            this.tabPages.Add(new TabPageController(pluginInfo, nameof(ChildCollectionsView), "Child Collections", e => new ChildCollectionsView(pluginInfo)));
            this.tabPages.Add(new TabPageController(pluginInfo, nameof(DialogsPageView), "Dialogs and Wizards", e => new DialogsPageView(pluginInfo, this.logger, applicationHost)));
        }

        public override PluginPageInfo PageInfo { get; }

        public override Task<IPluginUIView> CreateDefaultPageView()
        {
            IPluginUIView view = new ButtonsAndLinksPageView(this.pluginInfo, this.logger);
            return Task.FromResult(view);
        }

        public IReadOnlyList<IPluginUIPageController> TabPageControllers => this.tabPages.AsReadOnly();
    }
}
