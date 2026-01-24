using System.Threading.Tasks;
using EmbyPluginUiTemplate.Storage;
using EmbyPluginUiTemplate.UI.Basics;
using EmbyPluginUiTemplate.UIBaseClasses;
using MediaBrowser.Controller;
using MediaBrowser.Model.Plugins;
using MediaBrowser.Model.Plugins.UI.Views;

namespace EmbyPluginUiTemplate.UI
{
    internal class MyPageController : ControllerBase
    {
        private readonly PluginInfo pluginInfo;
        private readonly MyOptionsStore myOptionsStore;

        /// <summary>Initializes a new instance of the <see cref="ControllerBase" /> class.</summary>
        /// <param name="pluginInfo">The plugin information.</param>
        /// <param name="applicationHost"></param>
        /// <param name="myOptionsStore"></param>
        public MyPageController(PluginInfo pluginInfo, IServerApplicationHost applicationHost, MyOptionsStore myOptionsStore)
            : base(pluginInfo.Id)
        {
            this.pluginInfo = pluginInfo;
            this.myOptionsStore = myOptionsStore;
            this.PageInfo = new PluginPageInfo
                            {
                                Name = "MyPluginMainPage",
                                EnableInMainMenu = true,
                                DisplayName = "My Plugin Config",
                                MenuIcon = "list_alt",
                                IsMainConfigPage = true,
                            };
        }

        public override PluginPageInfo PageInfo { get; }

        public override Task<IPluginUIView> CreateDefaultPageView()
        {
            IPluginUIView view = new MainPageView(this.pluginInfo, this.myOptionsStore);
            return Task.FromResult(view);
        }
    }
}
