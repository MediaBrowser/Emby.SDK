// <copyright file="DataGrid2.cs" company="Emby LLC">
// Copyright © 2022 - Emby LLC. All rights reserved.
// </copyright>

namespace Emby.Plugin.GenericEditDemo.Data.Demoset2.Demos
{
    using System.Collections.Generic;
    using System.ComponentModel;
    using System.Linq;
    using Emby.Web.GenericEdit;
    using Emby.Web.GenericEdit.Elements;
    using Emby.Web.GenericEdit.Elements.Grid;
    using MediaBrowser.Model.Activity;
    using MediaBrowser.Model.Attributes;

    public class DataGrid2 : EditableOptionsBase
    {
        public override string EditorTitle => "Large Editable DataGrid";

        public override string EditorDescription =>
            "The data can be edited in the Grid, but don't worry, there's not saving implemented, you can play "
            + "around with no worries.";

        [Browsable(false)]
        public IList<ActivityLogEntry> ActivityList { get; set; }

        public SpacerItem Spacer1 { get; set; } = new SpacerItem();

        public CaptionItem CaptionStrings { get; set; } = new CaptionItem("Activity List");

        public LabelItem LabelItem1 { get; set; } = new LabelItem();

        [DisplayName("")]
        [GridDataSource(nameof(ActivityList))]
        public GenericGrid TestGrid
        {
            get
            {
                var options = new GridOptions(new ActivityLogEntry(), nameof(ActivityLogEntry.Id), false, false, true, true);

                options.heightMode = GridOptions.GridHeightMode.large;

                options.editing = new GridEditing
                {
                    allowAdding = true,
                    allowDeleting = true,
                    allowUpdating = true,
                    selectTextOnEditStart = true,
                    useIcons = true,
                    mode = GridEditing.GridEditMode.batch,
                };

                options.renderAsync = true;
                options.repaintChangesOnly = true;

                options.scrolling.columnRenderingMode = GridScrolling.ColumnRenderingMode.@virtual;
                options.scrolling.rowRenderingMode = GridScrolling.RowRenderingMode.@virtual;
                options.scrolling.mode = GridScrolling.ScrollingMode.@virtual;
                options.selection.mode = GridSelection.SelectionMode.multiple;

                foreach (var column in options.columns)
                {
                    if (column.lookup?.dataSource != null)
                    {
                        column.editorOptions = new SelectBoxOptions { searchEnabled = false, applyValueMode = SelectBoxOptions.ApplyValueModes.instantly };
                    }
                }

                var indexColumn = options.columns.FirstOrDefault(e => e.dataField == nameof(ActivityLogEntry.Id));
                if (indexColumn != null)
                {
                    ////indexColumn.@fixed = true;
                    indexColumn.visible = true;
                    indexColumn.allowEditing = false;
                }

                var nameColumn = options.columns.FirstOrDefault(e => e.dataField == nameof(ActivityLogEntry.Name));
                if (nameColumn != null)
                {
                    ////nameColumn.@fixed = true;
                    nameColumn.visible = true;
                }

                var grid = new GenericGrid(options);

                return grid;
            }
        }

        public SpacerItem Spacer2 { get; set; } = new SpacerItem();

        public void CreateListItems(IActivityManager activityManager)
        {
            this.ActivityList = activityManager.GetActivityLogEntries(null, 0, 10_000).Items.ToList();
            this.LabelItem1.Text = string.Format("Entries loaded: {0:D}", this.ActivityList.Count);
        }
    }
}
