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
    /// Defines PlayMethod
    /// </summary>
    [JsonConverter(typeof(StringEnumConverter))]
        public enum PlayMethod
    {
        /// <summary>
        /// Enum Transcode for value: Transcode
        /// </summary>
        [EnumMember(Value = "Transcode")]
        Transcode = 1,
        /// <summary>
        /// Enum DirectStream for value: DirectStream
        /// </summary>
        [EnumMember(Value = "DirectStream")]
        DirectStream = 2,
        /// <summary>
        /// Enum DirectPlay for value: DirectPlay
        /// </summary>
        [EnumMember(Value = "DirectPlay")]
        DirectPlay = 3    }
}
