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
    /// Defines Conditions.PropertyConditionType
    /// </summary>
    [JsonConverter(typeof(StringEnumConverter))]
        public enum ConditionsPropertyConditionType
    {
        /// <summary>
        /// Enum Visible for value: Visible
        /// </summary>
        [EnumMember(Value = "Visible")]
        Visible = 1,
        /// <summary>
        /// Enum Enabled for value: Enabled
        /// </summary>
        [EnumMember(Value = "Enabled")]
        Enabled = 2    }
}
