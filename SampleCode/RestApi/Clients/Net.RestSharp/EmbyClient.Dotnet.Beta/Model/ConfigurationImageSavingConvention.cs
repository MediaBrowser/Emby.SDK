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
    /// Defines Configuration.ImageSavingConvention
    /// </summary>
    [JsonConverter(typeof(StringEnumConverter))]
        public enum ConfigurationImageSavingConvention
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