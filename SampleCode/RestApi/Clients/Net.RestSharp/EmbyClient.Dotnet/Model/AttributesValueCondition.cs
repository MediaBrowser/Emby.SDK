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
    /// Conditions for comparing with a target value.  
    /// </summary>
    /// <value>Conditions for comparing with a target value.  </value>
    [JsonConverter(typeof(StringEnumConverter))]
        public enum AttributesValueCondition
    {
        /// <summary>
        /// Enum IsEqual for value: IsEqual
        /// </summary>
        [EnumMember(Value = "IsEqual")]
        IsEqual = 1,
        /// <summary>
        /// Enum IsNotEqual for value: IsNotEqual
        /// </summary>
        [EnumMember(Value = "IsNotEqual")]
        IsNotEqual = 2,
        /// <summary>
        /// Enum IsGreater for value: IsGreater
        /// </summary>
        [EnumMember(Value = "IsGreater")]
        IsGreater = 3,
        /// <summary>
        /// Enum IsGreaterOrEqual for value: IsGreaterOrEqual
        /// </summary>
        [EnumMember(Value = "IsGreaterOrEqual")]
        IsGreaterOrEqual = 4,
        /// <summary>
        /// Enum IsLess for value: IsLess
        /// </summary>
        [EnumMember(Value = "IsLess")]
        IsLess = 5,
        /// <summary>
        /// Enum IsLessOrEqual for value: IsLessOrEqual
        /// </summary>
        [EnumMember(Value = "IsLessOrEqual")]
        IsLessOrEqual = 6    }
}
