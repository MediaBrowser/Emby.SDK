/*
 * EmbyClient.Dotnet.Beta
 * API Version: 4.8.0.6
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
using SwaggerDateConverter = EmbyClient.Dotnet.Beta.Client.SwaggerDateConverter;

namespace EmbyClient.Dotnet.Beta.Model
{
    /// <summary>
    /// Defines Dlna.EncodingContext
    /// </summary>
    [JsonConverter(typeof(StringEnumConverter))]
        public enum DlnaEncodingContext
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