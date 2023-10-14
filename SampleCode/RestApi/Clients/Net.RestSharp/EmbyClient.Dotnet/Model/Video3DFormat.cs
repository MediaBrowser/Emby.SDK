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
    /// Defines Video3DFormat
    /// </summary>
    [JsonConverter(typeof(StringEnumConverter))]
        public enum Video3DFormat
    {
        /// <summary>
        /// Enum HalfSideBySide for value: HalfSideBySide
        /// </summary>
        [EnumMember(Value = "HalfSideBySide")]
        HalfSideBySide = 1,
        /// <summary>
        /// Enum FullSideBySide for value: FullSideBySide
        /// </summary>
        [EnumMember(Value = "FullSideBySide")]
        FullSideBySide = 2,
        /// <summary>
        /// Enum FullTopAndBottom for value: FullTopAndBottom
        /// </summary>
        [EnumMember(Value = "FullTopAndBottom")]
        FullTopAndBottom = 3,
        /// <summary>
        /// Enum HalfTopAndBottom for value: HalfTopAndBottom
        /// </summary>
        [EnumMember(Value = "HalfTopAndBottom")]
        HalfTopAndBottom = 4,
        /// <summary>
        /// Enum MVC for value: MVC
        /// </summary>
        [EnumMember(Value = "MVC")]
        MVC = 5    }
}
