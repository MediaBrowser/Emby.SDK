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
    /// Defines MetadataRefreshMode
    /// </summary>
    [JsonConverter(typeof(StringEnumConverter))]
        public enum MetadataRefreshMode
    {
        /// <summary>
        /// Enum ValidationOnly for value: ValidationOnly
        /// </summary>
        [EnumMember(Value = "ValidationOnly")]
        ValidationOnly = 1,
        /// <summary>
        /// Enum Default for value: Default
        /// </summary>
        [EnumMember(Value = "Default")]
        Default = 2,
        /// <summary>
        /// Enum FullRefresh for value: FullRefresh
        /// </summary>
        [EnumMember(Value = "FullRefresh")]
        FullRefresh = 3    }
}
