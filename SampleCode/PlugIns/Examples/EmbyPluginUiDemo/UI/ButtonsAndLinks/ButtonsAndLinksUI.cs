// <copyright file="BasicsUI.cs" company="Emby LLC">
// Copyright © 2022 - Emby LLC. All rights reserved.
// </copyright>

namespace EmbyPluginUiDemo.UI.ButtonsAndLinks
{
    using System.Collections.Generic;
    using Emby.Web.GenericEdit;
    using Emby.Web.GenericEdit.Elements;
    using Emby.Web.GenericEdit.Elements.List;

    public class ButtonsAndLinksUI : EditableOptionsBase
    {
        public override string EditorTitle => "Buttons and Links";

        public override string EditorDescription => "This shows the use of buttons and how to handle button click events. "
                                                    + "It also demonstrates how to indicate progress via StatusItem or "
                                                    + "GenericListItem elements.";

        public SpacerItem Spacer1 { get; set; } = new SpacerItem();

        public CaptionItem CaptionSimpleButtons { get; set; } = new CaptionItem("Simple Buttons");

        public LabelItem LabelSimpleButtons { get; set; } = new LabelItem("This also demonstrates the automatic grouping of buttons." +
                                                                          "Whenever multiple buttons are declared, each after another, " +
                                                                          "they are automatically grouped horizontally");

        public ButtonItem Button1 { get; set; } = new ButtonItem("Simple Button");

        public ButtonItem Button2 { get; set; } = new ButtonItem("Button with Icon") { Icon = IconNames.add_circle };

        public ButtonItem Button3 { get; set; } = new ButtonItem("Disabled Button") { Icon = IconNames.add_circle, IsEnabled = false };

        public CaptionItem CaptionSimpleButtons2 { get; set; } = new CaptionItem("Button with Confirmation Prompt");

        public ButtonItem Button4 { get; set; } = new ButtonItem("Toggle Visibility")
        {
            Icon = IconNames.lock_reset,
            Data1 = "Button4Action",
            ConfirmationPrompt = "Are you sure you want to do this?"
        };

        public ButtonItem Button5 { get; set; } = new ButtonItem("Hidden Button") { Icon = IconNames.visibility, IsVisible = false };

        public CaptionItem CaptionPopupButton { get; set; } = new CaptionItem("Button with Popup Menu");

        public ButtonItem Button6 { get; set; } = new ButtonItem()
        {
            Icon = IconNames.menu,
            SubMenuButtons = new List<ButtonItem>
            {
                new ButtonItem("Menu Item 1") { Data1 = "Donothing" },
                new ButtonItem("Menu Item 2") { Data1 = "Donothing" },
                new ButtonItem("Menu Item 3") { Data1 = "Donothing" },
                new ButtonItem("Menu Item 4") { Data1 = "Donothing" },
            }
        };

        public CaptionItem CaptionLinkButton { get; set; } = new CaptionItem("LabelItem with Hyperlink");

        public LabelItem LabelItem1 { get; set; } = new LabelItem("This is a link to: https://emby.media") { HyperLink = "https://emby.media" };

        public CaptionItem CaptionButtonEvents { get; set; } = new CaptionItem("Status Item and Button Event Handling");

        public StatusItem StatusItem1 { get; set; } = new StatusItem("Status Item", "Operation not started yet", ItemStatus.Unavailable);

        public ButtonItem ActionButton1 { get; set; } = new ButtonItem("Do Work and Error") { Icon = IconNames.run_circle, Data1 = "ActionButton1" };

        public CaptionItem CaptionButtonProgress { get; set; } = new CaptionItem("ListItem with Progress Bar");

        public GenericItemList GenericItemList1 { get; set; } = new GenericItemList
        {
            new GenericListItem(IconNames.work_outline, "List Item", "Operation not started yet") { IconMode = ItemListIconMode.LargeRegular }
        };

        public ButtonItem ActionButton2 { get; set; } = new ButtonItem("Do Work with Progress") { Icon = IconNames.run_circle, Data1 = "ActionButton2" };
    }
}
