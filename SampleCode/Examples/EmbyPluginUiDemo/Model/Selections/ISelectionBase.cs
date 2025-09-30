// <copyright file="ISelectionBase.cs" company="Emby LLC">
// Copyright © 2022 - softworkz for Emby LLC. All rights reserved.
// </copyright>

namespace EmbyPluginUiDemo.Model.Selections
{
    using System.Collections.Generic;

    public interface ISelectionBase
    {
        IReadOnlyCollection<SelectionItemBase> Items { get; }

        IReadOnlyCollection<SelectionItemBase> SelectedItems { get; }

        int SelectedItemCount { get; }

        bool IsFixed { get; }

        bool IsVariable { get; }

        string GetAsString();

        string CreateItemsString();

        void SetFromKeys(IList<string> keys);
    }
}