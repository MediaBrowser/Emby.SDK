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
    /// Defines MediaSourceType
    /// </summary>
    [JsonConverter(typeof(StringEnumConverter))]
        public enum MediaSourceType
    {
        /// <summary>
        /// Enum Default for value: Default
        /// </summary>
        [EnumMember(Value = "Default")]
        Default = 1,
        /// <summary>
        /// Enum Grouping for value: Grouping
        /// </summary>
        [EnumMember(Value = "Grouping")]
        Grouping = 2,
        /// <summary>
        /// Enum Placeholder for value: Placeholder
        /// </summary>
        [EnumMember(Value = "Placeholder")]
        Placeholder = 3    }
}
