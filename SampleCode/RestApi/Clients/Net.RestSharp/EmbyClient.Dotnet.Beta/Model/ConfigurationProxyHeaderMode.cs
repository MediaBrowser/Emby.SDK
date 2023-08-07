/*
 * EmbyClient.Dotnet.Beta
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
    /// Defines Configuration.ProxyHeaderMode
    /// </summary>
    [JsonConverter(typeof(StringEnumConverter))]
        public enum ConfigurationProxyHeaderMode
    {
        /// <summary>
        /// Enum None for value: None
        /// </summary>
        [EnumMember(Value = "None")]
        None = 1,
        /// <summary>
        /// Enum LanAddressesOnly for value: LanAddressesOnly
        /// </summary>
        [EnumMember(Value = "LanAddressesOnly")]
        LanAddressesOnly = 2,
        /// <summary>
        /// Enum AllAddresses for value: AllAddresses
        /// </summary>
        [EnumMember(Value = "AllAddresses")]
        AllAddresses = 3    }
}
