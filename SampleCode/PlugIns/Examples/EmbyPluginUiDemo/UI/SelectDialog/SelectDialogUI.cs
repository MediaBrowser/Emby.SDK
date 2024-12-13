// <copyright file="SelectDialogUI.cs" company="Emby LLC">
// Copyright © 2022 - softworkz for Emby LLC. All rights reserved.
// </copyright>

namespace EmbyPluginUiDemo.UI.SelectDialog
{
    using System.Collections.Generic;
    using System.ComponentModel;
    using System.Globalization;
    using System.Linq;
    using Emby.Media.Common.Extensions;
    using Emby.Web.GenericEdit;
    using Emby.Web.GenericEdit.Common;
    using EmbyPluginUiDemo.Model;
    using MediaBrowser.Model.Attributes;
    using MediaBrowser.Model.Extensions;

    public class SelectDialogUI : EditableOptionsBase
    {
        public override string EditorTitle => null;

        public override string EditorDescription => "Find and select an item";

        [Browsable(false)]
        public List<EditorSelectOption> SearchItems { get; set; }

        [DisplayName("Enter Search Term")]
        [AutoPostBack(SelectDialogView.PostBack, nameof(SearchFilter))]
        public string SearchFilter { get; set; }

        [DisplayName("Search Results")]
        [SelectItemsSource(nameof(SearchItems))]
        [EditMultiline(12)]
        public string SelectedItem { get; set; }

        public void UpdatePhrasesList(List<GridDataItem> itemList)
        {
            this.SearchItems = new List<EditorSelectOption>();

            IEnumerable<GridDataItem> displayList = itemList;

            if (this.SearchFilter.IsNotEmpty())
            {
                displayList = displayList.Where(e => e.Name.ContainsIgnoreCase(this.SearchFilter.Trim()));
            }

            foreach (var item in displayList.OrderBy(e => e.Name))
            {
                this.SearchItems.Add(new EditorSelectOption
                {
                    Name = item.Name,
                    Value = item.InternalId.ToString(CultureInfo.InvariantCulture),
                    IsEnabled = true,
                });
            }
        }
    }
}
