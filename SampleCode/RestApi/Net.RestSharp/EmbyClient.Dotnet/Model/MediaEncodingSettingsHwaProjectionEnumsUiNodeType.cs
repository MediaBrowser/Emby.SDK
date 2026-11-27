/*
 * EmbyClient.Dotnet
 */

using System;
using System.Linq;
using System.IO;
using System.Text;
using System.Text.RegularExpressions;
using System.Collections;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Runtime.Serialization;
using Newtonsoft.Json;
using Newtonsoft.Json.Converters;
using SwaggerDateConverter = EmbyClient.Dotnet.Client.SwaggerDateConverter;

namespace EmbyClient.Dotnet.Model
{
    /// <summary>
    /// Defines MediaEncoding.Settings.Hwa.Projection.Enums.UiNodeType
    /// </summary>
    [JsonConverter(typeof(StringEnumConverter))]
        public enum MediaEncodingSettingsHwaProjectionEnumsUiNodeType
    {
        /// <summary>
        /// Enum Unknown for value: Unknown
        /// </summary>
        [EnumMember(Value = "Unknown")]
        Unknown = 1,
        /// <summary>
        /// Enum Root for value: Root
        /// </summary>
        [EnumMember(Value = "Root")]
        Root = 2,
        /// <summary>
        /// Enum Graph for value: Graph
        /// </summary>
        [EnumMember(Value = "Graph")]
        Graph = 3,
        /// <summary>
        /// Enum LoadBalancer for value: LoadBalancer
        /// </summary>
        [EnumMember(Value = "LoadBalancer")]
        LoadBalancer = 4,
        /// <summary>
        /// Enum GpuConfig for value: GpuConfig
        /// </summary>
        [EnumMember(Value = "GpuConfig")]
        GpuConfig = 5,
        /// <summary>
        /// Enum ErrorOut for value: ErrorOut
        /// </summary>
        [EnumMember(Value = "ErrorOut")]
        ErrorOut = 6,
        /// <summary>
        /// Enum UiHint for value: UiHint
        /// </summary>
        [EnumMember(Value = "UiHint")]
        UiHint = 7,
        /// <summary>
        /// Enum Divider for value: Divider
        /// </summary>
        [EnumMember(Value = "Divider")]
        Divider = 8    }
}
