namespace EmbyPluginUiDemo.UI
{
    using System.Collections.Generic;
    using System.Threading.Tasks;

    using EmbyPluginUiDemo.Storage;
    using EmbyPluginUiDemo.UI.Basics;
    using EmbyPluginUiDemo.UI.ChildCollections;
    using EmbyPluginUiDemo.UI.Conditions;
    using EmbyPluginUiDemo.UI.Constraints;
    using EmbyPluginUiDemo.UI.Lists;
    using EmbyPluginUiDemo.UI.Nesting;
    using EmbyPluginUiDemo.UI.PostbackCalculator;
    using EmbyPluginUiDemo.UI.Selection;
    using EmbyPluginUiDemo.UI.States;
    using EmbyPluginUiDemo.UI.Validation;
    using EmbyPluginUiDemo.UIBaseClasses;

    using MediaBrowser.Controller;
    using MediaBrowser.Model.Plugins;
    using MediaBrowser.Model.Plugins.UI;
    using MediaBrowser.Model.Plugins.UI.Views;

    internal class MainPageController1 : ControllerBase, IHasTabbedUIPages
    {
        private readonly PluginInfo pluginInfo;
        private readonly BasicsOptionsStore basicsOptionsStore;
        private readonly List<IPluginUIPageController> tabPages = new List<IPluginUIPageController>();

        /// <summary>Initializes a new instance of the <see cref="ControllerBase" /> class.</summary>
        /// <param name="pluginInfo">The plugin information.</param>
        /// <param name="applicationHost"></param>
        /// <param name="basicsOptionsStore"></param>
        public MainPageController1(PluginInfo pluginInfo, IServerApplicationHost applicationHost, BasicsOptionsStore basicsOptionsStore)
            : base(pluginInfo.Id)
        {
            this.pluginInfo = pluginInfo;
            this.basicsOptionsStore = basicsOptionsStore;
            this.PageInfo = new PluginPageInfo
                            {
                                Name = "PluginUiDemo1",
                                EnableInMainMenu = true,
                                DisplayName = "Plugin UI Demo 1",
                                MenuIcon = "list_alt",
                                IsMainConfigPage = false,
                            };

            this.tabPages.Add(new TabPageController(pluginInfo, nameof(SelectionPageView), "Selection", e => new SelectionPageView(pluginInfo)));
            this.tabPages.Add(new TabPageController(pluginInfo, nameof(StatesPageView), "States", e => new StatesPageView(pluginInfo)));
            this.tabPages.Add(new TabPageController(pluginInfo, nameof(ConstraintsPageView), "Constraints", e => new ConstraintsPageView(pluginInfo)));
            this.tabPages.Add(new TabPageController(pluginInfo, nameof(ValidationPageView), "Validation", e => new ValidationPageView(pluginInfo)));
            this.tabPages.Add(new TabPageController(pluginInfo, nameof(ConditionsPageView), "Conditions", e => new ConditionsPageView(pluginInfo)));
            this.tabPages.Add(new TabPageController(pluginInfo, nameof(CalcPageView), "Postback", e => new CalcPageView(pluginInfo)));
        }

        public override PluginPageInfo PageInfo { get; }

        public override Task<IPluginUIView> CreateDefaultPageView()
        {
            IPluginUIView view = new BasicsPageView(this.pluginInfo, this.basicsOptionsStore);
            return Task.FromResult(view);
        }

        public IReadOnlyList<IPluginUIPageController> TabPageControllers => this.tabPages.AsReadOnly();
    }
}
