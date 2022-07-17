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
    /// Defines Library.PlayAccess
    /// </summary>
    [JsonConverter(typeof(StringEnumConverter))]
        public enum LibraryPlayAccess
    {
        /// <summary>
        /// Enum Full for value: Full
        /// </summary>
        [EnumMember(Value = "Full")]
        Full = 1,
        /// <summary>
        /// Enum None for value: None
        /// </summary>
        [EnumMember(Value = "None")]
        None = 2    }
}
