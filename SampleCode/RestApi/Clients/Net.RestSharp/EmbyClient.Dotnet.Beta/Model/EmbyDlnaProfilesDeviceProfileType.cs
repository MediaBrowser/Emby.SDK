/*
 * EmbyClient.Dotnet.Beta
 * API Version: 4.8.0.3
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
    /// Defines Emby.Dlna.Profiles.DeviceProfileType
    /// </summary>
    [JsonConverter(typeof(StringEnumConverter))]
        public enum EmbyDlnaProfilesDeviceProfileType
    {
        /// <summary>
        /// Enum System for value: System
        /// </summary>
        [EnumMember(Value = "System")]
        System = 1,
        /// <summary>
        /// Enum User for value: User
        /// </summary>
        [EnumMember(Value = "User")]
        User = 2    }
}
