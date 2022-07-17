// <copyright file="DemoTypeInfo.cs" company="Emby LLC">
// Copyright © 2022 - Emby LLC. All rights reserved.
// </copyright>

namespace Emby.Plugin.GenericEditDemo.Data
{
    using System;
    using System.Collections.Generic;
    using Emby.Plugin.GenericEditDemo.Data.Demoset1;
    using Emby.Plugin.GenericEditDemo.Data.Demoset2;
    using Emby.Web.GenericEdit.Common;

    /// <summary>
    /// DemoTypeInfo class.
    /// </summary>
    public class DemoTypeInfo
    {
        /// <summary>Gets or sets the type of the demo.</summary>
        /// <value>The type of the demo.</value>
        public int DemoType { get; set; }

        /// <summary>Gets or sets the name of the demo.</summary>
        /// <value>The name of the demo.</value>
        public string Name { get; set; }

        /// <summary>Creates a <see cref="DemoTypeInfo"/> from a <see cref="Set1DemoTypes"/> enum value.</summary>
        /// <param name="demoType">Type of the demo.</param>
        /// <returns>A <see cref="DemoTypeInfo"/>.</returns>
        public static DemoTypeInfo FromDemoType(Set1DemoTypes demoType)
        {
            return new DemoTypeInfo
                       {
                           DemoType = (int)demoType,
                           Name = demoType.GetDescription(),
                       };
        }

        /// <summary>Creates a <see cref="DemoTypeInfo"/> from a <see cref="Set1DemoTypes"/> enum value.</summary>
        /// <param name="demoType">Type of the demo.</param>
        /// <returns>A <see cref="DemoTypeInfo"/>.</returns>
        public static DemoTypeInfo FromDemoType(Set2DemoTypes demoType)
        {
            return new DemoTypeInfo
                       {
                           DemoType = (int)demoType,
                           Name = demoType.GetDescription(),
                       };
        }

        /// <summary>Gets the demo list.</summary>
        /// <returns>A list of <see cref="DemoTypeInfo"/>.</returns>
        public static IList<DemoTypeInfo> GetSet1DemoList()
        {
            var list = new List<DemoTypeInfo>();

            foreach (Set1DemoTypes member in Enum.GetValues(typeof(Set1DemoTypes)))
            {
                list.Add(FromDemoType(member));
            }

            return list;
        }

        /// <summary>Gets the demo list.</summary>
        /// <returns>A list of <see cref="DemoTypeInfo"/>.</returns>
        public static IList<DemoTypeInfo> GetSet2DemoList()
        {
            var list = new List<DemoTypeInfo>();

            foreach (Set2DemoTypes member in Enum.GetValues(typeof(Set2DemoTypes)))
            {
                list.Add(FromDemoType(member));
            }

            return list;
        }
    }
}
