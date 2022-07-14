// <copyright file="Nesting.cs" company="Emby LLC">
// Copyright © 2022 - Emby LLC. All rights reserved.
// </copyright>

namespace Emby.Plugin.GenericEditDemo.Data.Demoset1.Demos
{
    using System.ComponentModel;
    using Emby.Web.GenericEdit;
    using Emby.Web.GenericEdit.Elements;
    using MediaBrowser.Model.Configuration;

    public class Nesting : EditableOptionsBase
    {
        public override string EditorTitle => "Editing Nested Objects";

        public override string EditorDescription =>
            "Nesting objects for editing works easily. It allows re-using of options patterns and is"
            + "also useful for creating groups of options, which also simplifies definitions when"
            + "using conditions.";

        [DisplayName("Compound Object Property")]
        [Description("This demonstrates the use of an existing plain regular class as editable property, even though "
                     + "it is recommended to use classes derived from EditableOptionsBase for nesting.")]
        public ImageOption LimitedString { get; set; } = new ImageOption();

        public SpacerItem Spacer1 { get; set; } = new SpacerItem();

        public CaptionItem CaptionEditableObject { get; set; } = new CaptionItem("EditableObject as Child Properties");

        public LabelItem CaptionEditableObjectLabel { get; set; } = new LabelItem("Having classes derived from EditableObject as "
                                                                                  + "property values allow re-using option"
                                                                                  + "patterns in multiple places or - like here - "
                                                                                  + "for repeated entry.");

        [DisplayName("File Import 1")]
        public ChildOptionExample ChildOption1 { get; set; } = new ChildOptionExample();

        [DisplayName("File Import 2")]
        public ChildOptionExample ChildOption2 { get; set; } = new ChildOptionExample();

        public SpacerItem Spacer2 { get; set; } = new SpacerItem();

        public CaptionItem CaptionCollection { get; set; } = new CaptionItem("Child Object Collections");

        public LabelItem LabelCollection { get; set; } = new LabelItem("When the repetition count is not fixed, it is also "
                                                                        + "possible to use an EditableObject collection to have"
                                                                        + "a dynamic number of child options. The members of the "
                                                                        + "collection are not even required to be of the same type.");

        [DisplayName("Collection of 3 Child Options")]
        public EditableObjectCollection Collection { get; set; } = new EditableObjectCollection
                                                                   {
                                                                       new ChildOptionExample(),
                                                                       new ChildOptionExample(),
                                                                       new ChildOptionExample(),
                                                                   };

        public SpacerItem Spacer3 { get; set; } = new SpacerItem();
    }
}
