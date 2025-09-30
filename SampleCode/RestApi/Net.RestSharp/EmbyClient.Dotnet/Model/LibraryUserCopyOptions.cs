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
    /// Defines Library.UserCopyOptions
    /// </summary>
    [JsonConverter(typeof(StringEnumConverter))]
        public enum LibraryUserCopyOptions
    {
        /// <summary>
        /// Enum UserPolicy for value: UserPolicy
        /// </summary>
        [EnumMember(Value = "UserPolicy")]
        UserPolicy = 1,
        /// <summary>
        /// Enum UserConfiguration for value: UserConfiguration
        /// </summary>
        [EnumMember(Value = "UserConfiguration")]
        UserConfiguration = 2,
        /// <summary>
        /// Enum UserData for value: UserData
        /// </summary>
        [EnumMember(Value = "UserData")]
        UserData = 3    }
}
