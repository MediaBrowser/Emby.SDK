// <copyright file="ChildCollectionItem.cs" company="Emby LLC">
// Copyright © 2022 - Emby LLC. All rights reserved.
// </copyright>

namespace EmbyPluginUiDemo.UI.ChildCollections
{
    using System.ComponentModel;
    using Emby.Web.GenericEdit;
    using MediaBrowser.Model.Attributes;

    public class ChildCollectionItem : EditableOptionsBase
    {
        public override string EditorTitle => "";

        [DisplayName("")]
        [EditFilePicker]
        [AutoPostBack("PostBack", nameof(File))]
        public string File { get; set; }
    }
}
