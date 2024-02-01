namespace EmbyPluginUiDemo.UI
{
    using System;
    using System.Threading.Tasks;

    using EmbyPluginUiDemo.UIBaseClasses;

    using MediaBrowser.Model.Plugins;
    using MediaBrowser.Model.Plugins.UI.Views;

    internal class TabPageController : ControllerBase
    {
        private readonly PluginInfo pluginInfo;
        private readonly Func<PluginInfo, IPluginUIView> factoryFunc;

        /// <summary>Initializes a new instance of the <see cref="ControllerBase" /> class.</summary>
        /// <param name="pluginInfo">The plugin information.</param>
        /// <param name="name">The name.</param>
        /// <param name="displayName">The display name.</param>
        /// <param name="factoryFunc">The factory function.</param>
        public TabPageController(PluginInfo pluginInfo, string name, string displayName, Func<PluginInfo, IPluginUIView> factoryFunc)
            : base(pluginInfo.Id)
        {
            this.pluginInfo = pluginInfo;
            this.factoryFunc = factoryFunc;
            this.PageInfo = new PluginPageInfo
                            {
                                Name = name,
                                DisplayName = displayName,
                            };
        }

        public override PluginPageInfo PageInfo { get; }

        public override Task<IPluginUIView> CreateDefaultPageView()
        {
            var view = this.factoryFunc(this.pluginInfo);
            return Task.FromResult(view);
        }
    }
}
