using System;
using System.Collections.Generic;
using System.IO;
using EmbyPluginUiTemplate.Storage;
using EmbyPluginUiTemplate.UI;
using EmbyPluginUiTemplate.UI.Basics;
using MediaBrowser.Common.Plugins;
using MediaBrowser.Controller;
using MediaBrowser.Model.Drawing;
using MediaBrowser.Model.Logging;
using MediaBrowser.Model.Plugins;
using MediaBrowser.Model.Plugins.UI;

namespace EmbyPluginUiTemplate
{
    /// <summary>
    /// The plugin.
    /// </summary>
    public class Plugin : BasePlugin, IHasThumbImage, IHasUIPages, IHasPluginConfiguration
    {
        private readonly IServerApplicationHost applicationHost;

        // IMPORTANT: Update this GUID when copying this code to create a new plugin
        /// <summary>The Plugin ID.</summary>
        private readonly Guid id = new Guid("11111111-1111-1111-1111-111111111111");

        private readonly ILogger logger;
        private readonly MyOptionsStore myOptionsStore;

        private List<IPluginUIPageController> pages;

        /// <summary>Initializes a new instance of the <see cref="Plugin" /> class.</summary>
        /// <param name="applicationHost">The application host.</param>
        /// <param name="logManager">The log manager.</param>
        public Plugin(IServerApplicationHost applicationHost, ILogManager logManager)
        {
            this.applicationHost = applicationHost;
            this.logger = logManager.GetLogger(this.Name);
            this.myOptionsStore = new MyOptionsStore(applicationHost, this.logger, this.Name);
        }

        // IMPORTANT: Update the Name and Description when copying this code to create a new plugin
        /// <summary>Gets the name of the plugin</summary>
        /// <value>The name.</value>
        public override sealed string Name => "MY Plugin Name";

        /// <summary>Gets the description.</summary>
        /// <value>The description.</value>
        public override string Description => "My Plugin Description";

        /// <summary>Gets the unique id.</summary>
        /// <value>The unique id.</value>
        public override Guid Id => this.id;

        /// <summary>Gets the thumb image format.</summary>
        /// <value>The thumb image format.</value>
        public ImageFormat ThumbImageFormat => ImageFormat.Jpg;

        // IMPORTANT: Update with your own image. The Build Action for the image must be set to 'Embedded Resource'
        /// <summary>Gets the thumb image.</summary>
        /// <returns>An image stream.</returns>
        public Stream GetThumbImage()
        {
            var type = this.GetType();
            return type.Assembly.GetManifestResourceStream(type.Namespace + ".PluginThumb.jpg");
        }

        public IReadOnlyCollection<IPluginUIPageController> UIPageControllers
        {
            get
            {
                if (this.pages == null)
                {
                    this.pages = new List<IPluginUIPageController>();

                    this.pages.Add(new MyPageController(this.GetPluginInfo(), this.applicationHost, this.myOptionsStore));
                }

                return this.pages.AsReadOnly();
            }
        }

        /// <summary>
        /// Gets the type of configuration this plugin uses
        /// </summary>
        /// <value>The type of the configuration.</value>
        public Type ConfigurationType => typeof(MainPageUI);

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