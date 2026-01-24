using System.Linq;
using MediaBrowser.Common;
using MediaBrowser.Controller.Base;
using MediaBrowser.Model.System;

namespace EmbyPluginSimpleUiTemplate.Common
{
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
