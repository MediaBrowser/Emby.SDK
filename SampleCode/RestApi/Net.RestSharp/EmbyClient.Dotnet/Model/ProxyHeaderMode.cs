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
    /// Defines ProxyHeaderMode
    /// </summary>
    [JsonConverter(typeof(StringEnumConverter))]
        public enum ProxyHeaderMode
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
        /// Enum RemoteAddressesOnly for value: RemoteAddressesOnly
        /// </summary>
        [EnumMember(Value = "RemoteAddressesOnly")]
        RemoteAddressesOnly = 3,
        /// <summary>
        /// Enum AllAddresses for value: AllAddresses
        /// </summary>
        [EnumMember(Value = "AllAddresses")]
        AllAddresses = 4    }
}
