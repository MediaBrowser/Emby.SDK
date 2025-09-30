// <copyright file="StatesUI.cs" company="Emby LLC">
// Copyright © 2022 - Emby LLC. All rights reserved.
// </copyright>

namespace EmbyPluginUiDemo.UI.States
{
    using System;
    using System.ComponentModel;
    using System.Linq;

    using Emby.Media.Model.Enums;
    using Emby.Web.GenericEdit;
    using Emby.Web.GenericEdit.Elements;
    using Emby.Web.GenericEdit.Factory;

    using MediaBrowser.Model.Attributes;

    public class StatesUI : EditableOptionsBase
    {
        public override string EditorTitle => "Control States";

        public override string EditorDescription =>
            "Inputs/Controls can have three different states:\n\n"
            + " - Normal: Visible and Editable\n"
            + " - Hidden: Not Visible\n"
            + " - Disabled/ReadOnly: Visible but not editable\n\n"
            + "No distinction is being made between enabled/disabled vs. ReadOnly/ReadWrite, it's a single state. "
            + "Note that by default, read-only properties are not included, see the code how to change that. "
            + "Properties can be read-only for two reasons: Either a property has no public setter - or "
            + "a ReadOnlyAttribute has been applied. The more typical case for the disabled states are those where "
            + "the disabled state is determined dynamically. See 'ConditionsUI' for further details.";

        public SpacerItem Spacer1 { get; set; } = new SpacerItem();

        public CaptionItem CaptionStrings { get; set; } = new CaptionItem("String Values");

        [DisplayName("Name of the Demo - Normal")]
        [Description("This is the description.")]
        public string DemoName { get; set; } = "GenericEdit Demo";

        [DisplayName("Name of the Demo - ReadOnly")]
        [Description("This is the description.")]
        [ReadOnly(true)]
        public string DemoName1 { get; set; } = "GenericEdit Demo";

        [DisplayName("Multiline Text - Normal")]
        [Description("This is the description.")]
        [EditMultiline(4)]
        public string MultilineText { get; set; } = string.Concat(Enumerable.Repeat("This is a long text which spans over multiple lines. ", 10));

        [DisplayName("Multiline Text - ReadOnly")]
        [Description("This is the description.")]
        [EditMultiline(4)]
        [ReadOnly(true)]
        public string MultilineText1 { get; set; } = string.Concat(Enumerable.Repeat("This is a long text which spans over multiple lines. ", 10));

        public SpacerItem Spacer2 { get; set; } = new SpacerItem();

        public CaptionItem CaptionBoolean { get; set; } = new CaptionItem("Boolean Values");

        public SpacerItem Spacer3 { get; set; } = new SpacerItem();

        [DisplayName("Boolean Value - Normal")]
        [Description("This is the description.")]
        public bool BooleanValue { get; set; } = true;

        [DisplayName("Boolean Value - ReadOnly")]
        [Description("This is the description.")]
        [ReadOnly(true)]
        public bool BooleanValue1 { get; set; } = true;

        public SpacerItem Spacer4 { get; set; } = new SpacerItem();

        public CaptionItem CaptionDateTime { get; set; } = new CaptionItem("DateTime Values");

        [DisplayName("Date Value - Normal")]
        [Description("This is the description.")]
        public DateTime DateValue { get; set; } = DateTime.Now;

        [DisplayName("Date Value - ReadOnly")]
        [Description("This is the description.")]
        [ReadOnly(true)]
        public DateTime DateValue1 { get; set; } = DateTime.Now;

        public SpacerItem Spacer5 { get; set; } = new SpacerItem();

        public CaptionItem CaptionSelect { get; set; } = new CaptionItem("Select Inputs");

        [DisplayName("DropDown - Normal")]
        [Description("This is the description.")]
        public VideoMediaTypes SimpleEnumSelect { get; set; }

        [DisplayName("DropDown - ReadOnly")]
        [Description("This is the description.")]
        [ReadOnly(true)]
        public VideoMediaTypes SimpleEnumSelect1 { get; set; }

        [DisplayName("Multi-Select - Normal")]
        [Description("This is the description.")]
        [EditMultilSelect]
        public VideoMediaTypes MultiEnumSelect { get; set; }

        [DisplayName("Multi-Select - ReadOnly")]
        [Description("This is the description.")]
        [EditMultilSelect]
        [ReadOnly(true)]
        public VideoMediaTypes MultiEnumSelect1 { get; set; }

        public SpacerItem Spacer6 { get; set; } = new SpacerItem();

        /// <summary>Gets the editor build options.</summary>
        /// <returns>The <see cref="EditorBuildOptions"/>.</returns>
        protected override EditorBuildOptions GetEditorBuildOptions()
        {
            var options = base.GetEditorBuildOptions();

            // ReadOnly Properties are not included by default. To show those properties
            // it is required to override GetEditorBuildOptions() and set IncludeReadOnly
            options.IncludeReadOnly = true;
            return options;
        }
    }
}
