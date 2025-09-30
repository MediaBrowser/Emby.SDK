// <copyright file="FileBrowserPlugin.cs" company="Emby LLC">
// Copyright © Emby LLC. All rights reserved.
// </copyright>

namespace EmbyFileBrowser
{
    using System;
    using System.IO;

    using EmbyFileBrowser.Model;

    using MediaBrowser.Common.Plugins;
    using MediaBrowser.Controller;
    using MediaBrowser.Controller.Plugins;
    using MediaBrowser.Model.Drawing;

    public class FileBrowserPlugin : BasePluginSimpleUI<FileBrowserPluginOptions>, IHasThumbImage
    {
        public const string PluginName = "File Browser Plugin";
        public const string PluginShortName = "ChannelPluginFileBrowser";

        public const string PluginDescription = "An example plugin, demonstrating development of Channel Plugins for Emby Server";

        public static readonly Guid PluginId = new Guid("9AB5E7AC-8B62-40CA-88E6-8DD88BD60FE5");

        public FileBrowserPlugin(IServerApplicationHost appHost)
        : base(appHost)
        {
        }

        /// <summary>Gets the unique id.</summary>
        /// <value>The unique id.</value>
        public override Guid Id => PluginId;

        /// <summary>Gets the name of the plugin.</summary>
        /// <value>The name.</value>
        public override string Name => PluginName;

        public override string Description => PluginDescription;

        public ImageFormat ThumbImageFormat => ImageFormat.Png;

        public FileBrowserPluginOptions GetPluginOptions()
        {
            return this.GetOptions();
        }

        public Stream GetThumbImage()
        {
            var type = this.GetType();
            return type.Assembly.GetManifestResourceStream(type.Namespace + ".thumb.png");
        }

        protected override bool OnOptionsSaving(FileBrowserPluginOptions options)
        {
            options.ValidateOrThrow();

            return base.OnOptionsSaving(options);
        }

        protected override void OnOptionsSaved(FileBrowserPluginOptions options)
        {
            base.OnOptionsSaved(options);
        }
    }
}