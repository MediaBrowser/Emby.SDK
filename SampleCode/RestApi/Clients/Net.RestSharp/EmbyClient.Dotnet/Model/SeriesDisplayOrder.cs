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
    /// Defines SeriesDisplayOrder
    /// </summary>
    [JsonConverter(typeof(StringEnumConverter))]
        public enum SeriesDisplayOrder
    {
        /// <summary>
        /// Enum Aired for value: Aired
        /// </summary>
        [EnumMember(Value = "Aired")]
        Aired = 1,
        /// <summary>
        /// Enum Dvd for value: Dvd
        /// </summary>
        [EnumMember(Value = "Dvd")]
        Dvd = 2,
        /// <summary>
        /// Enum Absolute for value: Absolute
        /// </summary>
        [EnumMember(Value = "Absolute")]
        Absolute = 3    }
}
