namespace EmbyPluginSimpleUi.Common
{
    using System.Linq;
    using EmbyPluginSimpleUI;
    using MediaBrowser.Common;
    using MediaBrowser.Controller.Base;
    using MediaBrowser.Model.Logging;
    using MediaBrowser.Model.System;

    public abstract class CommonBase : CommonBaseCore
    {
        private MyPlugin myPlugin;

        protected CommonBase(IServiceRoot serviceRoot, string logName = null)
            : base(serviceRoot, logName)
        {
        }

        protected MyPluginOptions Options => this.Plugin.Options;

        protected MyPlugin Plugin
        {
            get
            {
                if (this.myPlugin == null)
                {
                    this.myPlugin = this.GetService<IApplicationHost>().Plugins.OfType<MyPlugin>().FirstOrDefault();
                    if (this.myPlugin == null)
                    {
                        throw this.GetEx(@"The {0} plugin is not loaded", MyPlugin.PluginName);
                    }
                }

                return this.myPlugin;
            }
        }
    }
}
