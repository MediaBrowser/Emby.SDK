// <copyright file="ConfigWizardFinishUI.cs" company="Emby LLC">
// Copyright © 2022 - softworkz for Emby LLC. All rights reserved.
// </copyright>

namespace EmbyPluginUiDemo.UI.ConfigWizard.Finish
{
    using Emby.Web.GenericEdit;
    using Emby.Web.GenericEdit.Elements;

    public class ConfigWizardFinishUI : EditableOptionsBase
    {
        public ConfigWizardFinishUI()
        {
            this.SummaryCaption = new CaptionItem("Configuration Summary");
        }

        public override string EditorTitle => "Finishing Up";

        public override string EditorDescription => "Review configuration and mode";

        public CaptionItem SummaryCaption { get; set; }

        public LabelItem SummaryLabel1 { get; set; } = new LabelItem();

        public LabelItem SummaryLabel2 { get; set; } = new LabelItem();

        public SpacerItem Spacer1 { get; set; } = new SpacerItem();

        public SpacerItem Spacer2 { get; set; } = new SpacerItem();
    }
}
