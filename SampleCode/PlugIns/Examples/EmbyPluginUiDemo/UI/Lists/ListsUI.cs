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
    using MediaBrowser.Model.Activity;
    using MediaBrowser.Model.Entities;
    using MediaBrowser.Model.Logging;

    public class ListsUI : EditableOptionsBase
    {
        public ListsUI()
        {
            this.ActivityList = new GenericItemList();
            this.LibraryItemsList = new GenericItemList();
        }

        public override string EditorTitle => "List Display";

        public override string EditorDescription => string.Empty;

        public SpacerItem Spacer1 { get; set; } = new SpacerItem();

        public CaptionItem CaptionStrings { get; set; } = new CaptionItem("Basic List");

        [DisplayName("Activities")]
        [Description("Shows the most recent activities in a list")]
        public GenericItemList ActivityList { get; set; }

        public SpacerItem Spacer2 { get; set; } = new SpacerItem();

        public CaptionItem CaptionString2 { get; set; } = new CaptionItem("Nested List with Buttons");

        [DisplayName("Library Items")]
        [Description("Shows some Persons with some of their videos")]
        public GenericItemList LibraryItemsList { get; set; }

        public void CreateListItems(IActivityManager activityManager, ILibraryManager libraryManager)
        {
            this.ActivityList.Clear();
            this.LibraryItemsList.Clear();

            var query = activityManager.GetActivityLogEntries(null, 0, 6);
            foreach (var entry in query.Items)
            {
                this.ActivityList.Add(this.CreateListItem(entry));
            }

            var people = libraryManager.GetPeople(new InternalItemsQuery { Limit = 2000, }).Items;

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
                        });

                    if (relatedQuery.TotalRecordCount < 2 && i == 0)
                    {
                        continue;
                    }

                    var personItem = new GenericListItem
                    {
                        PrimaryText = person.Name,
                        SecondaryText = string.Format("{0} related videos", relatedQuery.TotalRecordCount),
                        Icon = IconNames.assistant,
                        IconMode = ItemListIconMode.LargeRegular,
                        Button1 = new ButtonItem { Icon = IconNames.book, Caption = "Edit", },
                        Button2 = new ButtonItem { Icon = IconNames.add_alarm, Caption = "Add", },
                        SubItems = new GenericItemList(),
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

                            ////SecondaryText = related.Overview,
                            Icon = IconNames.video_label,
                            IconMode = ItemListIconMode.SmallRegular,
                        };

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
