/*
 * EmbyClient.Dotnet.Beta
 * API Version: 4.8.0.6
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
using SwaggerDateConverter = EmbyClient.Dotnet.Beta.Client.SwaggerDateConverter;

namespace EmbyClient.Dotnet.Beta.Model
{
    /// <summary>
    /// Defines Providers.MetadataRefreshMode
    /// </summary>
    [JsonConverter(typeof(StringEnumConverter))]
        public enum ProvidersMetadataRefreshMode
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
