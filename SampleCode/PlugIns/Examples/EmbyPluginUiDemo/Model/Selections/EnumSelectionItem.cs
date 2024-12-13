// <copyright file="EnumSelectionItem.cs" company="Emby LLC">
// Copyright © 2022 - softworkz for Emby LLC. All rights reserved.
// </copyright>

namespace EmbyPluginUiDemo.Model.Selections
{
    using System;
    using Emby.Web.GenericEdit.Common;

    public class EnumSelectionItem<T> : SelectionItemBase<T> where T : struct, Enum
    {
        public EnumSelectionItem(T item)
        {
            this.Item = item;
            this.Key = item.ToString();
            this.DisplayName = item.ToString("g");
            this.Description = item.GetDescription();
        }

        public override T Item { get; set; }

        public override string Key { get; set; }

        public override string DisplayName { get; set; }

        public override string Description { get; set; }
    }
}
