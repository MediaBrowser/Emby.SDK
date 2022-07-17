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
    /// Defines ScrollDirection
    /// </summary>
    [JsonConverter(typeof(StringEnumConverter))]
        public enum ScrollDirection
    {
        /// <summary>
        /// Enum Horizontal for value: Horizontal
        /// </summary>
        [EnumMember(Value = "Horizontal")]
        Horizontal = 1,
        /// <summary>
        /// Enum Vertical for value: Vertical
        /// </summary>
        [EnumMember(Value = "Vertical")]
        Vertical = 2    }
}
