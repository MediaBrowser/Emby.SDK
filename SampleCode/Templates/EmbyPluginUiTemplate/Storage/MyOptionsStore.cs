using EmbyPluginUiTemplate.UI.Basics;
using EmbyPluginUiTemplate.UIBaseClasses.Store;
using MediaBrowser.Common;
using MediaBrowser.Model.Logging;

namespace EmbyPluginUiTemplate.Storage
{
    public class MyOptionsStore : SimpleFileStore<MainPageUI>
    {
        public MyOptionsStore(IApplicationHost applicationHost, ILogger logger, string pluginFullName)
        : base(applicationHost, logger, pluginFullName)
        {
        }
    }
}
