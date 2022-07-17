// <copyright file="Set1DemoTypes.cs" company="Emby LLC">
// Copyright © 2022 - Emby LLC. All rights reserved.
// </copyright>

namespace Emby.Plugin.GenericEditDemo.Data.Demoset1
{
    using System.ComponentModel;

    public enum Set1DemoTypes
    {
        [Description("Basic")]
        Basic,

        [Description("Selection")]
        Select,

        [Description("States")]
        ControlStates,

        [Description("Constraints")]
        Constraints,

        [Description("Nesting")]
        Nesting,

        [Description("Conditions")]
        Conditions,

        [Description("Validation")]
        Validation,
    }
}
