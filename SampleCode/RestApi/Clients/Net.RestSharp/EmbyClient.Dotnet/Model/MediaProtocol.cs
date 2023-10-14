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
    /// Defines MediaProtocol
    /// </summary>
    [JsonConverter(typeof(StringEnumConverter))]
        public enum MediaProtocol
    {
        /// <summary>
        /// Enum File for value: File
        /// </summary>
        [EnumMember(Value = "File")]
        File = 1,
        /// <summary>
        /// Enum Http for value: Http
        /// </summary>
        [EnumMember(Value = "Http")]
        Http = 2,
        /// <summary>
        /// Enum Rtmp for value: Rtmp
        /// </summary>
        [EnumMember(Value = "Rtmp")]
        Rtmp = 3,
        /// <summary>
        /// Enum Rtsp for value: Rtsp
        /// </summary>
        [EnumMember(Value = "Rtsp")]
        Rtsp = 4,
        /// <summary>
        /// Enum Udp for value: Udp
        /// </summary>
        [EnumMember(Value = "Udp")]
        Udp = 5,
        /// <summary>
        /// Enum Rtp for value: Rtp
        /// </summary>
        [EnumMember(Value = "Rtp")]
        Rtp = 6,
        /// <summary>
        /// Enum Ftp for value: Ftp
        /// </summary>
        [EnumMember(Value = "Ftp")]
        Ftp = 7,
        /// <summary>
        /// Enum Mms for value: Mms
        /// </summary>
        [EnumMember(Value = "Mms")]
        Mms = 8    }
}
