// <copyright file="ShowPlaylistStreamsUi.cs" company="Emby LLC">
// Copyright © 2022 - softworkz for Emby LLC. All rights reserved.
// </copyright>

namespace EmbyPluginUiDemo.UI.DialogFullscreenGrid
{
    using System.Collections.Generic;
    using System.ComponentModel;
    using System.Linq;
    using Emby.Web.GenericEdit;
    using Emby.Web.GenericEdit.Elements;
    using Emby.Web.GenericEdit.Elements.DxGrid;
    using EmbyPluginUiDemo.Model;
    using MediaBrowser.Controller.Entities;
    using MediaBrowser.Model.Attributes;
    using MediaBrowser.Model.Serialization;

    public class ShowPlaylistStreamsUi : EditableObjectBase
    {
        public ShowPlaylistStreamsUi()
        {
        }

        public ShowPlaylistStreamsUi(List<GridDataItem> itemList)
        {
            this.ItemList = itemList;
        }

        [Browsable(false)]
        public List<GridDataItem> ItemList { get; set; }

        [Browsable(false)]
        public bool BindFilter { get; set; }

        [Browsable(false)]
        public JsonString ItemFilter { get; set; }

        [Browsable(false)]
        public JsonString DataItemFilter { get; set; }

        [Browsable(false)]
        public DoubleGridOverlay HelpOverlay { get; set; }

        [GridDataSource(nameof(ItemList))]
        [GridFilterSource(nameof(ItemFilter), nameof(DataItemFilter))]
        public DxDataGrid ChannelsGrid
        {
            get
            {
                var options = new DxGridOptions(new GridDataItem(), nameof(GridDataItem.InternalId), false, false, true, false);

                options.heightMode = DxGridOptions.GridHeightMode.fullHeight;

                foreach (var column in options.columns)
                {
                    if (column.lookup?.dataSource != null)
                    {
                        column.editorOptions = new DxSelectBoxOptions { searchEnabled = false, applyValueMode = DxSelectBoxOptions.ApplyValueModes.instantly };
                    }

                    column.allowEditing = false;
                }

                options.columns[nameof(GridDataItem.InternalId)].width = 90;
                ////options.columns[nameof(Video.TvgLogo)].width = 250;
                ////options.columns[nameof(Video.PlaylistIndex)].width = 90;
                options.columns[nameof(GridDataItem.Name)].width = 250;
                ////options.columns[nameof(Video.TvgName)].width = 250;
                ////options.columns[nameof(Video.SourceUrl)].width = 250;
                ////options.columns[nameof(Video.ChannelId)].width = 150;
                ////options.columns[nameof(Video.TvgChNo)].width = 110;
                ////options.columns[nameof(Video.UrlStreamId)].visible = false;
                ////options.columns[nameof(Video.TvgGenre)].width = 150;
                ////options.columns[nameof(Video.TvgTag)].width = 150;
                ////options.columns[nameof(Video.GroupTitle)].width = 250;

                ////options.columns[nameof(Video.GroupTitle)].visibleIndex = 0;
                ///// ptions.columns[nameof(Video.Name)].visibleIndex = 1;
                ////options.columns[nameof(Video.TvgName)].visibleIndex = 2;
                ////options.columns[nameof(Video.ChannelId)].visibleIndex = 3;
                ////options.columns[nameof(Video.TvgChNo)].visibleIndex = 4;

                ////options.columns[nameof(ScanChannelActionEdit.Name)].width = 200;

                ////options.editing = new DxGridEditing
                ////{
                ////    allowAdding = false,
                ////    allowDeleting = false,
                ////    allowUpdating = true,
                ////    mode = DxGridEditing.GridEditMode.cell,
                ////    selectTextOnEditStart = true,
                ////};

                var nameColumn = options.columns.FirstOrDefault(e => e.dataField == "Name");
                if (nameColumn != null)
                {
                    ////nameColumn.@fixed = true;
                    nameColumn.visible = true;
                }

                ////options.columnFixing = new DxGridColumnFixing
                ////{
                ////    enabled = true,
                ////};

                if (this.BindFilter)
                {
                    options.filterSyncEnabled = @"true";
                    options.headerFilter = new DxGridHeaderFilter
                    {
                        allowSearch = true,
                        visible = true,
                    };

                    options.filterPanel = new DxGridFilterPanel
                    {
                        filterEnabled = true,
                        visible = true,
                    };
                }

                var grid = new DxDataGrid(options);

                if (this.HelpOverlay != null)
                {
                    grid.HelpOverlay = this.HelpOverlay;
                    grid.ShowHelpOverlay = true;
                }

                return grid;
            }
        }

        /// <summary>Gets the editor title.</summary>
        /// <value>The editor title.</value>
        public override string EditorTitle { get; } = null;
    }
}