// <copyright file="FileBrowserPluginOptions.cs" company="Emby LLC">
// Copyright © Emby LLC. All rights reserved.
// </copyright>

namespace EmbyFileBrowser.Model
{
    using System.ComponentModel;

    using Emby.Web.GenericEdit;

    using MediaBrowser.Model.Attributes;

    public class FileBrowserPluginOptions : EditableOptionsBase
    {
        public override string EditorTitle => "File-Browser Plugin Options";

        public override string EditorDescription => "This is an example plugin, demonstrating how to create " +
                                                    "a 'Channel Plugin' for Emby Server.\n" +
                                                    "The options are kept very simple, you can choose up to three root paths "
                                                    + "for browsing through Emby.";

        [DisplayName("Root Folder 1")]
        [Description("Please choose a folder, for example 'My Videos' or 'My Music' or one of your librariy paths")]
        [EditFolderPicker]
        public string RootFolder1 { get; set; }

        [DisplayName("Root Folder 2")]
        [Description("Optionally, specify another folder")]
        [EditFolderPicker]
        public string RootFolder2 { get; set; }

        [DisplayName("Root Folder 3")]
        [Description("Optionally, specify a third folder")]
        [EditFolderPicker]
        public string RootFolder3 { get; set; }
    }
}
