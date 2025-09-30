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
    /// Defines MediaEncoding.CodecParameterContext
    /// </summary>
    [JsonConverter(typeof(StringEnumConverter))]
        public enum MediaEncodingCodecParameterContext
    {
        /// <summary>
        /// Enum Playback for value: Playback
        /// </summary>
        [EnumMember(Value = "Playback")]
        Playback = 1,
        /// <summary>
        /// Enum Conversion for value: Conversion
        /// </summary>
        [EnumMember(Value = "Conversion")]
        Conversion = 2    }
}
