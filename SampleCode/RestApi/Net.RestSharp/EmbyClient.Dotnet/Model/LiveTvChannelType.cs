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
    /// Enum ChannelType  
    /// </summary>
    /// <value>Enum ChannelType  </value>
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
