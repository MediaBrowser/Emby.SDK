// <copyright file="EnumSelectionBase.cs" company="Emby LLC">
// Copyright © 2022 - softworkz for Emby LLC. All rights reserved.
// </copyright>

namespace EmbyPluginUiDemo.Model.Selections
{
    using System;
    using System.Linq;

    public abstract class EnumSelectionBase<T> : SelectionBase<EnumSelectionItem<T>, T>
        where T : struct, Enum
    {
        protected EnumSelectionBase()
        {
            var enumValues = Enum.GetValues(typeof(T)).Cast<T>();

            this.IntItems.Clear();
            this.IntItems.AddRange(enumValues.Select(e => new EnumSelectionItem<T>(e)).ToList());
        }

        public void SetFromValues(params T[] values)
        {
            this.SetFromKeys(values.Select(e => e.ToString()).ToList());
        }
    }
}
