// <copyright file="CommonBase.cs" company="Emby LLC">
// Copyright © Emby LLC. All rights reserved.
// </copyright>

namespace EmbyFileBrowser.Common
{
    using System.Globalization;
    using System.Linq;
    using System.Resources;

    using EmbyFileBrowser.Properties;

    using MediaBrowser.Common;
    using MediaBrowser.Controller.Base;
    using MediaBrowser.Model.Logging;
    using MediaBrowser.Model.System;

    public abstract class CommonBase : CommonBaseCore
    {
        private static readonly ResourceManager PassThroughResourceManager;
        private FileBrowserPlugin plugin;

        static CommonBase()
        {
            PassThroughResourceManager = new ResourceManager(Resources.ResourceManager.BaseName, typeof(Resources).Assembly);
            Resources.Culture = CultureInfo.CurrentUICulture;
        }

        protected CommonBase(IServiceRoot serviceRoot, ILogger logger)
            : base(serviceRoot, logger)
        {
        }

        protected CommonBase(IServiceRoot serviceRoot, string logName = null)
            : base(serviceRoot, logName)
        {
        }

        internal FileBrowserPlugin Plugin
        {
            get
            {
                if (this.plugin == null)
                {
                    var plugin = this.GetService<IApplicationHost>().Plugins.OfType<FileBrowserPlugin>().FirstOrDefault();
                    if (plugin == null)
                    {
                        throw this.GetEx(@"The {0} plugin is not loaded", FileBrowserPlugin.PluginName);
                    }

                    this.plugin = plugin;
                }

                return this.plugin;
            }
        }

        protected override ResourceManager ResourceManager => PassThroughResourceManager;
    }
}
