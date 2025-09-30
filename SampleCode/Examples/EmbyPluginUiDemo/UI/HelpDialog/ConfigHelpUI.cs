// <copyright file="ConfigHelpUI.cs" company="Emby LLC">
// Copyright © 2022 - softworkz for Emby LLC. All rights reserved.
// </copyright>

namespace EmbyPluginUiDemo.UI.HelpDialog
{
    using System.ComponentModel;
    using Emby.Web.GenericEdit;
    using Emby.Web.GenericEdit.Elements;
    using Emby.Web.GenericEdit.Elements.List;

    public class ConfigHelpUI : EditableOptionsBase
    {
        public ConfigHelpUI()
        {
            this.BuildLists();
            this.StatusLegendCaption = new CaptionItem("Phrase Status");
            this.CommandsLegendCaption = new CaptionItem("Command Buttons");
            this.EditorDescription = "This is a dialog from the Metadata Cleaner Plugin which provides a quick help overview " +
                                     "of the status and button items in the main view";
        }

        public override string EditorTitle => null;

        /// <summary>Gets the editor description.</summary>
        /// <value>The editor description.</value>
        public override string EditorDescription { get; }

        public CaptionItem StatusLegendCaption { get; set; }

        [DisplayName("Phrase Status")]
        public GenericItemList StatusLegend { get; set; } = new GenericItemList();

        public CaptionItem CommandsLegendCaption { get; set; }

        [DisplayName("Command Buttons")]
        public GenericItemList CommandsLegend { get; set; } = new GenericItemList();

        private void BuildLists()
        {
            this.StatusLegend.Clear();
            this.CommandsLegend.Clear();

            // Status Items List
            this.StatusLegend.Add(new GenericListItem
                                      {
                                          PrimaryText = "New Phrase",
                                          SecondaryText = "Please choose whether to allow, merge or block.\nThe cleaning action for those depends on the configuration for new item handling",
                                          Icon = IconNames.bookmark_added,
                                          IconMode = ItemListIconMode.LargeRegular,
                                          Status = ItemStatus.Warning,
                                      });

            this.StatusLegend.Add(new GenericListItem
                                    {
                                        PrimaryText = "Allowed Phrase",
                                        SecondaryText = "These phrases are allowed and will not be affected by cleaning operations",
                                        Icon = IconNames.bookmark,
                                        IconMode = ItemListIconMode.LargeRegular,
                                        Status = ItemStatus.Succeeded,
                                    });

            this.StatusLegend.Add(new GenericListItem
                                    {
                                        PrimaryText = "Phrase with Merged Phrases",
                                        SecondaryText = "Allowed phrase, child phrases will be renamed and merged into it",
                                        Icon = IconNames.bookmarks,
                                        IconMode = ItemListIconMode.LargeRegular,
                                        Status = ItemStatus.Succeeded,
                                    });

            this.StatusLegend.Add(new GenericListItem
                                    {
                                        PrimaryText = "Blocked Phrase",
                                        SecondaryText = "Blocked phrases will be removed by cleaning",
                                        Icon = IconNames.bookmark_outline,
                                        IconMode = ItemListIconMode.LargeRegular,
                                        Status = ItemStatus.Failed,
                                    });

            // Commands List
            this.CommandsLegend.Add(new GenericListItem
                                        {
                                            PrimaryText = "Allow",
                                            SecondaryText = "Mark a phrase as allowed",
                                            Icon = IconNames.add_circle_outline,
                                            IconMode = ItemListIconMode.LargeRegular,
                                        });

            this.CommandsLegend.Add(new GenericListItem
                                        {
                                            PrimaryText = "Block",
                                            SecondaryText = "Mark a phrase as blocked",
                                            Icon = IconNames.remove_circle_outline,
                                            IconMode = ItemListIconMode.LargeRegular,
                                        });

            this.CommandsLegend.Add(new GenericListItem
                                        {
                                            PrimaryText = "Merge",
                                            SecondaryText = "Opens a dialog to select a phrase to merge into",
                                            Icon = IconNames.move_down,
                                            IconMode = ItemListIconMode.LargeRegular,
                                        });

            this.CommandsLegend.Add(new GenericListItem
                                        {
                                            PrimaryText = "Remove from Merge List",
                                            SecondaryText = "Phrase will be removed and returned to the list as new phrase",
                                            Icon = IconNames.logout,
                                            IconMode = ItemListIconMode.LargeRegular,
                                        });
        }
    }
}
