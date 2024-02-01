// <copyright file="ChildOptionExample.cs" company="Emby LLC">
// Copyright © 2022 - Emby LLC. All rights reserved.
// </copyright>

namespace EmbyPluginUiDemo.Model
{
    using System.ComponentModel;

    using Emby.Web.GenericEdit;

    using MediaBrowser.Model.Attributes;

    public class ChildOptionExample : EditableOptionsBase
    {
        public enum ImportMode
        {
            [Description("Manually Only")]
            Manually,

            [Description("Daily")]
            OncePerDay,

            [Description("Hourly")]
            OncePerHour,
        }

        public override string EditorTitle => "Child Option";

        [DisplayName("File Path")]
        [Description("Choose a source file")]
        [EditFilePicker]
        public string File { get; set; }

        [DisplayName("Import Mode")]
        [Description("Choose an import schedule")]
        public ImportMode ImportModeValue { get; set; }
    }
}
