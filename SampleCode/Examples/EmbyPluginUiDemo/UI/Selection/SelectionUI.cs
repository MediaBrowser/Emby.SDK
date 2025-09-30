// <copyright file="SelectionUI.cs" company="Emby LLC">
// Copyright © 2022 - Emby LLC. All rights reserved.
// </copyright>

namespace EmbyPluginUiDemo.UI.Selection
{
    using System;
    using System.Collections.Generic;
    using System.ComponentModel;
    using System.Linq;
    using System.Runtime.InteropServices;

    using Emby.Media.Model.Enums;
    using Emby.Web.GenericEdit;
    using Emby.Web.GenericEdit.Common;
    using Emby.Web.GenericEdit.Elements;

    using EmbyPluginUiDemo.Model;

    using MediaBrowser.Model.Attributes;

    public class SelectionUI : EditableOptionsBase
    {
        public SelectionUI()
        {
            var list = new List<EditorSelectOption>();
            var date = DateTime.Now.Date;

            for (int i = 0; i < 30; i++)
            {
                list.Add(
                    new EditorSelectOption
                    {
                        Value = date.ToString("O").Substring(0, 10),
                        Name = date.ToString("D"),
                        ShortName = date.ToString("ddd, d"),
                        IsEnabled = date.DayOfWeek != DayOfWeek.Saturday && date.DayOfWeek != DayOfWeek.Sunday,
                        ToolTip = "This is a tooltip: " + date.ToLongDateString(),
                        Color = date.DayOfWeek == DayOfWeek.Sunday ? "red" : null,
                    });

                date = date.AddDays(1);
            }

            this.DatesList = list;

            var radioList = new List<EditorRadioOption>();

            radioList.Add(new EditorRadioOption
            {
                Value = 0,
                PrimaryText = "This is Option 1",
                SecondaryText = "What's special about radio options is that these can have a primary text "
                                              + "and a secondary text which can display the option in more detail",
            });

            radioList.Add(new EditorRadioOption
            {
                Value = 1,
                PrimaryText = "This is another Option",
                SecondaryText = string.Concat(Enumerable.Repeat("This is a long text which spans over multiple lines. ", 5)),
            });

            radioList.Add(new EditorRadioOption
            {
                Value = 0,
                PrimaryText = "This is a a third Option",
                SecondaryText = "But this option is disabled. It cannot be selected at this time for some reason",
                IsEnabled = false,
            });

            this.RadioList = radioList;
        }

        public override string EditorTitle => "Select Input";

        public override string EditorDescription => "This demonstrates all ways of selection inputs that are available.";

        [Browsable(false)]
        public IEnumerable<EditorSelectOption> DatesList { get; set; }

        [Browsable(false)]
        public IEnumerable<EditorRadioOption> RadioList { get; set; }

        public SpacerItem Spacer1 { get; set; } = new SpacerItem();

        public CaptionItem CaptionEnumSelection { get; set; } = new CaptionItem("Enum Value Selection");

        [DisplayName("Plain Enum Selection")]
        [Description("Defining a property with an Enum type is all that it takes to get a dropdown selection in the UI.")]
        public VarEnum VarEnumValue { get; set; }

        [DisplayName("Enum with Description Attributes")]
        [Description("When the enum members are decorated with Description attributes those are automatically evalutated "
                     + "to generate nice display text for the select options.")]
        public VideoMediaTypes SimpleEnumSelect { get; set; }

        [DisplayName("Nullable Enum")]
        [Description("A property declared as a Nullable Enum is handled equally, but the options list will include an additional "
                     + "empty item to allow selecting the 'null' value.")]
        public VideoMediaTypes? SimpleEnumSelectNullable { get; set; }

        public IList<VideoMediaTypes> RestrictedCodecList => new[] { VideoMediaTypes.h264, VideoMediaTypes.hevc, VideoMediaTypes.mpeg2video, VideoMediaTypes.vc1, VideoMediaTypes.vp9, VideoMediaTypes.av1 };

        [DisplayName("Enum Selection with Value Restriction")]
        [Description("When the enum members are decorated with Description attributes those are automatically evalutated "
                     + "to generate nice display text for the select options.")]
        [SelectItemsSource(nameof(RestrictedCodecList))]
        public VideoMediaTypes RestrictedEnumSelect { get; set; }

        public SpacerItem Spacer2 { get; set; } = new SpacerItem();

        public CaptionItem CaptionStaticSourceRadio { get; set; } = new CaptionItem("Enum Value Selection as Radio Group");

        public LabelItem StayOrGoLabel { get; set; } = new LabelItem("All that is takes is to add a SelectShowRadioGroup attribute to show an enum as radio group.");

        [DisplayName("Should I stay or should I go?")]
        [SelectShowRadioGroup]
        public StayOrGo StayOrGoValue { get; set; }

        public SpacerItem Spacer3 { get; set; } = new SpacerItem();

        public CaptionItem CaptionStaticSource { get; set; } = new CaptionItem("Custom Value Selection");

        public LabelItem CaptionStaticSourceLabel { get; set; } = new LabelItem("This demonstrates the use of a custom list which is part of the "
                                                                                + "data object. In this example, all Saturdays and Sundays are "
                                                                                + "disabled and unavailable for selection.");

        [DisplayName("Select Day")]
        [Description("With the SelectItemsSource attribute, a list of EditorSelectOption items can be used to provide list of arbitrary elements for selection.")]
        [SelectItemsSource(nameof(DatesList))]
        public string StaticValueSelect { get; set; }

        [DisplayName("Multi-Selection from Custom Source")]
        [Description("This is the regular multi-select input.")]
        [EditMultilSelect]
        [SelectItemsSource(nameof(DatesList))]
        public string MultiEnumSelect { get; set; }

        [DisplayName("Multiline Multi-Selection from Custom Source")]
        [Description("This is a multi-select input showing multiple lines. Its primary use case is showing realtime status messages "
                     + "rather than for users making selections.")]
        [EditMultiline(8)]
        [EditMultilSelect]
        [SelectItemsSource(nameof(DatesList))]
        public string MultiEnumSelect2 { get; set; }

        public SpacerItem Spacer4 { get; set; } = new SpacerItem();

        public CaptionItem CaptionSaving { get; set; } = new CaptionItem("Radio Selection from Custom Source");

        public LabelItem BottomLabel { get; set; } = new LabelItem(" ");

        [DisplayName("Choose an Option")]
        [SelectItemsSource(nameof(RadioList))]
        [SelectShowRadioGroup]
        public string RadioSelectionFromCustomList { get; set; }

        public SpacerItem Spacer5 { get; set; } = new SpacerItem();
    }
}
