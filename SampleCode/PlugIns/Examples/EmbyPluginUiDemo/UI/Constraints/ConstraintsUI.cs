// <copyright file="ConstraintsUI.cs" company="Emby LLC">
// Copyright © 2022 - Emby LLC. All rights reserved.
// </copyright>

namespace EmbyPluginUiDemo.UI.Constraints
{
    using System.ComponentModel;

    using Emby.Web.GenericEdit;
    using Emby.Web.GenericEdit.Elements;

    using MediaBrowser.Model.Attributes;

    public class ConstraintsUI : EditableOptionsBase
    {
        public override string EditorTitle => "Input ConstraintsUI";

        public override string EditorDescription =>
            "For some cases, constraints are automatically inferred. For example, whether an "
            + "input is required or not can be controlled by using Nullable value types. "
            + "For numbers, minimum and maximum values are automatically determined from "
            + "the data type.\n"
            + "Beyond those automatic constraints, it is also possible to use attributes "
            + "for more detailed control.";

        public SpacerItem Spacer1 { get; set; } = new SpacerItem();

        public CaptionItem CaptionStrings { get; set; } = new CaptionItem("String Input");

        [DisplayName("Required Text")]
        [Description("Empty text input can be prevented by adding a Required attribute. It is not possible to save this without entering a text.")]
        [Required]
        public string RequiredString { get; set; }

        [DisplayName("Limited Text Length")]
        [Description("With the MaxLength attribute it is possible to limit the length of the entered text. In this case it's limited to 6 characters.")]
        [MaxLength(6)]
        public string LimitedString { get; set; }

        public SpacerItem Spacer2 { get; set; } = new SpacerItem();

        public CaptionItem CaptionNumeric1 { get; set; } = new CaptionItem("Numeric Input");

        [DisplayName("Min and Max ConstraintsUI")]
        [Description("This integer property accepts values from 1 to 10 only.")]
        [MinValue(1), MaxValue(10)]
        public int MinMaxValue { get; set; } = 1;

        [DisplayName("Decimals Constraint")]
        [Description("This double property accepts values from 0 to 1 with 2 decimals.")]
        [MinValue(0), MaxValue(1)]
        [Decimals(2)]
        public double FloatDecimalsValue { get; set; } = 0.32;

        public SpacerItem Spacer3 { get; set; } = new SpacerItem();
    }
}
