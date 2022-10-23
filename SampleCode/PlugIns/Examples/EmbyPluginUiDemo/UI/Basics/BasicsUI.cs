// <copyright file="BasicsUI.cs" company="Emby LLC">
// Copyright © 2022 - Emby LLC. All rights reserved.
// </copyright>

namespace EmbyPluginUiDemo.UI.Basics
{
    using System;
    using System.ComponentModel;
    using System.Linq;

    using Emby.Web.GenericEdit;
    using Emby.Web.GenericEdit.Elements;

    using MediaBrowser.Model.Attributes;

    public class BasicsUI : EditableOptionsBase
    {
        public override string EditorTitle => "Basic Input";

        public override string EditorDescription => "This demonstrates the basic input elements. You don't choose controls "
                                                    + "directly. These are chosen based on the type of the properties you have in "
                                                    + "your options class. There are still many options for controlling the "
                                                    + "presentation. Here we start with the most basic ones.\n"
                                                    + "This PageView also includes an example implementation for loading "
                                                    + "and saving configuration data with the SimpleFileStore&lt;T&gt; base class.";

        public SpacerItem Spacer1 { get; set; } = new SpacerItem();

        public CaptionItem CaptionStrings { get; set; } = new CaptionItem("String Values");

        [DisplayName("Name of the Demo")]
        [Description("All items can have a display name and a description. This is the description text. "
                     + "This property has a default value.")]
        public string DemoName { get; set; } = "GenericEdit Demo";

        [Description("When no display name is specified, it is built from the property name.")]
        public string TextNoDisplayName { get; set; }

        [DisplayName("")]
        [Description("This property has an empty display name.")]
        public string TextWithEmptyDisplayName { get; set; }

        [DisplayName("Multiline Text")]
        [Description("Multiline text input can be enabled via attribute, which allows to specify the number of lines for the text area.")]
        [EditMultiline(4)]
        public string MultilineText { get; set; } = string.Concat(Enumerable.Repeat("This is a long text which spans over multiple lines. ", 15));

        public SpacerItem Spacer2 { get; set; } = new SpacerItem();

        public CaptionItem CaptionNumeric { get; set; } = new CaptionItem("Numeric Values");

        [DisplayName("Integer Value")]
        [Description("This is a normal int32 value. It is not possible to submit an empty value")]
        [Required]
        public int IntValue { get; set; } = 100;

        [DisplayName("Nullable Integer Value")]
        [Description("The value can be deleted and submitted empty")]
        public int? IntValue2 { get; set; } = 100;

        [DisplayName("Byte Value")]
        [Description("Only valid values can be entered, in this case >=0 and < 256.")]
        public byte ByteValue { get; set; } = 16;

        [DisplayName("Double Value")]
        [Description("Float and double values are shown with 6 digits by default")]
        public double DoubleValue { get; set; } = 3.141592;

        [DisplayName("Double Value with 2 Decimals")]
        [Decimals(2)]
        [Description("The number of decimals can be controlled through the DecimalsAttribute.")]
        public double DoubleValue2 { get; set; } = 3.1;

        public SpacerItem Spacer3 { get; set; } = new SpacerItem();

        public CaptionItem CaptionBoolean { get; set; } = new CaptionItem("Boolean Values");

        public SpacerItem Spacer4 { get; set; } = new SpacerItem();

        [DisplayName("Boolean Value")]
        [Description("Boolean properties are rendered as checkboxes.")]
        public bool BooleanValue { get; set; } = true;

        [DisplayName("Boolean Value without Description")]
        public bool BooleanValue2 { get; set; } = false;

        [DisplayName("Nullable Boolean Value")]
        [Description("Nullable boolean properties are rendered as dropdowns.")]
        public bool? NullableBooleanValue { get; set; } = true;

        [DisplayName("Another Nullable Boolean Value")]
        [Description("For nullable boolean properties, it is possible to control the display texts via attributes")]
        [TristateTrueText("Yes, do it"), TristateFalseText("No, please don't")]
        public bool? NullableBooleanValue2 { get; set; } = true;

        public SpacerItem Spacer5 { get; set; } = new SpacerItem();

        public CaptionItem CaptionDateTime { get; set; } = new CaptionItem("DateTime Values");

        [DisplayName("Date Value")]
        [Description("Support for date+time and time values needs to be added.")]
        public DateTime DateValue { get; set; } = DateTime.Now;

        public SpacerItem Spacer6 { get; set; } = new SpacerItem();

        public CaptionItem CaptionSpecial { get; set; } = new CaptionItem("Special Inputs");

        [DisplayName("Password Field")]
        [Description("Just requires adding the IsPasswordAttribute to a string property.\nAttention: Avoid round-tripping passwords to the clients! "
                     + "Passwords should be replaced with something generic before transmitting the data to clients!")]
        [IsPassword]
        public string PasswordValue { get; set; } = "**********";

        [DisplayName("File Picker")]
        [Description("Just add the EditFilePickerAttribute to a string property.")]
        [EditFilePicker]
        public string FileValue { get; set; }

        [DisplayName("Folder Picker")]
        [Description("Just add the EditFolderPickerAttribute to a string property.")]
        [EditFolderPicker]
        public string FolderValue { get; set; }

        public SpacerItem Spacer7 { get; set; } = new SpacerItem();

        public CaptionItem CaptionSaving { get; set; } = new CaptionItem("Data Save and Reset");

        public LabelItem BottomLabel { get; set; } = new LabelItem(
            "The data that is sent to the client always includes an "
            + "additional data object of the same type with default values. "
            + "This allows to offer two ways of resetting changes that a "
            + "user made locally:\n"
            + "Either reset the values to the current values like retrieved "
            + "from the server when the data was displayed initially, or "
            + "even reset to the application default values. Showing both buttons "
            + "might be confusing - but well, this is a demo...");
    }
}
