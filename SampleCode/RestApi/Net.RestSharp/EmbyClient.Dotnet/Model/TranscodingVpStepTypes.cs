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
    /// Video Processing Step Type enum.  
    /// </summary>
    /// <value>Video Processing Step Type enum.  </value>
    [JsonConverter(typeof(StringEnumConverter))]
        public enum TranscodingVpStepTypes
    {
        /// <summary>
        /// Enum Decoder for value: Decoder
        /// </summary>
        [EnumMember(Value = "Decoder")]
        Decoder = 1,
        /// <summary>
        /// Enum Encoder for value: Encoder
        /// </summary>
        [EnumMember(Value = "Encoder")]
        Encoder = 2,
        /// <summary>
        /// Enum Scaling for value: Scaling
        /// </summary>
        [EnumMember(Value = "Scaling")]
        Scaling = 3,
        /// <summary>
        /// Enum Deinterlace for value: Deinterlace
        /// </summary>
        [EnumMember(Value = "Deinterlace")]
        Deinterlace = 4,
        /// <summary>
        /// Enum SubtitleOverlay for value: SubtitleOverlay
        /// </summary>
        [EnumMember(Value = "SubtitleOverlay")]
        SubtitleOverlay = 5,
        /// <summary>
        /// Enum ToneMapping for value: ToneMapping
        /// </summary>
        [EnumMember(Value = "ToneMapping")]
        ToneMapping = 6,
        /// <summary>
        /// Enum ColorConversion for value: ColorConversion
        /// </summary>
        [EnumMember(Value = "ColorConversion")]
        ColorConversion = 7,
        /// <summary>
        /// Enum SplitCaptions for value: SplitCaptions
        /// </summary>
        [EnumMember(Value = "SplitCaptions")]
        SplitCaptions = 8,
        /// <summary>
        /// Enum TextSub2Video for value: TextSub2Video
        /// </summary>
        [EnumMember(Value = "TextSub2Video")]
        TextSub2Video = 9,
        /// <summary>
        /// Enum GraphicSub2Video for value: GraphicSub2Video
        /// </summary>
        [EnumMember(Value = "GraphicSub2Video")]
        GraphicSub2Video = 10,
        /// <summary>
        /// Enum GraphicSub2Text for value: GraphicSub2Text
        /// </summary>
        [EnumMember(Value = "GraphicSub2Text")]
        GraphicSub2Text = 11,
        /// <summary>
        /// Enum BurnInTextSubs for value: BurnInTextSubs
        /// </summary>
        [EnumMember(Value = "BurnInTextSubs")]
        BurnInTextSubs = 12,
        /// <summary>
        /// Enum BurnInGraphicSubs for value: BurnInGraphicSubs
        /// </summary>
        [EnumMember(Value = "BurnInGraphicSubs")]
        BurnInGraphicSubs = 13,
        /// <summary>
        /// Enum ScaleSubs for value: ScaleSubs
        /// </summary>
        [EnumMember(Value = "ScaleSubs")]
        ScaleSubs = 14,
        /// <summary>
        /// Enum TextMod for value: TextMod
        /// </summary>
        [EnumMember(Value = "TextMod")]
        TextMod = 15,
        /// <summary>
        /// Enum Censor for value: Censor
        /// </summary>
        [EnumMember(Value = "Censor")]
        Censor = 16,
        /// <summary>
        /// Enum ShowSpeaker for value: ShowSpeaker
        /// </summary>
        [EnumMember(Value = "ShowSpeaker")]
        ShowSpeaker = 17,
        /// <summary>
        /// Enum StripStyles for value: StripStyles
        /// </summary>
        [EnumMember(Value = "StripStyles")]
        StripStyles = 18,
        /// <summary>
        /// Enum ConnectTo for value: ConnectTo
        /// </summary>
        [EnumMember(Value = "ConnectTo")]
        ConnectTo = 19,
        /// <summary>
        /// Enum Rotate for value: Rotate
        /// </summary>
        [EnumMember(Value = "Rotate")]
        Rotate = 20    }
}
