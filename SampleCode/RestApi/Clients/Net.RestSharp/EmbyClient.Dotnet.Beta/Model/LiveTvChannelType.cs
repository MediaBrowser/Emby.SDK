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
    /// Defines LiveTv.ChannelType
    /// </summary>
    [JsonConverter(typeof(StringEnumConverter))]
        public enum LiveTvChannelType
    {
        /// <summary>
        /// Enum TV for value: TV
        /// </summary>
        [EnumMember(Value = "TV")]
        TV = 1,
        /// <summary>
        /// Enum Radio for value: Radio
        /// </summary>
        [EnumMember(Value = "Radio")]
        Radio = 2    }
}