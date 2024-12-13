// <copyright file="DemoItemType.cs" company="Emby LLC">
// Copyright © 2022 - softworkz for Emby LLC. All rights reserved.
// </copyright>

namespace EmbyPluginUiDemo.Model
{
    using System.ComponentModel;

    public enum DemoItemType
    {
        [Description("Movies")]
        Movies,

        [Description("TV Series")]
        Series,

        [Description("Music")]
        Albums,

        [Description("Photos")]
        Photos,

        [Description("Books")]
        Books,

        [Description("Games")]
        Games,
    }
}
