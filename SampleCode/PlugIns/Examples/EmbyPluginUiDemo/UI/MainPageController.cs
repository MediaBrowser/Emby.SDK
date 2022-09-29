namespace EmbyPluginUiDemo.UI
{
    using System.Collections.Generic;
    using System.Threading.Tasks;

    using EmbyPluginUiDemo.UI.Basics;
    using EmbyPluginUiDemo.UI.CalcDialog;
    using EmbyPluginUiDemo.UI.Conditions;
    using EmbyPluginUiDemo.UI.Constraints;
    using EmbyPluginUiDemo.UI.Lists;
    using EmbyPluginUiDemo.UI.Nesting;
    using EmbyPluginUiDemo.UI.Selection;
    using EmbyPluginUiDemo.UI.States;
    using EmbyPluginUiDemo.UI.Validation;
    using EmbyPluginUiDemo.UIBaseClasses;

    using MediaBrowser.Controller;
    using MediaBrowser.Model.Plugins;
    using MediaBrowser.Model.Plugins.UI;
    using MediaBrowser.Model.Plugins.UI.Views;

    internal class MainPageController : ControllerBase, IHasTabbedUIPages
    {
        private readonly PluginInfo pluginInfo;
        private readonly List<IPluginUIPageController> tabPages = new List<IPluginUIPageController>();

        /// <summary>Initializes a new instance of the <see cref="ControllerBase" /> class.</summary>
        /// <param name="pluginInfo">The plugin information.</param>
        /// <param name="applicationHost"></param>
        public MainPageController(PluginInfo pluginInfo, IServerApplicationHost applicationHost)
            : base(pluginInfo.Id)
        {
            this.pluginInfo = pluginInfo;
            this.PageInfo = new PluginPageInfo
                            {
                                Name = "PluginUiDemo",
                                EnableInMainMenu = true,
                                DisplayName = "Plugin UI Demo",
                                MenuIcon = "list_alt",
                                IsMainConfigPage = false,
                            };

            this.tabPages.Add(new TabPageController(pluginInfo, nameof(SelectionPageView), "Selection", e => new SelectionPageView(pluginInfo)));
            this.tabPages.Add(new TabPageController(pluginInfo, nameof(ListsPageView), "Lists", e => new ListsPageView(pluginInfo, applicationHost)));
            this.tabPages.Add(new TabPageController(pluginInfo, nameof(StatesPageView), "States", e => new StatesPageView(pluginInfo)));
            this.tabPages.Add(new TabPageController(pluginInfo, nameof(ConstraintsPageView), "Constraints", e => new ConstraintsPageView(pluginInfo)));
            this.tabPages.Add(new TabPageController(pluginInfo, nameof(NestingPageView), "Nested Objects", e => new NestingPageView(pluginInfo)));
            this.tabPages.Add(new TabPageController(pluginInfo, nameof(ConditionsPageView), "Conditions", e => new ConditionsPageView(pluginInfo)));
            this.tabPages.Add(new TabPageController(pluginInfo, nameof(CalcPageView), "Postback", e => new CalcPageView(pluginInfo)));
            this.tabPages.Add(new TabPageController(pluginInfo, nameof(ValidationPageView), "Validation", e => new ValidationPageView(pluginInfo)));
        }

        public override PluginPageInfo PageInfo { get; }

        public override Task<IPluginUIView> CreateDefaultPageView()
        {
            IPluginUIView view = new BasicsPageView(this.pluginInfo);
            return Task.FromResult(view);
        }

        public IReadOnlyList<IPluginUIPageController> TabPageControllers => this.tabPages.AsReadOnly();
    }
}
