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
    /// Defines SyncJobOption
    /// </summary>
    [JsonConverter(typeof(StringEnumConverter))]
        public enum SyncJobOption
    {
        /// <summary>
        /// Enum Name for value: Name
        /// </summary>
        [EnumMember(Value = "Name")]
        Name = 1,
        /// <summary>
        /// Enum Quality for value: Quality
        /// </summary>
        [EnumMember(Value = "Quality")]
        Quality = 2,
        /// <summary>
        /// Enum UnwatchedOnly for value: UnwatchedOnly
        /// </summary>
        [EnumMember(Value = "UnwatchedOnly")]
        UnwatchedOnly = 3,
        /// <summary>
        /// Enum SyncNewContent for value: SyncNewContent
        /// </summary>
        [EnumMember(Value = "SyncNewContent")]
        SyncNewContent = 4,
        /// <summary>
        /// Enum ItemLimit for value: ItemLimit
        /// </summary>
        [EnumMember(Value = "ItemLimit")]
        ItemLimit = 5,
        /// <summary>
        /// Enum Profile for value: Profile
        /// </summary>
        [EnumMember(Value = "Profile")]
        Profile = 6    }
}
