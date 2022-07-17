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
    /// MediaStream
    /// </summary>
    [DataContract]
        public partial class MediaStream :  IEquatable<MediaStream>
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="MediaStream" /> class.
        /// </summary>
        /// <param name="codec">codec.</param>
        /// <param name="codecTag">codecTag.</param>
        /// <param name="language">language.</param>
        /// <param name="colorTransfer">colorTransfer.</param>
        /// <param name="colorPrimaries">colorPrimaries.</param>
        /// <param name="colorSpace">colorSpace.</param>
        /// <param name="comment">comment.</param>
        /// <param name="streamStartTimeTicks">streamStartTimeTicks.</param>
        /// <param name="timeBase">timeBase.</param>
        /// <param name="codecTimeBase">codecTimeBase.</param>
        /// <param name="title">title.</param>
        /// <param name="extradata">extradata.</param>
        /// <param name="videoRange">videoRange.</param>
        /// <param name="displayTitle">displayTitle.</param>
        /// <param name="displayLanguage">displayLanguage.</param>
        /// <param name="nalLengthSize">nalLengthSize.</param>
        /// <param name="isInterlaced">isInterlaced.</param>
        /// <param name="isAVC">isAVC.</param>
        /// <param name="channelLayout">channelLayout.</param>
        /// <param name="bitRate">bitRate.</param>
        /// <param name="bitDepth">bitDepth.</param>
        /// <param name="refFrames">refFrames.</param>
        /// <param name="rotation">rotation.</param>
        /// <param name="channels">channels.</param>
        /// <param name="sampleRate">sampleRate.</param>
        /// <param name="isDefault">isDefault.</param>
        /// <param name="isForced">isForced.</param>
        /// <param name="height">height.</param>
        /// <param name="width">width.</param>
        /// <param name="averageFrameRate">averageFrameRate.</param>
        /// <param name="realFrameRate">realFrameRate.</param>
        /// <param name="profile">profile.</param>
        /// <param name="type">type.</param>
        /// <param name="aspectRatio">aspectRatio.</param>
        /// <param name="index">index.</param>
        /// <param name="isExternal">isExternal.</param>
        /// <param name="deliveryMethod">deliveryMethod.</param>
        /// <param name="deliveryUrl">deliveryUrl.</param>
        /// <param name="isExternalUrl">isExternalUrl.</param>
        /// <param name="isTextSubtitleStream">isTextSubtitleStream.</param>
        /// <param name="supportsExternalStream">supportsExternalStream.</param>
        /// <param name="path">path.</param>
        /// <param name="protocol">protocol.</param>
        /// <param name="pixelFormat">pixelFormat.</param>
        /// <param name="level">level.</param>
        /// <param name="isAnamorphic">isAnamorphic.</param>
        /// <param name="itemId">itemId.</param>
        /// <param name="serverId">serverId.</param>
        /// <param name="attachmentSize">attachmentSize.</param>
        /// <param name="mimeType">mimeType.</param>
        /// <param name="isClosedCaptions">isClosedCaptions.</param>
        /// <param name="subtitleLocationType">subtitleLocationType.</param>
        public MediaStream(string codec = default(string), string codecTag = default(string), string language = default(string), string colorTransfer = default(string), string colorPrimaries = default(string), string colorSpace = default(string), string comment = default(string), long? streamStartTimeTicks = default(long?), string timeBase = default(string), string codecTimeBase = default(string), string title = default(string), string extradata = default(string), string videoRange = default(string), string displayTitle = default(string), string displayLanguage = default(string), string nalLengthSize = default(string), bool? isInterlaced = default(bool?), bool? isAVC = default(bool?), string channelLayout = default(string), int? bitRate = default(int?), int? bitDepth = default(int?), int? refFrames = default(int?), int? rotation = default(int?), int? channels = default(int?), int? sampleRate = default(int?), bool? isDefault = default(bool?), bool? isForced = default(bool?), int? height = default(int?), int? width = default(int?), float? averageFrameRate = default(float?), float? realFrameRate = default(float?), string profile = default(string), MediaStreamType type = default(MediaStreamType), string aspectRatio = default(string), int? index = default(int?), bool? isExternal = default(bool?), DlnaSubtitleDeliveryMethod deliveryMethod = default(DlnaSubtitleDeliveryMethod), string deliveryUrl = default(string), bool? isExternalUrl = default(bool?), bool? isTextSubtitleStream = default(bool?), bool? supportsExternalStream = default(bool?), string path = default(string), MediaInfoMediaProtocol protocol = default(MediaInfoMediaProtocol), string pixelFormat = default(string), double? level = default(double?), bool? isAnamorphic = default(bool?), string itemId = default(string), string serverId = default(string), int? attachmentSize = default(int?), string mimeType = default(string), bool? isClosedCaptions = default(bool?), SubtitleLocationType subtitleLocationType = default(SubtitleLocationType))
        {
            this.Codec = codec;
            this.CodecTag = codecTag;
            this.Language = language;
            this.ColorTransfer = colorTransfer;
            this.ColorPrimaries = colorPrimaries;
            this.ColorSpace = colorSpace;
            this.Comment = comment;
            this.StreamStartTimeTicks = streamStartTimeTicks;
            this.TimeBase = timeBase;
            this.CodecTimeBase = codecTimeBase;
            this.Title = title;
            this.Extradata = extradata;
            this.VideoRange = videoRange;
            this.DisplayTitle = displayTitle;
            this.DisplayLanguage = displayLanguage;
            this.NalLengthSize = nalLengthSize;
            this.IsInterlaced = isInterlaced;
            this.IsAVC = isAVC;
            this.ChannelLayout = channelLayout;
            this.BitRate = bitRate;
            this.BitDepth = bitDepth;
            this.RefFrames = refFrames;
            this.Rotation = rotation;
            this.Channels = channels;
            this.SampleRate = sampleRate;
            this.IsDefault = isDefault;
            this.IsForced = isForced;
            this.Height = height;
            this.Width = width;
            this.AverageFrameRate = averageFrameRate;
            this.RealFrameRate = realFrameRate;
            this.Profile = profile;
            this.Type = type;
            this.AspectRatio = aspectRatio;
            this.Index = index;
            this.IsExternal = isExternal;
            this.DeliveryMethod = deliveryMethod;
            this.DeliveryUrl = deliveryUrl;
            this.IsExternalUrl = isExternalUrl;
            this.IsTextSubtitleStream = isTextSubtitleStream;
            this.SupportsExternalStream = supportsExternalStream;
            this.Path = path;
            this.Protocol = protocol;
            this.PixelFormat = pixelFormat;
            this.Level = level;
            this.IsAnamorphic = isAnamorphic;
            this.ItemId = itemId;
            this.ServerId = serverId;
            this.AttachmentSize = attachmentSize;
            this.MimeType = mimeType;
            this.IsClosedCaptions = isClosedCaptions;
            this.SubtitleLocationType = subtitleLocationType;
        }
        
        /// <summary>
        /// Gets or Sets Codec
        /// </summary>
        [DataMember(Name="Codec", EmitDefaultValue=false)]
        public string Codec { get; set; }

        /// <summary>
        /// Gets or Sets CodecTag
        /// </summary>
        [DataMember(Name="CodecTag", EmitDefaultValue=false)]
        public string CodecTag { get; set; }

        /// <summary>
        /// Gets or Sets Language
        /// </summary>
        [DataMember(Name="Language", EmitDefaultValue=false)]
        public string Language { get; set; }

        /// <summary>
        /// Gets or Sets ColorTransfer
        /// </summary>
        [DataMember(Name="ColorTransfer", EmitDefaultValue=false)]
        public string ColorTransfer { get; set; }

        /// <summary>
        /// Gets or Sets ColorPrimaries
        /// </summary>
        [DataMember(Name="ColorPrimaries", EmitDefaultValue=false)]
        public string ColorPrimaries { get; set; }

        /// <summary>
        /// Gets or Sets ColorSpace
        /// </summary>
        [DataMember(Name="ColorSpace", EmitDefaultValue=false)]
        public string ColorSpace { get; set; }

        /// <summary>
        /// Gets or Sets Comment
        /// </summary>
        [DataMember(Name="Comment", EmitDefaultValue=false)]
        public string Comment { get; set; }

        /// <summary>
        /// Gets or Sets StreamStartTimeTicks
        /// </summary>
        [DataMember(Name="StreamStartTimeTicks", EmitDefaultValue=false)]
        public long? StreamStartTimeTicks { get; set; }

        /// <summary>
        /// Gets or Sets TimeBase
        /// </summary>
        [DataMember(Name="TimeBase", EmitDefaultValue=false)]
        public string TimeBase { get; set; }

        /// <summary>
        /// Gets or Sets CodecTimeBase
        /// </summary>
        [DataMember(Name="CodecTimeBase", EmitDefaultValue=false)]
        public string CodecTimeBase { get; set; }

        /// <summary>
        /// Gets or Sets Title
        /// </summary>
        [DataMember(Name="Title", EmitDefaultValue=false)]
        public string Title { get; set; }

        /// <summary>
        /// Gets or Sets Extradata
        /// </summary>
        [DataMember(Name="Extradata", EmitDefaultValue=false)]
        public string Extradata { get; set; }

        /// <summary>
        /// Gets or Sets VideoRange
        /// </summary>
        [DataMember(Name="VideoRange", EmitDefaultValue=false)]
        public string VideoRange { get; set; }

        /// <summary>
        /// Gets or Sets DisplayTitle
        /// </summary>
        [DataMember(Name="DisplayTitle", EmitDefaultValue=false)]
        public string DisplayTitle { get; set; }

        /// <summary>
        /// Gets or Sets DisplayLanguage
        /// </summary>
        [DataMember(Name="DisplayLanguage", EmitDefaultValue=false)]
        public string DisplayLanguage { get; set; }

        /// <summary>
        /// Gets or Sets NalLengthSize
        /// </summary>
        [DataMember(Name="NalLengthSize", EmitDefaultValue=false)]
        public string NalLengthSize { get; set; }

        /// <summary>
        /// Gets or Sets IsInterlaced
        /// </summary>
        [DataMember(Name="IsInterlaced", EmitDefaultValue=false)]
        public bool? IsInterlaced { get; set; }

        /// <summary>
        /// Gets or Sets IsAVC
        /// </summary>
        [DataMember(Name="IsAVC", EmitDefaultValue=false)]
        public bool? IsAVC { get; set; }

        /// <summary>
        /// Gets or Sets ChannelLayout
        /// </summary>
        [DataMember(Name="ChannelLayout", EmitDefaultValue=false)]
        public string ChannelLayout { get; set; }

        /// <summary>
        /// Gets or Sets BitRate
        /// </summary>
        [DataMember(Name="BitRate", EmitDefaultValue=false)]
        public int? BitRate { get; set; }

        /// <summary>
        /// Gets or Sets BitDepth
        /// </summary>
        [DataMember(Name="BitDepth", EmitDefaultValue=false)]
        public int? BitDepth { get; set; }

        /// <summary>
        /// Gets or Sets RefFrames
        /// </summary>
        [DataMember(Name="RefFrames", EmitDefaultValue=false)]
        public int? RefFrames { get; set; }

        /// <summary>
        /// Gets or Sets Rotation
        /// </summary>
        [DataMember(Name="Rotation", EmitDefaultValue=false)]
        public int? Rotation { get; set; }

        /// <summary>
        /// Gets or Sets Channels
        /// </summary>
        [DataMember(Name="Channels", EmitDefaultValue=false)]
        public int? Channels { get; set; }

        /// <summary>
        /// Gets or Sets SampleRate
        /// </summary>
        [DataMember(Name="SampleRate", EmitDefaultValue=false)]
        public int? SampleRate { get; set; }

        /// <summary>
        /// Gets or Sets IsDefault
        /// </summary>
        [DataMember(Name="IsDefault", EmitDefaultValue=false)]
        public bool? IsDefault { get; set; }

        /// <summary>
        /// Gets or Sets IsForced
        /// </summary>
        [DataMember(Name="IsForced", EmitDefaultValue=false)]
        public bool? IsForced { get; set; }

        /// <summary>
        /// Gets or Sets Height
        /// </summary>
        [DataMember(Name="Height", EmitDefaultValue=false)]
        public int? Height { get; set; }

        /// <summary>
        /// Gets or Sets Width
        /// </summary>
        [DataMember(Name="Width", EmitDefaultValue=false)]
        public int? Width { get; set; }

        /// <summary>
        /// Gets or Sets AverageFrameRate
        /// </summary>
        [DataMember(Name="AverageFrameRate", EmitDefaultValue=false)]
        public float? AverageFrameRate { get; set; }

        /// <summary>
        /// Gets or Sets RealFrameRate
        /// </summary>
        [DataMember(Name="RealFrameRate", EmitDefaultValue=false)]
        public float? RealFrameRate { get; set; }

        /// <summary>
        /// Gets or Sets Profile
        /// </summary>
        [DataMember(Name="Profile", EmitDefaultValue=false)]
        public string Profile { get; set; }

        /// <summary>
        /// Gets or Sets Type
        /// </summary>
        [DataMember(Name="Type", EmitDefaultValue=false)]
        public MediaStreamType Type { get; set; }

        /// <summary>
        /// Gets or Sets AspectRatio
        /// </summary>
        [DataMember(Name="AspectRatio", EmitDefaultValue=false)]
        public string AspectRatio { get; set; }

        /// <summary>
        /// Gets or Sets Index
        /// </summary>
        [DataMember(Name="Index", EmitDefaultValue=false)]
        public int? Index { get; set; }

        /// <summary>
        /// Gets or Sets IsExternal
        /// </summary>
        [DataMember(Name="IsExternal", EmitDefaultValue=false)]
        public bool? IsExternal { get; set; }

        /// <summary>
        /// Gets or Sets DeliveryMethod
        /// </summary>
        [DataMember(Name="DeliveryMethod", EmitDefaultValue=false)]
        public DlnaSubtitleDeliveryMethod DeliveryMethod { get; set; }

        /// <summary>
        /// Gets or Sets DeliveryUrl
        /// </summary>
        [DataMember(Name="DeliveryUrl", EmitDefaultValue=false)]
        public string DeliveryUrl { get; set; }

        /// <summary>
        /// Gets or Sets IsExternalUrl
        /// </summary>
        [DataMember(Name="IsExternalUrl", EmitDefaultValue=false)]
        public bool? IsExternalUrl { get; set; }

        /// <summary>
        /// Gets or Sets IsTextSubtitleStream
        /// </summary>
        [DataMember(Name="IsTextSubtitleStream", EmitDefaultValue=false)]
        public bool? IsTextSubtitleStream { get; set; }

        /// <summary>
        /// Gets or Sets SupportsExternalStream
        /// </summary>
        [DataMember(Name="SupportsExternalStream", EmitDefaultValue=false)]
        public bool? SupportsExternalStream { get; set; }

        /// <summary>
        /// Gets or Sets Path
        /// </summary>
        [DataMember(Name="Path", EmitDefaultValue=false)]
        public string Path { get; set; }

        /// <summary>
        /// Gets or Sets Protocol
        /// </summary>
        [DataMember(Name="Protocol", EmitDefaultValue=false)]
        public MediaInfoMediaProtocol Protocol { get; set; }

        /// <summary>
        /// Gets or Sets PixelFormat
        /// </summary>
        [DataMember(Name="PixelFormat", EmitDefaultValue=false)]
        public string PixelFormat { get; set; }

        /// <summary>
        /// Gets or Sets Level
        /// </summary>
        [DataMember(Name="Level", EmitDefaultValue=false)]
        public double? Level { get; set; }

        /// <summary>
        /// Gets or Sets IsAnamorphic
        /// </summary>
        [DataMember(Name="IsAnamorphic", EmitDefaultValue=false)]
        public bool? IsAnamorphic { get; set; }

        /// <summary>
        /// Gets or Sets ItemId
        /// </summary>
        [DataMember(Name="ItemId", EmitDefaultValue=false)]
        public string ItemId { get; set; }

        /// <summary>
        /// Gets or Sets ServerId
        /// </summary>
        [DataMember(Name="ServerId", EmitDefaultValue=false)]
        public string ServerId { get; set; }

        /// <summary>
        /// Gets or Sets AttachmentSize
        /// </summary>
        [DataMember(Name="AttachmentSize", EmitDefaultValue=false)]
        public int? AttachmentSize { get; set; }

        /// <summary>
        /// Gets or Sets MimeType
        /// </summary>
        [DataMember(Name="MimeType", EmitDefaultValue=false)]
        public string MimeType { get; set; }

        /// <summary>
        /// Gets or Sets IsClosedCaptions
        /// </summary>
        [DataMember(Name="IsClosedCaptions", EmitDefaultValue=false)]
        public bool? IsClosedCaptions { get; set; }

        /// <summary>
        /// Gets or Sets SubtitleLocationType
        /// </summary>
        [DataMember(Name="SubtitleLocationType", EmitDefaultValue=false)]
        public SubtitleLocationType SubtitleLocationType { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class MediaStream {\n");
            sb.Append("  Codec: ").Append(Codec).Append("\n");
            sb.Append("  CodecTag: ").Append(CodecTag).Append("\n");
            sb.Append("  Language: ").Append(Language).Append("\n");
            sb.Append("  ColorTransfer: ").Append(ColorTransfer).Append("\n");
            sb.Append("  ColorPrimaries: ").Append(ColorPrimaries).Append("\n");
            sb.Append("  ColorSpace: ").Append(ColorSpace).Append("\n");
            sb.Append("  Comment: ").Append(Comment).Append("\n");
            sb.Append("  StreamStartTimeTicks: ").Append(StreamStartTimeTicks).Append("\n");
            sb.Append("  TimeBase: ").Append(TimeBase).Append("\n");
            sb.Append("  CodecTimeBase: ").Append(CodecTimeBase).Append("\n");
            sb.Append("  Title: ").Append(Title).Append("\n");
            sb.Append("  Extradata: ").Append(Extradata).Append("\n");
            sb.Append("  VideoRange: ").Append(VideoRange).Append("\n");
            sb.Append("  DisplayTitle: ").Append(DisplayTitle).Append("\n");
            sb.Append("  DisplayLanguage: ").Append(DisplayLanguage).Append("\n");
            sb.Append("  NalLengthSize: ").Append(NalLengthSize).Append("\n");
            sb.Append("  IsInterlaced: ").Append(IsInterlaced).Append("\n");
            sb.Append("  IsAVC: ").Append(IsAVC).Append("\n");
            sb.Append("  ChannelLayout: ").Append(ChannelLayout).Append("\n");
            sb.Append("  BitRate: ").Append(BitRate).Append("\n");
            sb.Append("  BitDepth: ").Append(BitDepth).Append("\n");
            sb.Append("  RefFrames: ").Append(RefFrames).Append("\n");
            sb.Append("  Rotation: ").Append(Rotation).Append("\n");
            sb.Append("  Channels: ").Append(Channels).Append("\n");
            sb.Append("  SampleRate: ").Append(SampleRate).Append("\n");
            sb.Append("  IsDefault: ").Append(IsDefault).Append("\n");
            sb.Append("  IsForced: ").Append(IsForced).Append("\n");
            sb.Append("  Height: ").Append(Height).Append("\n");
            sb.Append("  Width: ").Append(Width).Append("\n");
            sb.Append("  AverageFrameRate: ").Append(AverageFrameRate).Append("\n");
            sb.Append("  RealFrameRate: ").Append(RealFrameRate).Append("\n");
            sb.Append("  Profile: ").Append(Profile).Append("\n");
            sb.Append("  Type: ").Append(Type).Append("\n");
            sb.Append("  AspectRatio: ").Append(AspectRatio).Append("\n");
            sb.Append("  Index: ").Append(Index).Append("\n");
            sb.Append("  IsExternal: ").Append(IsExternal).Append("\n");
            sb.Append("  DeliveryMethod: ").Append(DeliveryMethod).Append("\n");
            sb.Append("  DeliveryUrl: ").Append(DeliveryUrl).Append("\n");
            sb.Append("  IsExternalUrl: ").Append(IsExternalUrl).Append("\n");
            sb.Append("  IsTextSubtitleStream: ").Append(IsTextSubtitleStream).Append("\n");
            sb.Append("  SupportsExternalStream: ").Append(SupportsExternalStream).Append("\n");
            sb.Append("  Path: ").Append(Path).Append("\n");
            sb.Append("  Protocol: ").Append(Protocol).Append("\n");
            sb.Append("  PixelFormat: ").Append(PixelFormat).Append("\n");
            sb.Append("  Level: ").Append(Level).Append("\n");
            sb.Append("  IsAnamorphic: ").Append(IsAnamorphic).Append("\n");
            sb.Append("  ItemId: ").Append(ItemId).Append("\n");
            sb.Append("  ServerId: ").Append(ServerId).Append("\n");
            sb.Append("  AttachmentSize: ").Append(AttachmentSize).Append("\n");
            sb.Append("  MimeType: ").Append(MimeType).Append("\n");
            sb.Append("  IsClosedCaptions: ").Append(IsClosedCaptions).Append("\n");
            sb.Append("  SubtitleLocationType: ").Append(SubtitleLocationType).Append("\n");
            sb.Append("}\n");
            return sb.ToString();
        }
  
        /// <summary>
        /// Returns the JSON string presentation of the object
        /// </summary>
        /// <returns>JSON string presentation of the object</returns>
        public virtual string ToJson()
        {
            return JsonConvert.SerializeObject(this, Formatting.Indented);
        }

        /// <summary>
        /// Returns true if objects are equal
        /// </summary>
        /// <param name="input">Object to be compared</param>
        /// <returns>Boolean</returns>
        public override bool Equals(object input)
        {
            return this.Equals(input as MediaStream);
        }

        /// <summary>
        /// Returns true if MediaStream instances are equal
        /// </summary>
        /// <param name="input">Instance of MediaStream to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(MediaStream input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.Codec == input.Codec ||
                    (this.Codec != null &&
                    this.Codec.Equals(input.Codec))
                ) && 
                (
                    this.CodecTag == input.CodecTag ||
                    (this.CodecTag != null &&
                    this.CodecTag.Equals(input.CodecTag))
                ) && 
                (
                    this.Language == input.Language ||
                    (this.Language != null &&
                    this.Language.Equals(input.Language))
                ) && 
                (
                    this.ColorTransfer == input.ColorTransfer ||
                    (this.ColorTransfer != null &&
                    this.ColorTransfer.Equals(input.ColorTransfer))
                ) && 
                (
                    this.ColorPrimaries == input.ColorPrimaries ||
                    (this.ColorPrimaries != null &&
                    this.ColorPrimaries.Equals(input.ColorPrimaries))
                ) && 
                (
                    this.ColorSpace == input.ColorSpace ||
                    (this.ColorSpace != null &&
                    this.ColorSpace.Equals(input.ColorSpace))
                ) && 
                (
                    this.Comment == input.Comment ||
                    (this.Comment != null &&
                    this.Comment.Equals(input.Comment))
                ) && 
                (
                    this.StreamStartTimeTicks == input.StreamStartTimeTicks ||
                    (this.StreamStartTimeTicks != null &&
                    this.StreamStartTimeTicks.Equals(input.StreamStartTimeTicks))
                ) && 
                (
                    this.TimeBase == input.TimeBase ||
                    (this.TimeBase != null &&
                    this.TimeBase.Equals(input.TimeBase))
                ) && 
                (
                    this.CodecTimeBase == input.CodecTimeBase ||
                    (this.CodecTimeBase != null &&
                    this.CodecTimeBase.Equals(input.CodecTimeBase))
                ) && 
                (
                    this.Title == input.Title ||
                    (this.Title != null &&
                    this.Title.Equals(input.Title))
                ) && 
                (
                    this.Extradata == input.Extradata ||
                    (this.Extradata != null &&
                    this.Extradata.Equals(input.Extradata))
                ) && 
                (
                    this.VideoRange == input.VideoRange ||
                    (this.VideoRange != null &&
                    this.VideoRange.Equals(input.VideoRange))
                ) && 
                (
                    this.DisplayTitle == input.DisplayTitle ||
                    (this.DisplayTitle != null &&
                    this.DisplayTitle.Equals(input.DisplayTitle))
                ) && 
                (
                    this.DisplayLanguage == input.DisplayLanguage ||
                    (this.DisplayLanguage != null &&
                    this.DisplayLanguage.Equals(input.DisplayLanguage))
                ) && 
                (
                    this.NalLengthSize == input.NalLengthSize ||
                    (this.NalLengthSize != null &&
                    this.NalLengthSize.Equals(input.NalLengthSize))
                ) && 
                (
                    this.IsInterlaced == input.IsInterlaced ||
                    (this.IsInterlaced != null &&
                    this.IsInterlaced.Equals(input.IsInterlaced))
                ) && 
                (
                    this.IsAVC == input.IsAVC ||
                    (this.IsAVC != null &&
                    this.IsAVC.Equals(input.IsAVC))
                ) && 
                (
                    this.ChannelLayout == input.ChannelLayout ||
                    (this.ChannelLayout != null &&
                    this.ChannelLayout.Equals(input.ChannelLayout))
                ) && 
                (
                    this.BitRate == input.BitRate ||
                    (this.BitRate != null &&
                    this.BitRate.Equals(input.BitRate))
                ) && 
                (
                    this.BitDepth == input.BitDepth ||
                    (this.BitDepth != null &&
                    this.BitDepth.Equals(input.BitDepth))
                ) && 
                (
                    this.RefFrames == input.RefFrames ||
                    (this.RefFrames != null &&
                    this.RefFrames.Equals(input.RefFrames))
                ) && 
                (
                    this.Rotation == input.Rotation ||
                    (this.Rotation != null &&
                    this.Rotation.Equals(input.Rotation))
                ) && 
                (
                    this.Channels == input.Channels ||
                    (this.Channels != null &&
                    this.Channels.Equals(input.Channels))
                ) && 
                (
                    this.SampleRate == input.SampleRate ||
                    (this.SampleRate != null &&
                    this.SampleRate.Equals(input.SampleRate))
                ) && 
                (
                    this.IsDefault == input.IsDefault ||
                    (this.IsDefault != null &&
                    this.IsDefault.Equals(input.IsDefault))
                ) && 
                (
                    this.IsForced == input.IsForced ||
                    (this.IsForced != null &&
                    this.IsForced.Equals(input.IsForced))
                ) && 
                (
                    this.Height == input.Height ||
                    (this.Height != null &&
                    this.Height.Equals(input.Height))
                ) && 
                (
                    this.Width == input.Width ||
                    (this.Width != null &&
                    this.Width.Equals(input.Width))
                ) && 
                (
                    this.AverageFrameRate == input.AverageFrameRate ||
                    (this.AverageFrameRate != null &&
                    this.AverageFrameRate.Equals(input.AverageFrameRate))
                ) && 
                (
                    this.RealFrameRate == input.RealFrameRate ||
                    (this.RealFrameRate != null &&
                    this.RealFrameRate.Equals(input.RealFrameRate))
                ) && 
                (
                    this.Profile == input.Profile ||
                    (this.Profile != null &&
                    this.Profile.Equals(input.Profile))
                ) && 
                (
                    this.Type == input.Type ||
                    (this.Type != null &&
                    this.Type.Equals(input.Type))
                ) && 
                (
                    this.AspectRatio == input.AspectRatio ||
                    (this.AspectRatio != null &&
                    this.AspectRatio.Equals(input.AspectRatio))
                ) && 
                (
                    this.Index == input.Index ||
                    (this.Index != null &&
                    this.Index.Equals(input.Index))
                ) && 
                (
                    this.IsExternal == input.IsExternal ||
                    (this.IsExternal != null &&
                    this.IsExternal.Equals(input.IsExternal))
                ) && 
                (
                    this.DeliveryMethod == input.DeliveryMethod ||
                    (this.DeliveryMethod != null &&
                    this.DeliveryMethod.Equals(input.DeliveryMethod))
                ) && 
                (
                    this.DeliveryUrl == input.DeliveryUrl ||
                    (this.DeliveryUrl != null &&
                    this.DeliveryUrl.Equals(input.DeliveryUrl))
                ) && 
                (
                    this.IsExternalUrl == input.IsExternalUrl ||
                    (this.IsExternalUrl != null &&
                    this.IsExternalUrl.Equals(input.IsExternalUrl))
                ) && 
                (
                    this.IsTextSubtitleStream == input.IsTextSubtitleStream ||
                    (this.IsTextSubtitleStream != null &&
                    this.IsTextSubtitleStream.Equals(input.IsTextSubtitleStream))
                ) && 
                (
                    this.SupportsExternalStream == input.SupportsExternalStream ||
                    (this.SupportsExternalStream != null &&
                    this.SupportsExternalStream.Equals(input.SupportsExternalStream))
                ) && 
                (
                    this.Path == input.Path ||
                    (this.Path != null &&
                    this.Path.Equals(input.Path))
                ) && 
                (
                    this.Protocol == input.Protocol ||
                    (this.Protocol != null &&
                    this.Protocol.Equals(input.Protocol))
                ) && 
                (
                    this.PixelFormat == input.PixelFormat ||
                    (this.PixelFormat != null &&
                    this.PixelFormat.Equals(input.PixelFormat))
                ) && 
                (
                    this.Level == input.Level ||
                    (this.Level != null &&
                    this.Level.Equals(input.Level))
                ) && 
                (
                    this.IsAnamorphic == input.IsAnamorphic ||
                    (this.IsAnamorphic != null &&
                    this.IsAnamorphic.Equals(input.IsAnamorphic))
                ) && 
                (
                    this.ItemId == input.ItemId ||
                    (this.ItemId != null &&
                    this.ItemId.Equals(input.ItemId))
                ) && 
                (
                    this.ServerId == input.ServerId ||
                    (this.ServerId != null &&
                    this.ServerId.Equals(input.ServerId))
                ) && 
                (
                    this.AttachmentSize == input.AttachmentSize ||
                    (this.AttachmentSize != null &&
                    this.AttachmentSize.Equals(input.AttachmentSize))
                ) && 
                (
                    this.MimeType == input.MimeType ||
                    (this.MimeType != null &&
                    this.MimeType.Equals(input.MimeType))
                ) && 
                (
                    this.IsClosedCaptions == input.IsClosedCaptions ||
                    (this.IsClosedCaptions != null &&
                    this.IsClosedCaptions.Equals(input.IsClosedCaptions))
                ) && 
                (
                    this.SubtitleLocationType == input.SubtitleLocationType ||
                    (this.SubtitleLocationType != null &&
                    this.SubtitleLocationType.Equals(input.SubtitleLocationType))
                );
        }

        /// <summary>
        /// Gets the hash code
        /// </summary>
        /// <returns>Hash code</returns>
        public override int GetHashCode()
        {
            unchecked // Overflow is fine, just wrap
            {
                int hashCode = 41;
                if (this.Codec != null)
                    hashCode = hashCode * 59 + this.Codec.GetHashCode();
                if (this.CodecTag != null)
                    hashCode = hashCode * 59 + this.CodecTag.GetHashCode();
                if (this.Language != null)
                    hashCode = hashCode * 59 + this.Language.GetHashCode();
                if (this.ColorTransfer != null)
                    hashCode = hashCode * 59 + this.ColorTransfer.GetHashCode();
                if (this.ColorPrimaries != null)
                    hashCode = hashCode * 59 + this.ColorPrimaries.GetHashCode();
                if (this.ColorSpace != null)
                    hashCode = hashCode * 59 + this.ColorSpace.GetHashCode();
                if (this.Comment != null)
                    hashCode = hashCode * 59 + this.Comment.GetHashCode();
                if (this.StreamStartTimeTicks != null)
                    hashCode = hashCode * 59 + this.StreamStartTimeTicks.GetHashCode();
                if (this.TimeBase != null)
                    hashCode = hashCode * 59 + this.TimeBase.GetHashCode();
                if (this.CodecTimeBase != null)
                    hashCode = hashCode * 59 + this.CodecTimeBase.GetHashCode();
                if (this.Title != null)
                    hashCode = hashCode * 59 + this.Title.GetHashCode();
                if (this.Extradata != null)
                    hashCode = hashCode * 59 + this.Extradata.GetHashCode();
                if (this.VideoRange != null)
                    hashCode = hashCode * 59 + this.VideoRange.GetHashCode();
                if (this.DisplayTitle != null)
                    hashCode = hashCode * 59 + this.DisplayTitle.GetHashCode();
                if (this.DisplayLanguage != null)
                    hashCode = hashCode * 59 + this.DisplayLanguage.GetHashCode();
                if (this.NalLengthSize != null)
                    hashCode = hashCode * 59 + this.NalLengthSize.GetHashCode();
                if (this.IsInterlaced != null)
                    hashCode = hashCode * 59 + this.IsInterlaced.GetHashCode();
                if (this.IsAVC != null)
                    hashCode = hashCode * 59 + this.IsAVC.GetHashCode();
                if (this.ChannelLayout != null)
                    hashCode = hashCode * 59 + this.ChannelLayout.GetHashCode();
                if (this.BitRate != null)
                    hashCode = hashCode * 59 + this.BitRate.GetHashCode();
                if (this.BitDepth != null)
                    hashCode = hashCode * 59 + this.BitDepth.GetHashCode();
                if (this.RefFrames != null)
                    hashCode = hashCode * 59 + this.RefFrames.GetHashCode();
                if (this.Rotation != null)
                    hashCode = hashCode * 59 + this.Rotation.GetHashCode();
                if (this.Channels != null)
                    hashCode = hashCode * 59 + this.Channels.GetHashCode();
                if (this.SampleRate != null)
                    hashCode = hashCode * 59 + this.SampleRate.GetHashCode();
                if (this.IsDefault != null)
                    hashCode = hashCode * 59 + this.IsDefault.GetHashCode();
                if (this.IsForced != null)
                    hashCode = hashCode * 59 + this.IsForced.GetHashCode();
                if (this.Height != null)
                    hashCode = hashCode * 59 + this.Height.GetHashCode();
                if (this.Width != null)
                    hashCode = hashCode * 59 + this.Width.GetHashCode();
                if (this.AverageFrameRate != null)
                    hashCode = hashCode * 59 + this.AverageFrameRate.GetHashCode();
                if (this.RealFrameRate != null)
                    hashCode = hashCode * 59 + this.RealFrameRate.GetHashCode();
                if (this.Profile != null)
                    hashCode = hashCode * 59 + this.Profile.GetHashCode();
                if (this.Type != null)
                    hashCode = hashCode * 59 + this.Type.GetHashCode();
                if (this.AspectRatio != null)
                    hashCode = hashCode * 59 + this.AspectRatio.GetHashCode();
                if (this.Index != null)
                    hashCode = hashCode * 59 + this.Index.GetHashCode();
                if (this.IsExternal != null)
                    hashCode = hashCode * 59 + this.IsExternal.GetHashCode();
                if (this.DeliveryMethod != null)
                    hashCode = hashCode * 59 + this.DeliveryMethod.GetHashCode();
                if (this.DeliveryUrl != null)
                    hashCode = hashCode * 59 + this.DeliveryUrl.GetHashCode();
                if (this.IsExternalUrl != null)
                    hashCode = hashCode * 59 + this.IsExternalUrl.GetHashCode();
                if (this.IsTextSubtitleStream != null)
                    hashCode = hashCode * 59 + this.IsTextSubtitleStream.GetHashCode();
                if (this.SupportsExternalStream != null)
                    hashCode = hashCode * 59 + this.SupportsExternalStream.GetHashCode();
                if (this.Path != null)
                    hashCode = hashCode * 59 + this.Path.GetHashCode();
                if (this.Protocol != null)
                    hashCode = hashCode * 59 + this.Protocol.GetHashCode();
                if (this.PixelFormat != null)
                    hashCode = hashCode * 59 + this.PixelFormat.GetHashCode();
                if (this.Level != null)
                    hashCode = hashCode * 59 + this.Level.GetHashCode();
                if (this.IsAnamorphic != null)
                    hashCode = hashCode * 59 + this.IsAnamorphic.GetHashCode();
                if (this.ItemId != null)
                    hashCode = hashCode * 59 + this.ItemId.GetHashCode();
                if (this.ServerId != null)
                    hashCode = hashCode * 59 + this.ServerId.GetHashCode();
                if (this.AttachmentSize != null)
                    hashCode = hashCode * 59 + this.AttachmentSize.GetHashCode();
                if (this.MimeType != null)
                    hashCode = hashCode * 59 + this.MimeType.GetHashCode();
                if (this.IsClosedCaptions != null)
                    hashCode = hashCode * 59 + this.IsClosedCaptions.GetHashCode();
                if (this.SubtitleLocationType != null)
                    hashCode = hashCode * 59 + this.SubtitleLocationType.GetHashCode();
                return hashCode;
            }
        }

    }
}
