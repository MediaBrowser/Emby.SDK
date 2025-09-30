namespace EmbySimplePlugin
{
    using System;
    using System.IO;
    using MediaBrowser.Common.Plugins;
    using MediaBrowser.Model.Drawing;
    using MediaBrowser.Model.Logging;

    /// <summary>
    /// The plugin.
    /// </summary>
    public class Plugin : BasePlugin, IHasThumbImage
    {
        /// <summary>The Plugin ID.</summary>
        private readonly Guid id = new Guid("00000000-0000-0000-0000-000000000000"); // << Generate one: Tools >> Create GUID

        private readonly ILogger logger;

        /// <summary>Initializes a new instance of the <see cref="Plugin" /> class.</summary>
        /// <param name="logManager">The log manager.</param>
        public Plugin(ILogManager logManager)
        {
            this.logger = logManager.GetLogger(this.Name);
            this.logger.Info("My sample plugin is loaded", 0);
        }

        /// <summary>Gets the description.</summary>
        /// <value>The description.</value>
        public override string Description => "XVXVXVXVXVXVX";

        /// <summary>Gets the unique id.</summary>
        /// <value>The unique id.</value>
        public override Guid Id => this.id;

        /// <summary>Gets the name of the plugin</summary>
        /// <value>The name.</value>
        public override sealed string Name => "´XVXVXVXVXVXVX";

        /// <summary>Gets the thumb image format.</summary>
        /// <value>The thumb image format.</value>
        public ImageFormat ThumbImageFormat => ImageFormat.Png;

        /// <summary>Gets the thumb image.</summary>
        /// <returns>An image stream.</returns>
        public Stream GetThumbImage()
        {
            var type = this.GetType();
            return type.Assembly.GetManifestResourceStream(type.Namespace + ".ThumbImage.png");
        }

        public override void OnUninstalling()
        {
            this.logger.Info("My sample plugin is getting uninstalled", 0);
            base.OnUninstalling();
        }
    }
}
