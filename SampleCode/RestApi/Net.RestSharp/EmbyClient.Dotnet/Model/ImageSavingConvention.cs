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
    /// Defines ImageSavingConvention
    /// </summary>
    [JsonConverter(typeof(StringEnumConverter))]
        public enum ImageSavingConvention
    {
        /// <summary>
        /// Enum Legacy for value: Legacy
        /// </summary>
        [EnumMember(Value = "Legacy")]
        Legacy = 1,
        /// <summary>
        /// Enum Compatible for value: Compatible
        /// </summary>
        [EnumMember(Value = "Compatible")]
        Compatible = 2    }
}
