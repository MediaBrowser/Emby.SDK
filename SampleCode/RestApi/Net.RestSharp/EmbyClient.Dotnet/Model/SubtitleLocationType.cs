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
    /// Defines SubtitleLocationType
    /// </summary>
    [JsonConverter(typeof(StringEnumConverter))]
        public enum SubtitleLocationType
    {
        /// <summary>
        /// Enum InternalStream for value: InternalStream
        /// </summary>
        [EnumMember(Value = "InternalStream")]
        InternalStream = 1,
        /// <summary>
        /// Enum VideoSideData for value: VideoSideData
        /// </summary>
        [EnumMember(Value = "VideoSideData")]
        VideoSideData = 2    }
}
