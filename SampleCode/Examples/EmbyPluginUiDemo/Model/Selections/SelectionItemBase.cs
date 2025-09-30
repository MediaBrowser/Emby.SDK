// <copyright file="SelectionItemBase.cs" company="Emby LLC">
// Copyright © 2022 - softworkz for Emby LLC. All rights reserved.
// </copyright>

namespace EmbyPluginUiDemo.Model.Selections
{
    using System.ComponentModel;

    public class SelectionItemBase
    {
        [Browsable(false)]
        public virtual string Key { get; set; }

        public virtual bool IsSelected { get; set; }

        public virtual string DisplayName { get; set; }

        public virtual string Description { get; set; }
    }

    public abstract class SelectionItemBase<T> : SelectionItemBase
    {
        public abstract T Item { get; set; }
    }
}
