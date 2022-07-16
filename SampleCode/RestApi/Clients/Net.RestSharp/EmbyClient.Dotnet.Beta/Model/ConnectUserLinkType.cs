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
    /// Defines Connect.UserLinkType
    /// </summary>
    [JsonConverter(typeof(StringEnumConverter))]
        public enum ConnectUserLinkType
    {
        /// <summary>
        /// Enum LinkedUser for value: LinkedUser
        /// </summary>
        [EnumMember(Value = "LinkedUser")]
        LinkedUser = 1,
        /// <summary>
        /// Enum Guest for value: Guest
        /// </summary>
        [EnumMember(Value = "Guest")]
        Guest = 2    }
}
