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
    /// Enum defining secondary frameworks for encoding and decoding.      While most of these are hardware acceleration frameworks, this is not a necessity             (e.g. Android MediaCodec offers software codecs as well).  
    /// </summary>
    /// <value>Enum defining secondary frameworks for encoding and decoding.      While most of these are hardware acceleration frameworks, this is not a necessity             (e.g. Android MediaCodec offers software codecs as well).  </value>
    [JsonConverter(typeof(StringEnumConverter))]
        public enum SecondaryFrameworks
    {
        /// <summary>
        /// Enum Unknown for value: Unknown
        /// </summary>
        [EnumMember(Value = "Unknown")]
        Unknown = 1,
        /// <summary>
        /// Enum None for value: None
        /// </summary>
        [EnumMember(Value = "None")]
        None = 2,
        /// <summary>
        /// Enum AmdAmf for value: AmdAmf
        /// </summary>
        [EnumMember(Value = "AmdAmf")]
        AmdAmf = 3,
        /// <summary>
        /// Enum MediaCodec for value: MediaCodec
        /// </summary>
        [EnumMember(Value = "MediaCodec")]
        MediaCodec = 4,
        /// <summary>
        /// Enum NvEncDec for value: NvEncDec
        /// </summary>
        [EnumMember(Value = "NvEncDec")]
        NvEncDec = 5,
        /// <summary>
        /// Enum OpenMax for value: OpenMax
        /// </summary>
        [EnumMember(Value = "OpenMax")]
        OpenMax = 6,
        /// <summary>
        /// Enum QuickSync for value: QuickSync
        /// </summary>
        [EnumMember(Value = "QuickSync")]
        QuickSync = 7,
        /// <summary>
        /// Enum VaApi for value: VaApi
        /// </summary>
        [EnumMember(Value = "VaApi")]
        VaApi = 8,
        /// <summary>
        /// Enum V4L2 for value: V4L2
        /// </summary>
        [EnumMember(Value = "V4L2")]
        V4L2 = 9,
        /// <summary>
        /// Enum DxVa for value: DxVa
        /// </summary>
        [EnumMember(Value = "DxVa")]
        DxVa = 10,
        /// <summary>
        /// Enum D3d11va for value: D3d11va
        /// </summary>
        [EnumMember(Value = "D3d11va")]
        D3d11va = 11,
        /// <summary>
        /// Enum VideoToolbox for value: VideoToolbox
        /// </summary>
        [EnumMember(Value = "VideoToolbox")]
        VideoToolbox = 12,
        /// <summary>
        /// Enum Mmal for value: Mmal
        /// </summary>
        [EnumMember(Value = "Mmal")]
        Mmal = 13    }
}
