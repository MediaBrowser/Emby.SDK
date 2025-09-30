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
    /// Defines ExtendedVideoTypes
    /// </summary>
    [JsonConverter(typeof(StringEnumConverter))]
        public enum ExtendedVideoTypes
    {
        /// <summary>
        /// Enum None for value: None
        /// </summary>
        [EnumMember(Value = "None")]
        None = 1,
        /// <summary>
        /// Enum Hdr10 for value: Hdr10
        /// </summary>
        [EnumMember(Value = "Hdr10")]
        Hdr10 = 2,
        /// <summary>
        /// Enum Hdr10Plus for value: Hdr10Plus
        /// </summary>
        [EnumMember(Value = "Hdr10Plus")]
        Hdr10Plus = 3,
        /// <summary>
        /// Enum HyperLogGamma for value: HyperLogGamma
        /// </summary>
        [EnumMember(Value = "HyperLogGamma")]
        HyperLogGamma = 4,
        /// <summary>
        /// Enum DolbyVision for value: DolbyVision
        /// </summary>
        [EnumMember(Value = "DolbyVision")]
        DolbyVision = 5    }
}
