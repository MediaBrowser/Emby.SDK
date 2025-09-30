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
    /// Enum ConfigurationPageType  
    /// </summary>
    /// <value>Enum ConfigurationPageType  </value>
    [JsonConverter(typeof(StringEnumConverter))]
        public enum PluginsConfigurationPageType
    {
        /// <summary>
        /// Enum PluginConfiguration for value: PluginConfiguration
        /// </summary>
        [EnumMember(Value = "PluginConfiguration")]
        PluginConfiguration = 1,
        /// <summary>
        /// Enum None for value: None
        /// </summary>
        [EnumMember(Value = "None")]
        None = 2    }
}
