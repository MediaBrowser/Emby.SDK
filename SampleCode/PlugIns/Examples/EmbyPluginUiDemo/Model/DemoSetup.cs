// <copyright file="DemoSetup.cs" company="Emby LLC">
// Copyright © 2022 - softworkz for Emby LLC. All rights reserved.
// </copyright>

namespace EmbyPluginUiDemo.Model
{
    using System;
    using System.Collections.Generic;

    [Serializable]
    [System.ComponentModel.DesignerCategory("code")]
    [System.Xml.Serialization.XmlType(AnonymousType = true)]
    [System.Xml.Serialization.XmlRoot(Namespace = "", IsNullable = false)]
    public class DemoSetup
    {
        /// <summary>Initializes a new instance of the <see cref="DemoSetup"/> class.</summary>
        public DemoSetup()
        {
            this.ItemTypes = new List<DemoItemType>();
        }

        public List<DemoItemType> ItemTypes { get; set; }
    }
}
