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
    /// Defines MediaEncoding.Settings.Hwa.Projection.Enums.UiGraphDirection
    /// </summary>
    [JsonConverter(typeof(StringEnumConverter))]
        public enum MediaEncodingSettingsHwaProjectionEnumsUiGraphDirection
    {
        /// <summary>
        /// Enum TopDown for value: TopDown
        /// </summary>
        [EnumMember(Value = "TopDown")]
        TopDown = 1,
        /// <summary>
        /// Enum LeftRight for value: LeftRight
        /// </summary>
        [EnumMember(Value = "LeftRight")]
        LeftRight = 2,
        /// <summary>
        /// Enum UnorderedHorizontal for value: UnorderedHorizontal
        /// </summary>
        [EnumMember(Value = "UnorderedHorizontal")]
        UnorderedHorizontal = 3    }
}
