namespace EmbyPluginUiDemo.Storage
{
    using EmbyPluginUiDemo.UI.Basics;
    using EmbyPluginUiDemo.UIBaseClasses.Store;

    using MediaBrowser.Common;
    using MediaBrowser.Model.Logging;

    public class BasicsOptionsStore : SimpleFileStore<BasicsUI>
    {
        public BasicsOptionsStore(IApplicationHost applicationHost, ILogger logger, string pluginFullName)
        : base(applicationHost, logger, pluginFullName)
        {
        }
    }
}
