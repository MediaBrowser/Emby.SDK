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
    /// Defines EncodingContext
    /// </summary>
    [JsonConverter(typeof(StringEnumConverter))]
        public enum EncodingContext
    {
        /// <summary>
        /// Enum Streaming for value: Streaming
        /// </summary>
        [EnumMember(Value = "Streaming")]
        Streaming = 1,
        /// <summary>
        /// Enum Static for value: Static
        /// </summary>
        [EnumMember(Value = "Static")]
        Static = 2    }
}
