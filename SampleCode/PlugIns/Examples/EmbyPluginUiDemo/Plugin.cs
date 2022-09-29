// <copyright file="Plugin.cs" company="Emby LLC">
// Copyright © 2022 - Emby LLC. All rights reserved.
// </copyright>

namespace EmbyPluginUiDemo
{
    using System;
    using System.Collections.Generic;
    using System.IO;

    using EmbyPluginUiDemo.UI;
    using EmbyPluginUiDemo.UI.Basics;

    using MediaBrowser.Common.Plugins;
    using MediaBrowser.Controller;
    using MediaBrowser.Model.Drawing;
    using MediaBrowser.Model.Plugins;
    using MediaBrowser.Model.Plugins.UI;

    /// <summary>
    /// The plugin.
    /// </summary>
    public class Plugin : BasePlugin, IHasThumbImage, IHasUIPages, IHasPluginConfiguration
    {
        private readonly IServerApplicationHost applicationHost;

        /// <summary>The Plugin ID.</summary>
        private readonly Guid id = new Guid("507C5494-B59E-4E1D-9F46-33DDB5E94E87");

        /// <summary>Initializes a new instance of the <see cref="Plugin" /> class.</summary>
        /// <param name="applicationHost">The application host.</param>
        public Plugin(IServerApplicationHost applicationHost)
        {
            this.applicationHost = applicationHost;
        }

        /// <summary>Gets the description.</summary>
        /// <value>The description.</value>
        public override string Description => "This plugin demonstrates the new Emby Plugin UI features";

        /// <summary>Gets the unique id.</summary>
        /// <value>The unique id.</value>
        public override Guid Id => this.id;

        /// <summary>Gets the name of the plugin</summary>
        /// <value>The name.</value>
        public override string Name => "Plugin UI Demo";

        /// <summary>Gets the thumb image format.</summary>
        /// <value>The thumb image format.</value>
        public ImageFormat ThumbImageFormat => ImageFormat.Jpg;

        /// <summary>Gets the thumb image.</summary>
        /// <returns>An image stream.</returns>
        public Stream GetThumbImage()
        {
            var type = this.GetType();
            return type.Assembly.GetManifestResourceStream(type.Namespace + ".PluginUiThumb.jpg");
        }

        private List<IPluginUIPageController> pages;

        public IReadOnlyCollection<IPluginUIPageController> UIPageControllers
        {
            get
            {
                if (this.pages == null)
                {
                    this.pages = new List<IPluginUIPageController>();

                    this.pages.Add(new MainPageController(this.GetPluginInfo(), this.applicationHost));
                }

                return this.pages.AsReadOnly();
            }
        }

        /// <summary>
        /// Gets the type of configuration this plugin uses
        /// </summary>
        /// <value>The type of the configuration.</value>
        public Type ConfigurationType => typeof(BasicsUI);

        /// <summary>
        /// Completely overwrites the current configuration with a new copy
        /// Returns true or false indicating success or failure
        /// </summary>
        /// <param name="configuration">The configuration.</param>
        /// <exception cref="System.ArgumentNullException">configuration</exception>
        public void UpdateConfiguration(BasePluginConfiguration configuration)
        {
        }

        /// <summary>
        /// Gets the plugin's configuration
        /// </summary>
        /// <value>The configuration.</value>
        public BasePluginConfiguration Configuration { get; } = new BasePluginConfiguration();

        public void SetStartupInfo(Action<string> directoryCreateFn)
        {
        }
    }
}