// <auto-generated>
// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is
// regenerated.
// </auto-generated>

namespace EmbyClient.MsRest.Models
{
    using Newtonsoft.Json;
    using System.Linq;

    public partial class MediaStream
    {
        /// <summary>
        /// Initializes a new instance of the MediaStream class.
        /// </summary>
        public MediaStream()
        {
            CustomInit();
        }

        /// <summary>
        /// Initializes a new instance of the MediaStream class.
        /// </summary>
        /// <param name="type">Possible values include: 'Unknown', 'Audio',
        /// 'Video', 'Subtitle', 'EmbeddedImage', 'Attachment', 'Data'</param>
        /// <param name="deliveryMethod">Possible values include: 'Encode',
        /// 'Embed', 'External', 'Hls', 'VideoSideData'</param>
        /// <param name="protocol">Possible values include: 'File', 'Http',
        /// 'Rtmp', 'Rtsp', 'Udp', 'Rtp', 'Ftp', 'Mms'</param>
        /// <param name="extendedVideoType">Possible values include: 'None',
        /// 'Hdr10', 'Hdr10Plus', 'HyperLogGamma', 'DolbyVision'</param>
        /// <param name="extendedVideoSubtype">Possible values include: 'None',
        /// 'Hdr10', 'HyperLogGamma', 'Hdr10Plus0', 'DoviProfile02',
        /// 'DoviProfile10', 'DoviProfile22', 'DoviProfile30', 'DoviProfile42',
        /// 'DoviProfile50', 'DoviProfile61', 'DoviProfile76', 'DoviProfile81',
        /// 'DoviProfile82', 'DoviProfile83', 'DoviProfile84', 'DoviProfile85',
        /// 'DoviProfile92'</param>
        /// <param name="subtitleLocationType">Possible values include:
        /// 'InternalStream', 'VideoSideData'</param>
        public MediaStream(string codec = default(string), string codecTag = default(string), string language = default(string), string colorTransfer = default(string), string colorPrimaries = default(string), string colorSpace = default(string), string comment = default(string), long? streamStartTimeTicks = default(long?), string timeBase = default(string), string title = default(string), string extradata = default(string), string videoRange = default(string), string displayTitle = default(string), string displayLanguage = default(string), string nalLengthSize = default(string), bool? isInterlaced = default(bool?), bool? isAVC = default(bool?), string channelLayout = default(string), int? bitRate = default(int?), int? bitDepth = default(int?), int? refFrames = default(int?), int? rotation = default(int?), int? channels = default(int?), int? sampleRate = default(int?), bool? isDefault = default(bool?), bool? isForced = default(bool?), int? height = default(int?), int? width = default(int?), double? averageFrameRate = default(double?), double? realFrameRate = default(double?), string profile = default(string), string type = default(string), string aspectRatio = default(string), int? index = default(int?), bool? isExternal = default(bool?), string deliveryMethod = default(string), string deliveryUrl = default(string), bool? isExternalUrl = default(bool?), bool? isTextSubtitleStream = default(bool?), bool? supportsExternalStream = default(bool?), string path = default(string), string protocol = default(string), string pixelFormat = default(string), double? level = default(double?), bool? isAnamorphic = default(bool?), string extendedVideoType = default(string), string extendedVideoSubtype = default(string), string itemId = default(string), string serverId = default(string), int? attachmentSize = default(int?), string mimeType = default(string), string subtitleLocationType = default(string))
        {
            Codec = codec;
            CodecTag = codecTag;
            Language = language;
            ColorTransfer = colorTransfer;
            ColorPrimaries = colorPrimaries;
            ColorSpace = colorSpace;
            Comment = comment;
            StreamStartTimeTicks = streamStartTimeTicks;
            TimeBase = timeBase;
            Title = title;
            Extradata = extradata;
            VideoRange = videoRange;
            DisplayTitle = displayTitle;
            DisplayLanguage = displayLanguage;
            NalLengthSize = nalLengthSize;
            IsInterlaced = isInterlaced;
            IsAVC = isAVC;
            ChannelLayout = channelLayout;
            BitRate = bitRate;
            BitDepth = bitDepth;
            RefFrames = refFrames;
            Rotation = rotation;
            Channels = channels;
            SampleRate = sampleRate;
            IsDefault = isDefault;
            IsForced = isForced;
            Height = height;
            Width = width;
            AverageFrameRate = averageFrameRate;
            RealFrameRate = realFrameRate;
            Profile = profile;
            Type = type;
            AspectRatio = aspectRatio;
            Index = index;
            IsExternal = isExternal;
            DeliveryMethod = deliveryMethod;
            DeliveryUrl = deliveryUrl;
            IsExternalUrl = isExternalUrl;
            IsTextSubtitleStream = isTextSubtitleStream;
            SupportsExternalStream = supportsExternalStream;
            Path = path;
            Protocol = protocol;
            PixelFormat = pixelFormat;
            Level = level;
            IsAnamorphic = isAnamorphic;
            ExtendedVideoType = extendedVideoType;
            ExtendedVideoSubtype = extendedVideoSubtype;
            ItemId = itemId;
            ServerId = serverId;
            AttachmentSize = attachmentSize;
            MimeType = mimeType;
            SubtitleLocationType = subtitleLocationType;
            CustomInit();
        }

        /// <summary>
        /// An initialization method that performs custom operations like setting defaults
        /// </summary>
        partial void CustomInit();

        /// <summary>
        /// </summary>
        [JsonProperty(PropertyName = "Codec")]
        public string Codec { get; set; }

        /// <summary>
        /// </summary>
        [JsonProperty(PropertyName = "CodecTag")]
        public string CodecTag { get; set; }

        /// <summary>
        /// </summary>
        [JsonProperty(PropertyName = "Language")]
        public string Language { get; set; }

        /// <summary>
        /// </summary>
        [JsonProperty(PropertyName = "ColorTransfer")]
        public string ColorTransfer { get; set; }

        /// <summary>
        /// </summary>
        [JsonProperty(PropertyName = "ColorPrimaries")]
        public string ColorPrimaries { get; set; }

        /// <summary>
        /// </summary>
        [JsonProperty(PropertyName = "ColorSpace")]
        public string ColorSpace { get; set; }

        /// <summary>
        /// </summary>
        [JsonProperty(PropertyName = "Comment")]
        public string Comment { get; set; }

        /// <summary>
        /// </summary>
        [JsonProperty(PropertyName = "StreamStartTimeTicks")]
        public long? StreamStartTimeTicks { get; set; }

        /// <summary>
        /// </summary>
        [JsonProperty(PropertyName = "TimeBase")]
        public string TimeBase { get; set; }

        /// <summary>
        /// </summary>
        [JsonProperty(PropertyName = "Title")]
        public string Title { get; set; }

        /// <summary>
        /// </summary>
        [JsonProperty(PropertyName = "Extradata")]
        public string Extradata { get; set; }

        /// <summary>
        /// </summary>
        [JsonProperty(PropertyName = "VideoRange")]
        public string VideoRange { get; set; }

        /// <summary>
        /// </summary>
        [JsonProperty(PropertyName = "DisplayTitle")]
        public string DisplayTitle { get; set; }

        /// <summary>
        /// </summary>
        [JsonProperty(PropertyName = "DisplayLanguage")]
        public string DisplayLanguage { get; set; }

        /// <summary>
        /// </summary>
        [JsonProperty(PropertyName = "NalLengthSize")]
        public string NalLengthSize { get; set; }

        /// <summary>
        /// </summary>
        [JsonProperty(PropertyName = "IsInterlaced")]
        public bool? IsInterlaced { get; set; }

        /// <summary>
        /// </summary>
        [JsonProperty(PropertyName = "IsAVC")]
        public bool? IsAVC { get; set; }

        /// <summary>
        /// </summary>
        [JsonProperty(PropertyName = "ChannelLayout")]
        public string ChannelLayout { get; set; }

        /// <summary>
        /// </summary>
        [JsonProperty(PropertyName = "BitRate")]
        public int? BitRate { get; set; }

        /// <summary>
        /// </summary>
        [JsonProperty(PropertyName = "BitDepth")]
        public int? BitDepth { get; set; }

        /// <summary>
        /// </summary>
        [JsonProperty(PropertyName = "RefFrames")]
        public int? RefFrames { get; set; }

        /// <summary>
        /// </summary>
        [JsonProperty(PropertyName = "Rotation")]
        public int? Rotation { get; set; }

        /// <summary>
        /// </summary>
        [JsonProperty(PropertyName = "Channels")]
        public int? Channels { get; set; }

        /// <summary>
        /// </summary>
        [JsonProperty(PropertyName = "SampleRate")]
        public int? SampleRate { get; set; }

        /// <summary>
        /// </summary>
        [JsonProperty(PropertyName = "IsDefault")]
        public bool? IsDefault { get; set; }

        /// <summary>
        /// </summary>
        [JsonProperty(PropertyName = "IsForced")]
        public bool? IsForced { get; set; }

        /// <summary>
        /// </summary>
        [JsonProperty(PropertyName = "Height")]
        public int? Height { get; set; }

        /// <summary>
        /// </summary>
        [JsonProperty(PropertyName = "Width")]
        public int? Width { get; set; }

        /// <summary>
        /// </summary>
        [JsonProperty(PropertyName = "AverageFrameRate")]
        public double? AverageFrameRate { get; set; }

        /// <summary>
        /// </summary>
        [JsonProperty(PropertyName = "RealFrameRate")]
        public double? RealFrameRate { get; set; }

        /// <summary>
        /// </summary>
        [JsonProperty(PropertyName = "Profile")]
        public string Profile { get; set; }

        /// <summary>
        /// Gets or sets possible values include: 'Unknown', 'Audio', 'Video',
        /// 'Subtitle', 'EmbeddedImage', 'Attachment', 'Data'
        /// </summary>
        [JsonProperty(PropertyName = "Type")]
        public string Type { get; set; }

        /// <summary>
        /// </summary>
        [JsonProperty(PropertyName = "AspectRatio")]
        public string AspectRatio { get; set; }

        /// <summary>
        /// </summary>
        [JsonProperty(PropertyName = "Index")]
        public int? Index { get; set; }

        /// <summary>
        /// </summary>
        [JsonProperty(PropertyName = "IsExternal")]
        public bool? IsExternal { get; set; }

        /// <summary>
        /// Gets or sets possible values include: 'Encode', 'Embed',
        /// 'External', 'Hls', 'VideoSideData'
        /// </summary>
        [JsonProperty(PropertyName = "DeliveryMethod")]
        public string DeliveryMethod { get; set; }

        /// <summary>
        /// </summary>
        [JsonProperty(PropertyName = "DeliveryUrl")]
        public string DeliveryUrl { get; set; }

        /// <summary>
        /// </summary>
        [JsonProperty(PropertyName = "IsExternalUrl")]
        public bool? IsExternalUrl { get; set; }

        /// <summary>
        /// </summary>
        [JsonProperty(PropertyName = "IsTextSubtitleStream")]
        public bool? IsTextSubtitleStream { get; set; }

        /// <summary>
        /// </summary>
        [JsonProperty(PropertyName = "SupportsExternalStream")]
        public bool? SupportsExternalStream { get; set; }

        /// <summary>
        /// </summary>
        [JsonProperty(PropertyName = "Path")]
        public string Path { get; set; }

        /// <summary>
        /// Gets or sets possible values include: 'File', 'Http', 'Rtmp',
        /// 'Rtsp', 'Udp', 'Rtp', 'Ftp', 'Mms'
        /// </summary>
        [JsonProperty(PropertyName = "Protocol")]
        public string Protocol { get; set; }

        /// <summary>
        /// </summary>
        [JsonProperty(PropertyName = "PixelFormat")]
        public string PixelFormat { get; set; }

        /// <summary>
        /// </summary>
        [JsonProperty(PropertyName = "Level")]
        public double? Level { get; set; }

        /// <summary>
        /// </summary>
        [JsonProperty(PropertyName = "IsAnamorphic")]
        public bool? IsAnamorphic { get; set; }

        /// <summary>
        /// Gets or sets possible values include: 'None', 'Hdr10', 'Hdr10Plus',
        /// 'HyperLogGamma', 'DolbyVision'
        /// </summary>
        [JsonProperty(PropertyName = "ExtendedVideoType")]
        public string ExtendedVideoType { get; set; }

        /// <summary>
        /// Gets or sets possible values include: 'None', 'Hdr10',
        /// 'HyperLogGamma', 'Hdr10Plus0', 'DoviProfile02', 'DoviProfile10',
        /// 'DoviProfile22', 'DoviProfile30', 'DoviProfile42', 'DoviProfile50',
        /// 'DoviProfile61', 'DoviProfile76', 'DoviProfile81', 'DoviProfile82',
        /// 'DoviProfile83', 'DoviProfile84', 'DoviProfile85', 'DoviProfile92'
        /// </summary>
        [JsonProperty(PropertyName = "ExtendedVideoSubtype")]
        public string ExtendedVideoSubtype { get; set; }

        /// <summary>
        /// </summary>
        [JsonProperty(PropertyName = "ItemId")]
        public string ItemId { get; set; }

        /// <summary>
        /// </summary>
        [JsonProperty(PropertyName = "ServerId")]
        public string ServerId { get; set; }

        /// <summary>
        /// </summary>
        [JsonProperty(PropertyName = "AttachmentSize")]
        public int? AttachmentSize { get; set; }

        /// <summary>
        /// </summary>
        [JsonProperty(PropertyName = "MimeType")]
        public string MimeType { get; set; }

        /// <summary>
        /// Gets or sets possible values include: 'InternalStream',
        /// 'VideoSideData'
        /// </summary>
        [JsonProperty(PropertyName = "SubtitleLocationType")]
        public string SubtitleLocationType { get; set; }

    }
}