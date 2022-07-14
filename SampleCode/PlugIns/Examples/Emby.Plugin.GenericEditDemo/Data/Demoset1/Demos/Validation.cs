// <copyright file="Validation.cs" company="Emby LLC">
// Copyright © 2022 - Emby LLC. All rights reserved.
// </copyright>

namespace Emby.Plugin.GenericEditDemo.Data.Demoset1.Demos
{
    using System;
    using System.ComponentModel;
    using Emby.Web.GenericEdit;
    using Emby.Web.GenericEdit.Elements;

    public class Validation : EditableOptionsBase
    {
        public override string EditorTitle => "Input Validation";

        public override string EditorDescription =>
            "Validation needs to be done at the server side. "
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

        public void Validate()
        {
            if (this.Number1 <= this.Number2)
            {
                throw new ApplicationException("Number 1 must be greater than Number 2!");
            }
        }
    }
}
