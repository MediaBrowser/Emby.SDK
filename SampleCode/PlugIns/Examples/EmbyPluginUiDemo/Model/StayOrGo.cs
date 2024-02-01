// <copyright file="StayOrGo.cs" company="Emby LLC">
// Copyright © 2022 - Emby LLC. All rights reserved.
// </copyright>

namespace EmbyPluginUiDemo.Model
{
    using System.ComponentModel;

    public enum StayOrGo
    {
        [Description("I don't know")]
        DontKnow,

        [Description("I Will stay")]
        Stay,

        [Description("I Will go")]
        Go,

        [Description("I will go later")]
        GoLater,
    }
}