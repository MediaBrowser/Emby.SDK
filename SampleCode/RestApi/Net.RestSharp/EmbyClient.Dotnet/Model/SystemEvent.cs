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
    /// Enum SystemEvent  
    /// </summary>
    /// <value>Enum SystemEvent  </value>
    [JsonConverter(typeof(StringEnumConverter))]
        public enum SystemEvent
    {
        /// <summary>
        /// Enum WakeFromSleep for value: WakeFromSleep
        /// </summary>
        [EnumMember(Value = "WakeFromSleep")]
        WakeFromSleep = 1,
        /// <summary>
        /// Enum DisplayConfigurationChange for value: DisplayConfigurationChange
        /// </summary>
        [EnumMember(Value = "DisplayConfigurationChange")]
        DisplayConfigurationChange = 2,
        /// <summary>
        /// Enum NetworkChange for value: NetworkChange
        /// </summary>
        [EnumMember(Value = "NetworkChange")]
        NetworkChange = 3    }
}
