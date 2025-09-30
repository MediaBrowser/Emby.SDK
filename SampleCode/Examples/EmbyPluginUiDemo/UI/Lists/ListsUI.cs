// <copyright file="ListsUI.cs" company="Emby LLC">
// Copyright © 2022 - Emby LLC. All rights reserved.
// </copyright>

namespace EmbyPluginUiDemo.UI.Lists
{
    using System;
    using System.ComponentModel;

    using Emby.Web.GenericEdit;
    using Emby.Web.GenericEdit.Elements;
    using Emby.Web.GenericEdit.Elements.List;

    using MediaBrowser.Controller.Entities;
    using MediaBrowser.Controller.Library;
    using MediaBrowser.Controller.Persistence;
    using MediaBrowser.Model.Activity;
    using MediaBrowser.Model.Attributes;
    using MediaBrowser.Model.Entities;
    using MediaBrowser.Model.Logging;

    public class ListsUI : EditableOptionsBase
    {
        public enum DemoChoices
        {
            [Description("Simple List")]
            SimpleList,

            [Description("Icon Modes and Item Status")]
            IconModes,

            [Description("Nested List with Buttons")]
            NestedList,
        }

        public ListsUI()
        {
            this.ActivityList = new GenericItemList();
            this.IconModesList = new GenericItemList();
            this.LibraryItemsList = new GenericItemList();
        }

        public override string EditorTitle => "List Display";

        public override string EditorDescription => string.Empty;

        public SpacerItem Spacer1 { get; set; } = new SpacerItem();

        [DisplayName("Choose a Demo to Show")]
        [AutoPostBack(ListsPageView.PostBackCommand, nameof(DemoChoice))]
        public DemoChoices DemoChoice { get; set; } = DemoChoices.SimpleList;

        [VisibleCondition(nameof(DemoChoice), ValueCondition.IsEqual, nameof(DemoChoices.SimpleList))]
        public CaptionItem CaptionStrings { get; set; } = new CaptionItem("Basic List");

        [DisplayName("Activities")]
        [Description("Shows the most recent activities in a list")]
        [VisibleCondition(nameof(DemoChoice), ValueCondition.IsEqual, nameof(DemoChoices.SimpleList))]
        public GenericItemList ActivityList { get; set; }

        [VisibleCondition(nameof(DemoChoice), ValueCondition.IsEqual, nameof(DemoChoices.IconModes))]
        public CaptionItem CaptionString2 { get; set; } = new CaptionItem("Icon Modes and Item Status");

        [DisplayName("Choose Icon")]
        [Description("This list includes almost all Google Material Icons (not Symbols)")]
        [AutoPostBack(ListsPageView.PostBackCommand, nameof(IconName))]
        [VisibleCondition(nameof(DemoChoice), ValueCondition.IsEqual, nameof(DemoChoices.IconModes))]
        public IconNames IconName { get; set; } = IconNames.home;

        [DisplayName("Show Secondary Text")]
        [Description("Show list items with a secondary text")]
        [AutoPostBack(ListsPageView.PostBackCommand, nameof(ShowSecondaryText))]
        [VisibleCondition(nameof(DemoChoice), ValueCondition.IsEqual, nameof(DemoChoices.IconModes))]
        public bool ShowSecondaryText { get; set; } = true;

        [DisplayName("Show as Sub-Items")]
        [Description("Show all items as sub-items of a list item")]
        [AutoPostBack(ListsPageView.PostBackCommand, nameof(ShowAsSubItems))]
        [VisibleCondition(nameof(DemoChoice), ValueCondition.IsEqual, nameof(DemoChoices.IconModes))]
        public bool ShowAsSubItems { get; set; }

        [DisplayName("Icon Modes and Item Status")]
        [VisibleCondition(nameof(DemoChoice), ValueCondition.IsEqual, nameof(DemoChoices.IconModes))]
        public GenericItemList IconModesList { get; set; }

        [VisibleCondition(nameof(DemoChoice), ValueCondition.IsEqual, nameof(DemoChoices.NestedList))]
        public CaptionItem CaptionString3 { get; set; } = new CaptionItem("Nested List with Buttons");

        [DisplayName("Library Items")]
        [Description("Shows some Persons with some of their videos")]
        [VisibleCondition(nameof(DemoChoice), ValueCondition.IsEqual, nameof(DemoChoices.NestedList))]
        public GenericItemList LibraryItemsList { get; set; }

        public void CreateListItems(IActivityManager activityManager, ILibraryManager libraryManager, IItemRepository itemRepository)
        {
            this.ActivityList.Clear();
            this.LibraryItemsList.Clear();
            this.IconModesList.Clear();

            if (this.DemoChoice == DemoChoices.SimpleList)
            {
                var query = activityManager.GetActivityLogEntries(null, 0, 6);
                foreach (var entry in query.Items)
                {
                    this.ActivityList.Add(this.CreateListItem(entry));
                }

                return;
            }

            if (this.DemoChoice == DemoChoices.NestedList)
            {
                this.CreateNestedList(libraryManager, itemRepository);
                return;
            }

            var stati = new[] { ItemStatus.InProgress, ItemStatus.Succeeded, ItemStatus.Warning, ItemStatus.Failed, ItemStatus.Unavailable, ItemStatus.Unknown, ItemStatus.None, };
            var modes = new[] { ItemListIconMode.LargeRegular, ItemListIconMode.LargeInCircle, ItemListIconMode.SmallRegular, ItemListIconMode.SmallInCircle };
            var secText = this.ShowSecondaryText ? "Secondary Text" : null;

            foreach (var iconMode in modes)
            {
                foreach (var itemStatus in stati)
                {
                    this.IconModesList.Add(
                        new GenericListItem
                        {
                            PrimaryText = string.Format("IconMode: {0}, Status: {1}", iconMode, itemStatus),
                            SecondaryText = secText,
                            Status = itemStatus,
                            Icon = this.IconName,
                            IconMode = iconMode,
                        });
                }
            }

            this.IconModesList.Add(
                new GenericListItem
                {
                    PrimaryText = "IconMode: NoIcons",
                    SecondaryText = secText,
                    Status = ItemStatus.Failed,
                    Icon = this.IconName,
                    IconMode = ItemListIconMode.NoIcons,
                });

            if (this.ShowAsSubItems)
            {
                var subItems = new GenericItemList(this.IconModesList);
                this.IconModesList.Clear();

                this.IconModesList.Add(
                    new GenericListItem
                    {
                        PrimaryText = "Icon Modes in Sub-ItemLists",
                        SecondaryText = secText,
                        Status = ItemStatus.Succeeded,
                        Icon = this.IconName,
                        IconMode = ItemListIconMode.SmallRegular,
                        SubItems = subItems,
                    });
            }
        }

        private void CreateNestedList(ILibraryManager libraryManager, IItemRepository itemRepository)
        {
            var people = itemRepository.GetPeople(new InternalItemsQuery { Limit = 2000, IncludeLiveTVView = false }).Items;

            for (int i = 0; i < 2; i++)
            {
                foreach (var (person, _) in people)
                {
                    if (this.LibraryItemsList.Count > 5)
                    {
                        break;
                    }

                    var relatedQuery = libraryManager.GetItemsResult(
                        new InternalItemsQuery
                        {
                            PersonIds = new[] { person.InternalId },
                            IncludeItemTypes = new[] { "Movie" },
                            Limit = 12,
                            Recursive = true,
                            ImageTypes = new ImageType[0],
                            EnableTotalRecordCount = false,
                        });

                    if (relatedQuery.Items.Length < 2 && i == 0)
                    {
                        continue;
                    }

                    var personItem = new GenericListItem
                    {
                        PrimaryText = person.Name,
                        SecondaryText = string.Format((string)"{0} related videos", (object)relatedQuery.TotalRecordCount),
                        Icon = IconNames.assistant,
                        IconMode = ItemListIconMode.LargeRegular,
                        Button1 = new ButtonItem { Icon = IconNames.book, Caption = "Edit", },
                        Button2 = new ButtonItem { Icon = IconNames.add_alarm, Caption = "Add", },
                        SubItems = new GenericItemList(),
                        Toggle = new ToggleButtonItem("Toggle Test") { IsEnabled = this.LibraryItemsList.Count > 1, IsChecked = true },
                    };

                    foreach (var related in relatedQuery.Items)
                    {
                        if (personItem.SubItems.Count > 4)
                        {
                            break;
                        }

                        var subItem = new GenericListItem
                        {
                            PrimaryText = related.Name,

                            SecondaryText = related.Overview,
                            Icon = IconNames.video_label,
                            IconMode = ItemListIconMode.SmallRegular,
                        };

                        if (personItem.SubItems.Count == 0)
                        {
                            var x1 = new GenericListItem
                            {
                                PrimaryText = "X1 test",

                                // SecondaryText = string.Format("{0} related videos", relatedQuery.TotalRecordCount),
                                Icon = IconNames.assistant,
                                IconMode = ItemListIconMode.SmallRegular,
                                Button1 = new ButtonItem { Icon = IconNames.book, Caption = "Edit", },
                            };
                            var x2 = new GenericListItem
                                     {
                                         PrimaryText = "X2 test",

                                         ////SecondaryText = string.Format("{0} related videos", relatedQuery.TotalRecordCount),
                                         Icon = IconNames.assistant,
                                         IconMode = ItemListIconMode.SmallRegular,

                                         // Button1 = new ButtonItem { Icon = IconNames.book, Caption = "Edit", },
                                     };

                            subItem.SubItems = new GenericItemList { x1, x2 };
                        }

                        personItem.SubItems.Add(subItem);
                    }

                    this.LibraryItemsList.Add(personItem);
                }
            }
        }

        private GenericListItem CreateListItem(ActivityLogEntry entry)
        {
            return new GenericListItem
            {
                PrimaryText = entry.Name,
                SecondaryText = entry.Date.ToString(),
                Status = this.StatusFromSeverity(entry.Severity),
                Icon = IconNames.info,
                IconMode = ItemListIconMode.LargeRegular,
                HyperLink = "https://emby.media",
            };
        }

        private ItemStatus StatusFromSeverity(LogSeverity severity)
        {
            switch (severity)
            {
                case LogSeverity.Info:
                case LogSeverity.Debug:
                    return ItemStatus.Succeeded;
                case LogSeverity.Warn:
                    return ItemStatus.Warning;
                case LogSeverity.Error:
                case LogSeverity.Fatal:
                    return ItemStatus.Failed;
                default:
                    throw new ArgumentOutOfRangeException(nameof(severity), severity, null);
            }
        }
    }
}
