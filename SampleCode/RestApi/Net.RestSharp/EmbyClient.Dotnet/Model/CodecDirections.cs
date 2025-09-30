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
    /// Enum for indicating the processing direction of a codec.  
    /// </summary>
    /// <value>Enum for indicating the processing direction of a codec.  </value>
    [JsonConverter(typeof(StringEnumConverter))]
        public enum CodecDirections
    {
        /// <summary>
        /// Enum Encoder for value: Encoder
        /// </summary>
        [EnumMember(Value = "Encoder")]
        Encoder = 1,
        /// <summary>
        /// Enum Decoder for value: Decoder
        /// </summary>
        [EnumMember(Value = "Decoder")]
        Decoder = 2    }
}
