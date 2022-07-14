// <copyright file="Plugin.cs" company="Emby LLC">
// Copyright © 2022 - Emby LLC. All rights reserved.
// </copyright>

namespace Emby.Plugin.GenericEditDemo
{
    using System;
    using System.Collections.Generic;
    using System.IO;
    using Emby.Plugin.GenericEditDemo.Data;
    using MediaBrowser.Common.Plugins;
    using MediaBrowser.Controller;
    using MediaBrowser.Controller.Library;
    using MediaBrowser.Model.Activity;
    using MediaBrowser.Model.Drawing;
    using MediaBrowser.Model.Plugins;

    /// <summary>
    /// The plugin.
    /// </summary>
    public class Plugin : BasePlugin, IHasThumbImage, IHasWebPages
    {
        /// <summary>The Plugin ID.</summary>
        private readonly Guid id = new Guid("507C5494-B59E-4E1D-9F46-33DDB5E94E87");

        /// <summary>Initializes a new instance of the <see cref="Plugin" /> class.</summary>
        /// <param name="activityManager">The activity manager.</param>
        /// <param name="libraryManager">The library manager.</param>
        /// <param name="applicationHost">The application host.</param>
        public Plugin(IActivityManager activityManager, ILibraryManager libraryManager, IServerApplicationHost applicationHost)
        {
            this.DataManager = new DemoDataManager(activityManager, libraryManager, applicationHost);
        }

        /// <summary>Gets the description.</summary>
        /// <value>The description.</value>
        public override string Description => "This plugin demonstrates the use of GenericEdit UI generation for Emby";

        /// <summary>Gets the unique id.</summary>
        /// <value>The unique id.</value>
        public override Guid Id => this.id;

        /// <summary>Gets the name of the plugin</summary>
        /// <value>The name.</value>
        public override string Name => "GenericEdit Demo";

        /// <summary>Gets the thumb image format.</summary>
        /// <value>The thumb image format.</value>
        public ImageFormat ThumbImageFormat => ImageFormat.Jpg;

        /// <summary>Gets the data manager.</summary>
        /// <value>The data manager.</value>
        internal DemoDataManager DataManager { get; }

        /// <summary>Gets the pages.</summary>
        /// <returns>A collection of <see cref="PluginPageInfo"/> entries.</returns>
        public IEnumerable<PluginPageInfo> GetPages()
        {
            var prefix = this.GetType().Namespace + ".Web.";

            return new[]
                   {
                       new PluginPageInfo
                       {
                           Name = "GenericEditDemo1",
                           EmbeddedResourcePath = prefix + "genericeditdemo.html",
                           EnableInMainMenu = true,
                           DisplayName = "GenericEdit Demo 1",
                           ////MenuSection = "server",
                           MenuIcon = "list_alt",
                       },
                       new PluginPageInfo
                       {
                           Name = "GenericEditDemo2",
                           EmbeddedResourcePath = prefix + "genericeditdemo.html",
                           EnableInMainMenu = true,
                           DisplayName = "GenericEdit Demo 2",
                           ////MenuSection = "server",
                           MenuIcon = "list_alt",
                       },
                       new PluginPageInfo
                       {
                           Name = "GenericEditDemoJs",
                           EmbeddedResourcePath = prefix + "genericeditdemo.js",
                       },
                   };
        }

        /// <summary>Gets the thumb image.</summary>
        /// <returns>An image stream.</returns>
        public Stream GetThumbImage()
        {
            var type = this.GetType();
            return type.Assembly.GetManifestResourceStream(type.Namespace + ".GenericEditIcon.jpg");
        }
    }
}