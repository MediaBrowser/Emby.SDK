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
    /// Defines ProfileConditionType
    /// </summary>
    [JsonConverter(typeof(StringEnumConverter))]
        public enum ProfileConditionType
    {
        /// <summary>
        /// Enum Equals for value: Equals
        /// </summary>
        [EnumMember(Value = "Equals")]
        Equals = 1,
        /// <summary>
        /// Enum NotEquals for value: NotEquals
        /// </summary>
        [EnumMember(Value = "NotEquals")]
        NotEquals = 2,
        /// <summary>
        /// Enum LessThanEqual for value: LessThanEqual
        /// </summary>
        [EnumMember(Value = "LessThanEqual")]
        LessThanEqual = 3,
        /// <summary>
        /// Enum GreaterThanEqual for value: GreaterThanEqual
        /// </summary>
        [EnumMember(Value = "GreaterThanEqual")]
        GreaterThanEqual = 4,
        /// <summary>
        /// Enum EqualsAny for value: EqualsAny
        /// </summary>
        [EnumMember(Value = "EqualsAny")]
        EqualsAny = 5    }
}
