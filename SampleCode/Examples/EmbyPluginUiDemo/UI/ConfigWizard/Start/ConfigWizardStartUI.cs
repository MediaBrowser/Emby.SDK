// <copyright file="ConfigWizardStartUI.cs" company="Emby LLC">
// Copyright © 2022 - softworkz for Emby LLC. All rights reserved.
// </copyright>

namespace EmbyPluginUiDemo.UI.ConfigWizard.Start
{
    using System.ComponentModel;
    using Emby.Web.GenericEdit;
    using Emby.Web.GenericEdit.Elements;
    using EmbyPluginUiDemo.Model;
    using MediaBrowser.Model.Attributes;

    public class ConfigWizardStartUI : EditableOptionsBase
    {
        public override string EditorTitle => "Create a new Demo Setup";

        public override string EditorDescription => "Choose Subject";

        public SpacerItem Spacer1 { get; set; } = new SpacerItem();

        [DisplayName("Should I stay or should I go?")]
        [SelectShowRadioGroup]
        public StayOrGo StayOrGoValue { get; set; }
    }
}
