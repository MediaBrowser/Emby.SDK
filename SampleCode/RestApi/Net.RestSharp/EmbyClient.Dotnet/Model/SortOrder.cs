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
    /// Enum SortOrder  
    /// </summary>
    /// <value>Enum SortOrder  </value>
    [JsonConverter(typeof(StringEnumConverter))]
        public enum SortOrder
    {
        /// <summary>
        /// Enum Ascending for value: Ascending
        /// </summary>
        [EnumMember(Value = "Ascending")]
        Ascending = 1,
        /// <summary>
        /// Enum Descending for value: Descending
        /// </summary>
        [EnumMember(Value = "Descending")]
        Descending = 2    }
}
