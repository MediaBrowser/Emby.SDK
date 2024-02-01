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
    /// Defines UserItemShareLevel
    /// </summary>
    [JsonConverter(typeof(StringEnumConverter))]
        public enum UserItemShareLevel
    {
        /// <summary>
        /// Enum None for value: None
        /// </summary>
        [EnumMember(Value = "None")]
        None = 1,
        /// <summary>
        /// Enum Read for value: Read
        /// </summary>
        [EnumMember(Value = "Read")]
        Read = 2,
        /// <summary>
        /// Enum Write for value: Write
        /// </summary>
        [EnumMember(Value = "Write")]
        Write = 3,
        /// <summary>
        /// Enum Manage for value: Manage
        /// </summary>
        [EnumMember(Value = "Manage")]
        Manage = 4,
        /// <summary>
        /// Enum ManageDelete for value: ManageDelete
        /// </summary>
        [EnumMember(Value = "ManageDelete")]
        ManageDelete = 5    }
}
