// <copyright file="ConditionsUI.cs" company="Emby LLC">
// Copyright © 2022 - Emby LLC. All rights reserved.
// </copyright>

namespace EmbyPluginUiDemo.UI.Conditions
{
    using System.ComponentModel;

    using Emby.Media.Model.Enums;
    using Emby.Web.GenericEdit;
    using Emby.Web.GenericEdit.Elements;

    using EmbyPluginUiDemo.Model;

    using MediaBrowser.Model.Attributes;

    public class ConditionsUI : EditableOptionsBase
    {
        public override string EditorTitle => "Control ConditionsUI";

        public override string EditorDescription =>
            "Conditions can be declared with attributes and are evaluated at the client after each value "
            + "change. Conditions can be used to control two things\n\n"
            + " - Enabled/Disabled State\n"
            + " - Control Visibility\n\n"
            + "Condition attributes are applied to the property whose associated control(s) should be affected "
            + "by the condition. The condition can reference any other value(s) which should be evaluated for the "
            + "conditional state change.";
        public SpacerItem Spacer1 { get; set; } = new SpacerItem();

        public CaptionItem CaptionSimple { get; set; } = new CaptionItem("Simple Show/Hide Condition");

        [DisplayName("Boolean Value")]
        [Description("Checking/unchecking will show or hide another control")]
        public bool SimpleBoolValue { get; set; }

        [DisplayName("Conditionally Visible Value")]
        [Description("This is the description.")]
        [VisibleCondition(nameof(SimpleBoolValue), SimpleCondition.IsTrue)]
        public string DemoName1 { get; set; } = "GenericEdit Demo";

        [DisplayName("Enum with Description Attributes")]
        [Description("When the enum members are decorated with Description attributes those are automatically evalutated "
                     + "to generate nice display text for the select options.")]
        [VisibleCondition(nameof(SimpleBoolValue), SimpleCondition.IsTrue)]
        public VideoMediaTypes SimpleEnumSelect1 { get; set; }

        public SpacerItem Spacer2 { get; set; } = new SpacerItem();

        public CaptionItem CaptionSimple2 { get; set; } = new CaptionItem("Simple Enable/Disable Condition");

        [DisplayName("Boolean Value")]
        [Description("Checking/unchecking will enable or disable the control below")]
        public bool SimpleBoolValue2 { get; set; }

        [DisplayName("Conditionally Enabled Select")]
        [Description("This is the description.")]
        [EnabledCondition(nameof(SimpleBoolValue2), SimpleCondition.IsTrue)]
        public VideoMediaTypes SimpleEnumSelect { get; set; }

        public SpacerItem Spacer3 { get; set; } = new SpacerItem();

        public CaptionItem CaptionSimple3 { get; set; } = new CaptionItem("Show/Hide by Enum Value Selection");

        [DisplayName("Selecting 'Don't know' will show a message")]
        [Description("This is the description.")]
        public StayOrGo StayOrGoSelect { get; set; } = StayOrGo.Go;

        [VisibleCondition(nameof(StayOrGoSelect), ValueCondition.IsEqual, StayOrGo.DontKnow)]
        public LabelItem StayOrGoLabel { get; set; } = new LabelItem("IT'S TIME TO MAKE A DECISION!");

        public SpacerItem Spacer4 { get; set; } = new SpacerItem();

        public CaptionItem CaptionSimple4 { get; set; } = new CaptionItem("Depend on child property value");

        public LabelItem ValueLabel { get; set; } = new LabelItem("File Import 2 will only be shown once a file is specified for File Import 1");

        [DisplayName("File Import 1")]
        public ChildOptionExample ChildOption1 { get; set; } = new ChildOptionExample();

        [DisplayName("File Import 2")]
        [VisibleCondition(nameof(ChildOption1) + "." + nameof(ChildOptionExample.File), SimpleCondition.IsNotNullOrEmpty)]
        public ChildOptionExample ChildOption2 { get; set; } = new ChildOptionExample();

        public SpacerItem Spacer5 { get; set; } = new SpacerItem();
    }
}
