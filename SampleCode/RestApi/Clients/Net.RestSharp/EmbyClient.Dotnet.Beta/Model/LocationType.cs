/*
 * EmbyClient.Dotnet.Beta
 * API Version: 4.8.0.3
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
    /// Defines LocationType
    /// </summary>
    [JsonConverter(typeof(StringEnumConverter))]
        public enum LocationType
    {
        /// <summary>
        /// Enum FileSystem for value: FileSystem
        /// </summary>
        [EnumMember(Value = "FileSystem")]
        FileSystem = 1,
        /// <summary>
        /// Enum Virtual for value: Virtual
        /// </summary>
        [EnumMember(Value = "Virtual")]
        Virtual = 2    }
}
