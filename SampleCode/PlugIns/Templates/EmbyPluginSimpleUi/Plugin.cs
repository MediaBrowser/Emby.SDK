namespace EmbyPluginSimpleUI
{
    using System;
    using System.IO;

    using MediaBrowser.Common;
    using MediaBrowser.Common.Plugins;
    using MediaBrowser.Controller.Plugins;
    using MediaBrowser.Model.Drawing;
    using MediaBrowser.Model.Logging;

    /// <summary>
    /// The plugin.
    /// </summary>
    public class Plugin : BasePluginSimpleUI<PluginOptions>, IHasThumbImage
    {
        /// <summary>The Plugin ID.</summary>
        private readonly Guid id = new Guid("00000000-0000-0000-0000-000000000000"); // << Generate one: Tools >> Create GUID

        private readonly ILogger logger;

        /// <summary>Initializes a new instance of the <see cref="Plugin" /> class.</summary>
        /// <param name="applicationHost">The application host.</param>
        /// <param name="logManager">The log manager.</param>
        public Plugin(IApplicationHost applicationHost, ILogManager logManager) : base(applicationHost)
        {
            this.logger = logManager.GetLogger(this.Name);
            this.logger.Info("My plugin ({0}) is getting loaded", this.Name);
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

        protected override void OnOptionsSaved(PluginOptions options)
        {
            this.logger.Info("My plugin ({0}) options have been updated.", this.Name);
        }
    }
}
