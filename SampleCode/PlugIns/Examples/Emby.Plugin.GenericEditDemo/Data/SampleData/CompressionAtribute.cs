// <copyright file="CompressionAtribute.cs" company="Emby LLC">
// Copyright © 2022 - Emby LLC. All rights reserved.
// </copyright>

namespace Emby.Plugin.GenericEditDemo.Data.SampleData
{
    using System;

    /// <summary>
    /// Attribute for specifying the kind of compression for a media format.
    /// </summary>
    /// <seealso cref="Attribute" />
    [AttributeUsage(AttributeTargets.Field, AllowMultiple = false)]
    public class CompressionAttribute : Attribute
    {
        public CompressionAttribute(CompressionKinds compressionKind)
        {
            this.CompressionKind = compressionKind;
        }

        public CompressionKinds CompressionKind { get; }
    }
}