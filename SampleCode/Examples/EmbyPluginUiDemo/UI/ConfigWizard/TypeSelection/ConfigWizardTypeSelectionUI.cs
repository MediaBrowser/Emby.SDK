// <copyright file="ConfigWizardTypeSelectionUI.cs" company="Emby LLC">
// Copyright © 2022 - softworkz for Emby LLC. All rights reserved.
// </copyright>

namespace EmbyPluginUiDemo.UI.ConfigWizard.TypeSelection
{
    using System.Collections.Generic;
    using System.ComponentModel;
    using System.Linq;
    using Emby.Web.GenericEdit;
    using Emby.Web.GenericEdit.Elements;
    using Emby.Web.GenericEdit.Elements.DxGrid;
    using EmbyPluginUiDemo.Model.Selections;
    using MediaBrowser.Model.Attributes;

    public class ConfigWizardTypeSelectionUI : EditableOptionsBase
    {
        public override string EditorTitle => this.Title;

        /// <summary>Gets the editor description.</summary>
        /// <value>The editor description.</value>
        public override string EditorDescription => this.Description;

        public SpacerItem Spacer1 { get; set; } = new SpacerItem();

        [Browsable(false)]
        public string Title { get; set; }

        [Browsable(false)]
        public string Description { get; set; }

        [Browsable(false)]
        public IList<SelectionItemBase> SelectionItems { get; set; } = new List<SelectionItemBase>();

        ////[Browsable(false)]
        ////public IList<EditorSelectOption> SelectionOptions { get; set; } = new List<EditorSelectOption>();

        ////[SelectItemsSource(nameof(SelectionOptions))]
        ////[EditMultilSelect]
        ////public string SelectedItemTypes { get; set; }

        ////[SelectItemsSource(nameof(SelectionOptions))]
        ////[EditMultilSelect]
        ////[EditMultiline(6)]
        ////public string SelectedItemTypes2 { get; set; }

        [DisplayName("Select one or more items:")]
        [GridDataSource(nameof(SelectionItems))]
        public DxDataGrid SelectionGrid
        {
            get
            {
                var options = new DxGridOptions(new SelectionItemBase(), nameof(SelectionItemBase.Key), false, true, false, false);

                options.selection.mode = DxGridSelection.SelectionMode.none;
                options.focusedRowEnabled = false;
                options.columnResizingMode = DxGridOptions.ColumnResizingMode.nextColumn;
                options.heightMode = DxGridOptions.GridHeightMode.medium;

                options.grouping = null;

                var idColumn = options.columns.FirstOrDefault(e => e.dataField == nameof(SelectionItemBase.Key));
                if (idColumn != null)
                {
                    idColumn.visible = false;
                }

                foreach (var column in options.columns)
                {
                    column.allowEditing = false;
                    column.visible = false;
                }

                var nameColumn = options.columns.FirstOrDefault(e => e.dataField == nameof(SelectionItemBase.DisplayName));
                if (nameColumn != null)
                {
                    nameColumn.caption = "Item Type";
                    nameColumn.visible = true;
                    nameColumn.width = 250;
                }

                var descColumn = options.columns.FirstOrDefault(e => e.dataField == nameof(SelectionItemBase.Description));
                if (descColumn != null)
                {
                    descColumn.caption = "Number of items";
                    descColumn.visible = true;
                }

                var selectColumn = options.columns.FirstOrDefault(e => e.dataField == nameof(SelectionItemBase.IsSelected));
                if (selectColumn != null)
                {
                    selectColumn.visible = true;
                    selectColumn.allowEditing = true;
                    selectColumn.width = 80;
                    selectColumn.caption = " ";
                    selectColumn.allowSorting = false;
                    selectColumn.allowResizing = false;
                    selectColumn.allowReordering = false;
                    selectColumn.showEditorAlways = true;
                    selectColumn.dataType = DxGridColumn.ColumnDataType.boolean;
                }

                options.editing = new DxGridEditing
                {
                    allowAdding = false,
                    allowDeleting = false,
                    allowUpdating = true,
                    mode = DxGridEditing.GridEditMode.cell,
                    selectTextOnEditStart = true,
                };

                options.keyboardNavigation = new KeyBoardNav();

                var grid = new DxDataGrid(options);

                return grid;
            }
        }

        public void SetSelectOptions(ISelectionBase selectionBase)
        {
            this.SelectionItems = selectionBase.Items
                .Select(e => new SelectionItemBase { Key = e.Key, DisplayName = e.DisplayName, Description = e.Description, IsSelected = e.IsSelected })
                .ToList();

            ////this.SelectionOptions = selectionBase.Items
            ////    .Select(e => new EditorSelectOption { Value = e.Key, Name = e.DisplayName, IsEnabled = true, })
            ////    .ToList();
        }

        public void GetSelection(ISelectionBase selectionBase)
        {
            var keys = this.SelectionItems.Where(e => e.IsSelected).Select(e => e.Key).ToList();
            selectionBase.SetFromKeys(keys);
        }

        public class KeyBoardNav
        {
            public bool enabled { get; set; } = true;

            public bool editOnKeyPress { get; set; } = true;
        }
    }
}
