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
    /// Defines Dlna.Profiles.DeviceProfileType
    /// </summary>
    [JsonConverter(typeof(StringEnumConverter))]
        public enum DlnaProfilesDeviceProfileType
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
