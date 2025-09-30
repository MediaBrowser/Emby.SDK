// <copyright file="ValidationUI.cs" company="Emby LLC">
// Copyright © 2022 - Emby LLC. All rights reserved.
// </copyright>

namespace EmbyPluginUiDemo.UI.Validation
{
    using System.ComponentModel;

    using Emby.Web.GenericEdit;
    using Emby.Web.GenericEdit.Elements;
    using Emby.Web.GenericEdit.Validation;

    public class ValidationUI : EditableOptionsBase
    {
        public override string EditorTitle => "Input ValidationUI";

        public override string EditorDescription =>
            "ValidationUI needs to be done at the server side. "
            + "When validation is unsuccessful, the server needs to "
            + "throw an ApplicationException with an appropriate message.";

        public SpacerItem Spacer1 { get; set; } = new SpacerItem();

        public CaptionItem CaptionStrings { get; set; } = new CaptionItem("Validate Number Relation");

        [DisplayName("Number 1")]
        [Description("This number must be greater than Number 2.")]
        public int Number1 { get; set; } = 10;

        [DisplayName("Number 2")]
        [Description("Try setting this to a value >= Number 1 and save.")]
        public int Number2 { get; set; } = 5;

        public SpacerItem Spacer2 { get; set; } = new SpacerItem();

        protected override void Validate(ValidationContext context)
        {
            if (this.Number1 <= this.Number2)
            {
                context.AddValidationError(nameof(this.Number1), "Number 1 must be greater than Number 2!");
            }
        }
    }
}
