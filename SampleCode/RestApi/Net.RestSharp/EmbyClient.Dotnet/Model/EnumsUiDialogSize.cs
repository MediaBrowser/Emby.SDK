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
    /// Defines Enums.UiDialogSize
    /// </summary>
    [JsonConverter(typeof(StringEnumConverter))]
        public enum EnumsUiDialogSize
    {
        /// <summary>
        /// Enum AutoFit for value: AutoFit
        /// </summary>
        [EnumMember(Value = "AutoFit")]
        AutoFit = 1,
        /// <summary>
        /// Enum Small for value: Small
        /// </summary>
        [EnumMember(Value = "Small")]
        Small = 2,
        /// <summary>
        /// Enum Medium for value: Medium
        /// </summary>
        [EnumMember(Value = "Medium")]
        Medium = 3,
        /// <summary>
        /// Enum MediumTall for value: MediumTall
        /// </summary>
        [EnumMember(Value = "MediumTall")]
        MediumTall = 4,
        /// <summary>
        /// Enum FullScreenBorder for value: FullScreenBorder
        /// </summary>
        [EnumMember(Value = "FullScreenBorder")]
        FullScreenBorder = 5,
        /// <summary>
        /// Enum FullScreen for value: FullScreen
        /// </summary>
        [EnumMember(Value = "FullScreen")]
        FullScreen = 6    }
}
