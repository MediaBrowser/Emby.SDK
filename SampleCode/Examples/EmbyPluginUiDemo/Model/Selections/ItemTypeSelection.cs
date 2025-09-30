// <copyright file="ItemTypeSelection.cs" company="Emby LLC">
// Copyright © 2022 - softworkz for Emby LLC. All rights reserved.
// </copyright>

namespace EmbyPluginUiDemo.Model.Selections
{
    using System.Linq;

    public class ItemTypeSelection : EnumSelectionBase<DemoItemType>
    {
        public ItemTypeSelection()
        {
            this.IntItems.Clear();
            this.IntItems.AddRange(new[] { DemoItemType.Movies, DemoItemType.Series, DemoItemType.Albums, DemoItemType.Photos }.Select(e => new EnumSelectionItem<DemoItemType>(e)));
        }
    }
}
