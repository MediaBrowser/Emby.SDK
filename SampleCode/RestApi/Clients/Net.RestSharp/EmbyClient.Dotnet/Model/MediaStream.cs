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
    /// MediaStream information.      MediaStream itens are typically included in a &#x60;MediaBrowser.Model.Dto.MediaSourceInfo&#x60; object.      &#x60;MediaBrowser.Model.Dto.MediaSourceInfo.MediaStreams&#x60;  
    /// </summary>
    [DataContract]
        public partial class MediaStream :  IEquatable<MediaStream>
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="MediaStream" /> class.
        /// </summary>
        /// <param name="codec">The codec.    Probe Field: &#x60;codec_name&#x60;    Applies to: &#x60;MediaBrowser.Model.Entities.MediaStreamType.Video&#x60;, &#x60;MediaBrowser.Model.Entities.MediaStreamType.Audio&#x60;, &#x60;MediaBrowser.Model.Entities.MediaStreamType.Subtitle&#x60;    Related Enums: &#x60;T:Emby.Media.Model.Enums.VideoMediaTypes&#x60;, &#x60;Emby.Media.Model.Enums.AudioMediaTypes&#x60;, &#x60;Emby.Media.Model.Enums.SubtitleMediaTypes&#x60;..</param>
        /// <param name="codecTag">The codec tag.    Probe Field: &#x60;codec_tag&#x60;    Applies to: &#x60;MediaBrowser.Model.Entities.MediaStreamType.Video&#x60;, &#x60;MediaBrowser.Model.Entities.MediaStreamType.Audio&#x60;, &#x60;MediaBrowser.Model.Entities.MediaStreamType.Subtitle&#x60;..</param>
        /// <param name="language">The language.    Probe Field: &#x60;tags[\&quot;language\&quot;]&#x60;    Applies to: &#x60;MediaBrowser.Model.Entities.MediaStreamType.Audio&#x60;, &#x60;MediaBrowser.Model.Entities.MediaStreamType.Subtitle&#x60;..</param>
        /// <param name="colorTransfer">The color transfer characteristics.    Probe Field: &#x60;color_transfer&#x60;    Applies to: &#x60;MediaBrowser.Model.Entities.MediaStreamType.Video&#x60;    Related Enum: &#x60;Emby.Media.Model.Enums.ColorTransfers&#x60;..</param>
        /// <param name="colorPrimaries">The chromaticity coordinates of the source primaries.    Probe Field: &#x60;color_primaries&#x60;    Applies to: &#x60;MediaBrowser.Model.Entities.MediaStreamType.Video&#x60;    Related Enum: &#x60;Emby.Media.Model.Enums.ColorPrimaries&#x60;..</param>
        /// <param name="colorSpace">The YUV colorspace type.    Probe Field: &#x60;color_space&#x60;    Applies to: &#x60;MediaBrowser.Model.Entities.MediaStreamType.Video&#x60;    Related Enum: &#x60;Emby.Media.Model.Enums.ColorSpaces&#x60;..</param>
        /// <param name="comment">The comment.    Probe Field: &#x60;tags[\&quot;comment\&quot;]&#x60;    Applies to: &#x60;MediaBrowser.Model.Entities.MediaStreamType.Video&#x60;, &#x60;MediaBrowser.Model.Entities.MediaStreamType.Audio&#x60;, &#x60;MediaBrowser.Model.Entities.MediaStreamType.Subtitle&#x60;..</param>
        /// <param name="streamStartTimeTicks">The start time of the stream.    Probe Field: &#x60;start_time&#x60;    Applies to: &#x60;MediaBrowser.Model.Entities.MediaStreamType.Video&#x60;, &#x60;MediaBrowser.Model.Entities.MediaStreamType.Audio&#x60;, &#x60;MediaBrowser.Model.Entities.MediaStreamType.Subtitle&#x60;.    Actual type: &#x60;System.TimeSpan&#x60;..</param>
        /// <param name="timeBase">The time\\-base.    Probe Field: &#x60;time_base&#x60;    Applies to: &#x60;MediaBrowser.Model.Entities.MediaStreamType.Video&#x60;, &#x60;MediaBrowser.Model.Entities.MediaStreamType.Audio&#x60;, &#x60;MediaBrowser.Model.Entities.MediaStreamType.Subtitle&#x60;.    Actual type: &#x60;Emby.Media.Model.Types.Rational&#x60;..</param>
        /// <param name="title">The title.    Probe Field: &#x60;tags[\&quot;title\&quot;]&#x60;    Applies to: &#x60;MediaBrowser.Model.Entities.MediaStreamType.Video&#x60;, &#x60;MediaBrowser.Model.Entities.MediaStreamType.Audio&#x60;, &#x60;MediaBrowser.Model.Entities.MediaStreamType.Subtitle&#x60;..</param>
        /// <param name="extradata">The extradata.    Probe Field: &#x60;extradata&#x60;    Applies to: &#x60;MediaBrowser.Model.Entities.MediaStreamType.Video&#x60;, &#x60;MediaBrowser.Model.Entities.MediaStreamType.Audio&#x60;, &#x60;MediaBrowser.Model.Entities.MediaStreamType.Subtitle&#x60;.    Currently, this value is only parsed for subtitle streams with codec &#x60;Emby.Media.Model.Enums.SubtitleMediaTypes.dvb_teletext&#x60;..</param>
        /// <param name="videoRange">videoRange.</param>
        /// <param name="displayTitle">The display title.    Custom property set by the application..</param>
        /// <param name="displayLanguage">The display language.    Custom property set by the application..</param>
        /// <param name="nalLengthSize">The nal length size.    Probe Field: &#x60;nal_length_size&#x60;    Applies to: &#x60;MediaBrowser.Model.Entities.MediaStreamType.Video&#x60; of type &#x60;Emby.Media.Model.Enums.VideoMediaTypes.h264&#x60;.    Actual type: &#x60;System.Int32&#x60;..</param>
        /// <param name="isInterlaced">A value indicating whether this instance is interlaced.    Probe Field: &#x60;field_order&#x60; \\!\\&#x3D; &#x60;progressive&#x60;    Applies to: &#x60;MediaBrowser.Model.Entities.MediaStreamType.Video&#x60;..</param>
        /// <param name="isAVC">isAVC.</param>
        /// <param name="channelLayout">The channel layout.    Probe Field: &#x60;channel_layout&#x60;    Applies to: &#x60;MediaBrowser.Model.Entities.MediaStreamType.Audio&#x60;    Related Enum: &#x60;MediaBrowser.Model.Entities.MediaStream.ChannelLayout&#x60;..</param>
        /// <param name="bitRate">The bit rate.    Probe Field: &#x60;bit_rate&#x60;    Applies to: &#x60;MediaBrowser.Model.Entities.MediaStreamType.Video&#x60;, &#x60;MediaBrowser.Model.Entities.MediaStreamType.Audio&#x60;.    THIS VALUE IS PROCESSED BY CUSTOM LOGIC AND DOES NOT NECESSARILY MATCH FFPROBE RESULTS\\!.</param>
        /// <param name="bitDepth">The bit depth.    Probe Field: &#x60;bits_per_sample&#x60; or &#x60;bits_per_raw_sample&#x60;    Applies to: &#x60;MediaBrowser.Model.Entities.MediaStreamType.Video&#x60;, &#x60;MediaBrowser.Model.Entities.MediaStreamType.Audio&#x60;..</param>
        /// <param name="refFrames">The reference frames.    Probe Field: &#x60;refs&#x60;    Applies to: &#x60;MediaBrowser.Model.Entities.MediaStreamType.Video&#x60;..</param>
        /// <param name="rotation">rotation.</param>
        /// <param name="channels">The audio channel count.    Probe Field: &#x60;channels&#x60;    Applies to: &#x60;MediaBrowser.Model.Entities.MediaStreamType.Audio&#x60;..</param>
        /// <param name="sampleRate">The sample rate.    Probe Field: &#x60;sample_rate&#x60;    Applies to: &#x60;MediaBrowser.Model.Entities.MediaStreamType.Audio&#x60;    Related Enum: &#x60;Emby.Media.Model.Enums.SampleRates&#x60;..</param>
        /// <param name="isDefault">A value indicating whether this instance is default.    Probe Field: &#x60;disposition[\&quot;default\&quot;]&#x60;    Applies to: &#x60;MediaBrowser.Model.Entities.MediaStreamType.Video&#x60;, &#x60;MediaBrowser.Model.Entities.MediaStreamType.Audio&#x60;, &#x60;MediaBrowser.Model.Entities.MediaStreamType.Subtitle&#x60;..</param>
        /// <param name="isForced">A value indicating whether this instance is forced.    Probe Field: &#x60;disposition[\&quot;forced\&quot;]&#x60;    Applies to: &#x60;MediaBrowser.Model.Entities.MediaStreamType.Video&#x60;, &#x60;MediaBrowser.Model.Entities.MediaStreamType.Audio&#x60;, &#x60;MediaBrowser.Model.Entities.MediaStreamType.Subtitle&#x60;..</param>
        /// <param name="isHearingImpaired">isHearingImpaired.</param>
        /// <param name="height">The height.    Probe Field: &#x60;height&#x60;    Applies to: &#x60;MediaBrowser.Model.Entities.MediaStreamType.Video&#x60;..</param>
        /// <param name="width">The width.    Probe Field: &#x60;width&#x60;    Applies to: &#x60;MediaBrowser.Model.Entities.MediaStreamType.Video&#x60;..</param>
        /// <param name="averageFrameRate">The average frame rate..    Probe Field: &#x60;avg_frame_rate&#x60;    Applies to: &#x60;MediaBrowser.Model.Entities.MediaStreamType.Video&#x60;.    Actual type: &#x60;Emby.Media.Model.Types.Rational&#x60;..</param>
        /// <param name="realFrameRate">The real frame rate..    Probe Field: &#x60;r_frame_rate&#x60;    Applies to: &#x60;MediaBrowser.Model.Entities.MediaStreamType.Video&#x60;.    Actual type: &#x60;Emby.Media.Model.Types.Rational&#x60;..</param>
        /// <param name="profile">The profile.    Probe Field: &#x60;profile&#x60;    Applies to: &#x60;MediaBrowser.Model.Entities.MediaStreamType.Video&#x60;, &#x60;MediaBrowser.Model.Entities.MediaStreamType.Audio&#x60;    Related Enums: &#x60;Emby.Media.Model.Enums.AacProfiles&#x60;, &#x60;Emby.Media.Model.Enums.AvcProfiles&#x60;, &#x60;Emby.Media.Model.Enums.H263Profiles&#x60;, &#x60;Emby.Media.Model.Enums.HevcProfiles&#x60;, &#x60;Emby.Media.Model.Enums.Mpeg2Profiles&#x60;,&#x60;Emby.Media.Model.Enums.Vc1Profiles&#x60;, &#x60;Emby.Media.Model.Enums.Mpeg4Profiles&#x60;, &#x60;Emby.Media.Model.Enums.Vp8Profiles&#x60;, &#x60;Emby.Media.Model.Enums.Vp9Profiles&#x60;..</param>
        /// <param name="type">type.</param>
        /// <param name="aspectRatio">The aspect ratio.    Probe Field: &#x60;display_aspect_ratio&#x60;    Applies to: &#x60;MediaBrowser.Model.Entities.MediaStreamType.Video&#x60;.    Actual type: &#x60;Emby.Media.Model.Types.Rational&#x60;..</param>
        /// <param name="index">The index of the stream inside its container.    Probe Field: &#x60;index&#x60;    Applies to: &#x60;MediaBrowser.Model.Entities.MediaStreamType.Video&#x60;, &#x60;MediaBrowser.Model.Entities.MediaStreamType.Audio&#x60;, &#x60;MediaBrowser.Model.Entities.MediaStreamType.Subtitle&#x60;..</param>
        /// <param name="isExternal">A value indicating whether this instance is external.    Custom property set by the application..</param>
        /// <param name="deliveryMethod">deliveryMethod.</param>
        /// <param name="deliveryUrl">The delivery URL.    Custom property set by the application..</param>
        /// <param name="isExternalUrl">A value indicating whether this instance is external URL.    Custom property set by the application..</param>
        /// <param name="isTextSubtitleStream">isTextSubtitleStream.</param>
        /// <param name="supportsExternalStream">A value indicating whether \\[supports external stream\\]..</param>
        /// <param name="path">The filename..</param>
        /// <param name="protocol">protocol.</param>
        /// <param name="pixelFormat">The pixel format.    Probe Field: &#x60;pix_fmt&#x60;    Applies to: &#x60;MediaBrowser.Model.Entities.MediaStreamType.Video&#x60;.    Actual type: &#x60;MediaBrowser.Model.Entities.MediaStream.PixelFormat&#x60;..</param>
        /// <param name="level">The codec level.    Probe Field: &#x60;level&#x60;    Applies to: &#x60;MediaBrowser.Model.Entities.MediaStreamType.Video&#x60;    Related Enums: &#x60;Emby.Media.Model.Enums.AvcLevels&#x60;, &#x60;Emby.Media.Model.Enums.H263Levels&#x60;, &#x60;Emby.Media.Model.Enums.HevcLevels&#x60;, &#x60;Emby.Media.Model.Enums.Mpeg2Levels&#x60;,&#x60;Emby.Media.Model.Enums.Vc1Levels&#x60;, &#x60;Emby.Media.Model.Enums.Mpeg4Levels&#x60;, &#x60;Emby.Media.Model.Enums.Vp8Levels&#x60;, &#x60;Emby.Media.Model.Enums.Vp9Levels&#x60;..</param>
        /// <param name="isAnamorphic">A value indicating whether this instance is anamorphic..</param>
        /// <param name="extendedVideoType">extendedVideoType.</param>
        /// <param name="extendedVideoSubType">extendedVideoSubType.</param>
        /// <param name="extendedVideoSubTypeDescription">The extended video sub\\-type description..</param>
        /// <param name="itemId">Used only by our Windows app. Not used by Emby Server..</param>
        /// <param name="serverId">Used only by our Windows app. Not used by Emby Server..</param>
        /// <param name="attachmentSize">The size of the attachment..</param>
        /// <param name="mimeType">The type of the MIME..</param>
        /// <param name="subtitleLocationType">subtitleLocationType.</param>
        public MediaStream(string codec = default(string), string codecTag = default(string), string language = default(string), string colorTransfer = default(string), string colorPrimaries = default(string), string colorSpace = default(string), string comment = default(string), long? streamStartTimeTicks = default(long?), string timeBase = default(string), string title = default(string), string extradata = default(string), string videoRange = default(string), string displayTitle = default(string), string displayLanguage = default(string), string nalLengthSize = default(string), bool? isInterlaced = default(bool?), bool? isAVC = default(bool?), string channelLayout = default(string), int? bitRate = default(int?), int? bitDepth = default(int?), int? refFrames = default(int?), int? rotation = default(int?), int? channels = default(int?), int? sampleRate = default(int?), bool? isDefault = default(bool?), bool? isForced = default(bool?), bool? isHearingImpaired = default(bool?), int? height = default(int?), int? width = default(int?), float? averageFrameRate = default(float?), float? realFrameRate = default(float?), string profile = default(string), MediaStreamType type = default(MediaStreamType), string aspectRatio = default(string), int? index = default(int?), bool? isExternal = default(bool?), SubtitleDeliveryMethod deliveryMethod = default(SubtitleDeliveryMethod), string deliveryUrl = default(string), bool? isExternalUrl = default(bool?), bool? isTextSubtitleStream = default(bool?), bool? supportsExternalStream = default(bool?), string path = default(string), MediaProtocol protocol = default(MediaProtocol), string pixelFormat = default(string), double? level = default(double?), bool? isAnamorphic = default(bool?), ExtendedVideoTypes extendedVideoType = default(ExtendedVideoTypes), ExtendedVideoSubTypes extendedVideoSubType = default(ExtendedVideoSubTypes), string extendedVideoSubTypeDescription = default(string), string itemId = default(string), string serverId = default(string), int? attachmentSize = default(int?), string mimeType = default(string), SubtitleLocationType subtitleLocationType = default(SubtitleLocationType))
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
            this.IsHearingImpaired = isHearingImpaired;
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
            this.ExtendedVideoType = extendedVideoType;
            this.ExtendedVideoSubType = extendedVideoSubType;
            this.ExtendedVideoSubTypeDescription = extendedVideoSubTypeDescription;
            this.ItemId = itemId;
            this.ServerId = serverId;
            this.AttachmentSize = attachmentSize;
            this.MimeType = mimeType;
            this.SubtitleLocationType = subtitleLocationType;
        }
        
        /// <summary>
        /// The codec.    Probe Field: &#x60;codec_name&#x60;    Applies to: &#x60;MediaBrowser.Model.Entities.MediaStreamType.Video&#x60;, &#x60;MediaBrowser.Model.Entities.MediaStreamType.Audio&#x60;, &#x60;MediaBrowser.Model.Entities.MediaStreamType.Subtitle&#x60;    Related Enums: &#x60;T:Emby.Media.Model.Enums.VideoMediaTypes&#x60;, &#x60;Emby.Media.Model.Enums.AudioMediaTypes&#x60;, &#x60;Emby.Media.Model.Enums.SubtitleMediaTypes&#x60;.
        /// </summary>
        /// <value>The codec.    Probe Field: &#x60;codec_name&#x60;    Applies to: &#x60;MediaBrowser.Model.Entities.MediaStreamType.Video&#x60;, &#x60;MediaBrowser.Model.Entities.MediaStreamType.Audio&#x60;, &#x60;MediaBrowser.Model.Entities.MediaStreamType.Subtitle&#x60;    Related Enums: &#x60;T:Emby.Media.Model.Enums.VideoMediaTypes&#x60;, &#x60;Emby.Media.Model.Enums.AudioMediaTypes&#x60;, &#x60;Emby.Media.Model.Enums.SubtitleMediaTypes&#x60;.</value>
        [DataMember(Name="Codec", EmitDefaultValue=false)]
        public string Codec { get; set; }

        /// <summary>
        /// The codec tag.    Probe Field: &#x60;codec_tag&#x60;    Applies to: &#x60;MediaBrowser.Model.Entities.MediaStreamType.Video&#x60;, &#x60;MediaBrowser.Model.Entities.MediaStreamType.Audio&#x60;, &#x60;MediaBrowser.Model.Entities.MediaStreamType.Subtitle&#x60;.
        /// </summary>
        /// <value>The codec tag.    Probe Field: &#x60;codec_tag&#x60;    Applies to: &#x60;MediaBrowser.Model.Entities.MediaStreamType.Video&#x60;, &#x60;MediaBrowser.Model.Entities.MediaStreamType.Audio&#x60;, &#x60;MediaBrowser.Model.Entities.MediaStreamType.Subtitle&#x60;.</value>
        [DataMember(Name="CodecTag", EmitDefaultValue=false)]
        public string CodecTag { get; set; }

        /// <summary>
        /// The language.    Probe Field: &#x60;tags[\&quot;language\&quot;]&#x60;    Applies to: &#x60;MediaBrowser.Model.Entities.MediaStreamType.Audio&#x60;, &#x60;MediaBrowser.Model.Entities.MediaStreamType.Subtitle&#x60;.
        /// </summary>
        /// <value>The language.    Probe Field: &#x60;tags[\&quot;language\&quot;]&#x60;    Applies to: &#x60;MediaBrowser.Model.Entities.MediaStreamType.Audio&#x60;, &#x60;MediaBrowser.Model.Entities.MediaStreamType.Subtitle&#x60;.</value>
        [DataMember(Name="Language", EmitDefaultValue=false)]
        public string Language { get; set; }

        /// <summary>
        /// The color transfer characteristics.    Probe Field: &#x60;color_transfer&#x60;    Applies to: &#x60;MediaBrowser.Model.Entities.MediaStreamType.Video&#x60;    Related Enum: &#x60;Emby.Media.Model.Enums.ColorTransfers&#x60;.
        /// </summary>
        /// <value>The color transfer characteristics.    Probe Field: &#x60;color_transfer&#x60;    Applies to: &#x60;MediaBrowser.Model.Entities.MediaStreamType.Video&#x60;    Related Enum: &#x60;Emby.Media.Model.Enums.ColorTransfers&#x60;.</value>
        [DataMember(Name="ColorTransfer", EmitDefaultValue=false)]
        public string ColorTransfer { get; set; }

        /// <summary>
        /// The chromaticity coordinates of the source primaries.    Probe Field: &#x60;color_primaries&#x60;    Applies to: &#x60;MediaBrowser.Model.Entities.MediaStreamType.Video&#x60;    Related Enum: &#x60;Emby.Media.Model.Enums.ColorPrimaries&#x60;.
        /// </summary>
        /// <value>The chromaticity coordinates of the source primaries.    Probe Field: &#x60;color_primaries&#x60;    Applies to: &#x60;MediaBrowser.Model.Entities.MediaStreamType.Video&#x60;    Related Enum: &#x60;Emby.Media.Model.Enums.ColorPrimaries&#x60;.</value>
        [DataMember(Name="ColorPrimaries", EmitDefaultValue=false)]
        public string ColorPrimaries { get; set; }

        /// <summary>
        /// The YUV colorspace type.    Probe Field: &#x60;color_space&#x60;    Applies to: &#x60;MediaBrowser.Model.Entities.MediaStreamType.Video&#x60;    Related Enum: &#x60;Emby.Media.Model.Enums.ColorSpaces&#x60;.
        /// </summary>
        /// <value>The YUV colorspace type.    Probe Field: &#x60;color_space&#x60;    Applies to: &#x60;MediaBrowser.Model.Entities.MediaStreamType.Video&#x60;    Related Enum: &#x60;Emby.Media.Model.Enums.ColorSpaces&#x60;.</value>
        [DataMember(Name="ColorSpace", EmitDefaultValue=false)]
        public string ColorSpace { get; set; }

        /// <summary>
        /// The comment.    Probe Field: &#x60;tags[\&quot;comment\&quot;]&#x60;    Applies to: &#x60;MediaBrowser.Model.Entities.MediaStreamType.Video&#x60;, &#x60;MediaBrowser.Model.Entities.MediaStreamType.Audio&#x60;, &#x60;MediaBrowser.Model.Entities.MediaStreamType.Subtitle&#x60;.
        /// </summary>
        /// <value>The comment.    Probe Field: &#x60;tags[\&quot;comment\&quot;]&#x60;    Applies to: &#x60;MediaBrowser.Model.Entities.MediaStreamType.Video&#x60;, &#x60;MediaBrowser.Model.Entities.MediaStreamType.Audio&#x60;, &#x60;MediaBrowser.Model.Entities.MediaStreamType.Subtitle&#x60;.</value>
        [DataMember(Name="Comment", EmitDefaultValue=false)]
        public string Comment { get; set; }

        /// <summary>
        /// The start time of the stream.    Probe Field: &#x60;start_time&#x60;    Applies to: &#x60;MediaBrowser.Model.Entities.MediaStreamType.Video&#x60;, &#x60;MediaBrowser.Model.Entities.MediaStreamType.Audio&#x60;, &#x60;MediaBrowser.Model.Entities.MediaStreamType.Subtitle&#x60;.    Actual type: &#x60;System.TimeSpan&#x60;.
        /// </summary>
        /// <value>The start time of the stream.    Probe Field: &#x60;start_time&#x60;    Applies to: &#x60;MediaBrowser.Model.Entities.MediaStreamType.Video&#x60;, &#x60;MediaBrowser.Model.Entities.MediaStreamType.Audio&#x60;, &#x60;MediaBrowser.Model.Entities.MediaStreamType.Subtitle&#x60;.    Actual type: &#x60;System.TimeSpan&#x60;.</value>
        [DataMember(Name="StreamStartTimeTicks", EmitDefaultValue=false)]
        public long? StreamStartTimeTicks { get; set; }

        /// <summary>
        /// The time\\-base.    Probe Field: &#x60;time_base&#x60;    Applies to: &#x60;MediaBrowser.Model.Entities.MediaStreamType.Video&#x60;, &#x60;MediaBrowser.Model.Entities.MediaStreamType.Audio&#x60;, &#x60;MediaBrowser.Model.Entities.MediaStreamType.Subtitle&#x60;.    Actual type: &#x60;Emby.Media.Model.Types.Rational&#x60;.
        /// </summary>
        /// <value>The time\\-base.    Probe Field: &#x60;time_base&#x60;    Applies to: &#x60;MediaBrowser.Model.Entities.MediaStreamType.Video&#x60;, &#x60;MediaBrowser.Model.Entities.MediaStreamType.Audio&#x60;, &#x60;MediaBrowser.Model.Entities.MediaStreamType.Subtitle&#x60;.    Actual type: &#x60;Emby.Media.Model.Types.Rational&#x60;.</value>
        [DataMember(Name="TimeBase", EmitDefaultValue=false)]
        public string TimeBase { get; set; }

        /// <summary>
        /// The title.    Probe Field: &#x60;tags[\&quot;title\&quot;]&#x60;    Applies to: &#x60;MediaBrowser.Model.Entities.MediaStreamType.Video&#x60;, &#x60;MediaBrowser.Model.Entities.MediaStreamType.Audio&#x60;, &#x60;MediaBrowser.Model.Entities.MediaStreamType.Subtitle&#x60;.
        /// </summary>
        /// <value>The title.    Probe Field: &#x60;tags[\&quot;title\&quot;]&#x60;    Applies to: &#x60;MediaBrowser.Model.Entities.MediaStreamType.Video&#x60;, &#x60;MediaBrowser.Model.Entities.MediaStreamType.Audio&#x60;, &#x60;MediaBrowser.Model.Entities.MediaStreamType.Subtitle&#x60;.</value>
        [DataMember(Name="Title", EmitDefaultValue=false)]
        public string Title { get; set; }

        /// <summary>
        /// The extradata.    Probe Field: &#x60;extradata&#x60;    Applies to: &#x60;MediaBrowser.Model.Entities.MediaStreamType.Video&#x60;, &#x60;MediaBrowser.Model.Entities.MediaStreamType.Audio&#x60;, &#x60;MediaBrowser.Model.Entities.MediaStreamType.Subtitle&#x60;.    Currently, this value is only parsed for subtitle streams with codec &#x60;Emby.Media.Model.Enums.SubtitleMediaTypes.dvb_teletext&#x60;.
        /// </summary>
        /// <value>The extradata.    Probe Field: &#x60;extradata&#x60;    Applies to: &#x60;MediaBrowser.Model.Entities.MediaStreamType.Video&#x60;, &#x60;MediaBrowser.Model.Entities.MediaStreamType.Audio&#x60;, &#x60;MediaBrowser.Model.Entities.MediaStreamType.Subtitle&#x60;.    Currently, this value is only parsed for subtitle streams with codec &#x60;Emby.Media.Model.Enums.SubtitleMediaTypes.dvb_teletext&#x60;.</value>
        [DataMember(Name="Extradata", EmitDefaultValue=false)]
        public string Extradata { get; set; }

        /// <summary>
        /// Gets or Sets VideoRange
        /// </summary>
        [DataMember(Name="VideoRange", EmitDefaultValue=false)]
        public string VideoRange { get; set; }

        /// <summary>
        /// The display title.    Custom property set by the application.
        /// </summary>
        /// <value>The display title.    Custom property set by the application.</value>
        [DataMember(Name="DisplayTitle", EmitDefaultValue=false)]
        public string DisplayTitle { get; set; }

        /// <summary>
        /// The display language.    Custom property set by the application.
        /// </summary>
        /// <value>The display language.    Custom property set by the application.</value>
        [DataMember(Name="DisplayLanguage", EmitDefaultValue=false)]
        public string DisplayLanguage { get; set; }

        /// <summary>
        /// The nal length size.    Probe Field: &#x60;nal_length_size&#x60;    Applies to: &#x60;MediaBrowser.Model.Entities.MediaStreamType.Video&#x60; of type &#x60;Emby.Media.Model.Enums.VideoMediaTypes.h264&#x60;.    Actual type: &#x60;System.Int32&#x60;.
        /// </summary>
        /// <value>The nal length size.    Probe Field: &#x60;nal_length_size&#x60;    Applies to: &#x60;MediaBrowser.Model.Entities.MediaStreamType.Video&#x60; of type &#x60;Emby.Media.Model.Enums.VideoMediaTypes.h264&#x60;.    Actual type: &#x60;System.Int32&#x60;.</value>
        [DataMember(Name="NalLengthSize", EmitDefaultValue=false)]
        public string NalLengthSize { get; set; }

        /// <summary>
        /// A value indicating whether this instance is interlaced.    Probe Field: &#x60;field_order&#x60; \\!\\&#x3D; &#x60;progressive&#x60;    Applies to: &#x60;MediaBrowser.Model.Entities.MediaStreamType.Video&#x60;.
        /// </summary>
        /// <value>A value indicating whether this instance is interlaced.    Probe Field: &#x60;field_order&#x60; \\!\\&#x3D; &#x60;progressive&#x60;    Applies to: &#x60;MediaBrowser.Model.Entities.MediaStreamType.Video&#x60;.</value>
        [DataMember(Name="IsInterlaced", EmitDefaultValue=false)]
        public bool? IsInterlaced { get; set; }

        /// <summary>
        /// Gets or Sets IsAVC
        /// </summary>
        [DataMember(Name="IsAVC", EmitDefaultValue=false)]
        public bool? IsAVC { get; set; }

        /// <summary>
        /// The channel layout.    Probe Field: &#x60;channel_layout&#x60;    Applies to: &#x60;MediaBrowser.Model.Entities.MediaStreamType.Audio&#x60;    Related Enum: &#x60;MediaBrowser.Model.Entities.MediaStream.ChannelLayout&#x60;.
        /// </summary>
        /// <value>The channel layout.    Probe Field: &#x60;channel_layout&#x60;    Applies to: &#x60;MediaBrowser.Model.Entities.MediaStreamType.Audio&#x60;    Related Enum: &#x60;MediaBrowser.Model.Entities.MediaStream.ChannelLayout&#x60;.</value>
        [DataMember(Name="ChannelLayout", EmitDefaultValue=false)]
        public string ChannelLayout { get; set; }

        /// <summary>
        /// The bit rate.    Probe Field: &#x60;bit_rate&#x60;    Applies to: &#x60;MediaBrowser.Model.Entities.MediaStreamType.Video&#x60;, &#x60;MediaBrowser.Model.Entities.MediaStreamType.Audio&#x60;.    THIS VALUE IS PROCESSED BY CUSTOM LOGIC AND DOES NOT NECESSARILY MATCH FFPROBE RESULTS\\!
        /// </summary>
        /// <value>The bit rate.    Probe Field: &#x60;bit_rate&#x60;    Applies to: &#x60;MediaBrowser.Model.Entities.MediaStreamType.Video&#x60;, &#x60;MediaBrowser.Model.Entities.MediaStreamType.Audio&#x60;.    THIS VALUE IS PROCESSED BY CUSTOM LOGIC AND DOES NOT NECESSARILY MATCH FFPROBE RESULTS\\!</value>
        [DataMember(Name="BitRate", EmitDefaultValue=false)]
        public int? BitRate { get; set; }

        /// <summary>
        /// The bit depth.    Probe Field: &#x60;bits_per_sample&#x60; or &#x60;bits_per_raw_sample&#x60;    Applies to: &#x60;MediaBrowser.Model.Entities.MediaStreamType.Video&#x60;, &#x60;MediaBrowser.Model.Entities.MediaStreamType.Audio&#x60;.
        /// </summary>
        /// <value>The bit depth.    Probe Field: &#x60;bits_per_sample&#x60; or &#x60;bits_per_raw_sample&#x60;    Applies to: &#x60;MediaBrowser.Model.Entities.MediaStreamType.Video&#x60;, &#x60;MediaBrowser.Model.Entities.MediaStreamType.Audio&#x60;.</value>
        [DataMember(Name="BitDepth", EmitDefaultValue=false)]
        public int? BitDepth { get; set; }

        /// <summary>
        /// The reference frames.    Probe Field: &#x60;refs&#x60;    Applies to: &#x60;MediaBrowser.Model.Entities.MediaStreamType.Video&#x60;.
        /// </summary>
        /// <value>The reference frames.    Probe Field: &#x60;refs&#x60;    Applies to: &#x60;MediaBrowser.Model.Entities.MediaStreamType.Video&#x60;.</value>
        [DataMember(Name="RefFrames", EmitDefaultValue=false)]
        public int? RefFrames { get; set; }

        /// <summary>
        /// Gets or Sets Rotation
        /// </summary>
        [DataMember(Name="Rotation", EmitDefaultValue=false)]
        public int? Rotation { get; set; }

        /// <summary>
        /// The audio channel count.    Probe Field: &#x60;channels&#x60;    Applies to: &#x60;MediaBrowser.Model.Entities.MediaStreamType.Audio&#x60;.
        /// </summary>
        /// <value>The audio channel count.    Probe Field: &#x60;channels&#x60;    Applies to: &#x60;MediaBrowser.Model.Entities.MediaStreamType.Audio&#x60;.</value>
        [DataMember(Name="Channels", EmitDefaultValue=false)]
        public int? Channels { get; set; }

        /// <summary>
        /// The sample rate.    Probe Field: &#x60;sample_rate&#x60;    Applies to: &#x60;MediaBrowser.Model.Entities.MediaStreamType.Audio&#x60;    Related Enum: &#x60;Emby.Media.Model.Enums.SampleRates&#x60;.
        /// </summary>
        /// <value>The sample rate.    Probe Field: &#x60;sample_rate&#x60;    Applies to: &#x60;MediaBrowser.Model.Entities.MediaStreamType.Audio&#x60;    Related Enum: &#x60;Emby.Media.Model.Enums.SampleRates&#x60;.</value>
        [DataMember(Name="SampleRate", EmitDefaultValue=false)]
        public int? SampleRate { get; set; }

        /// <summary>
        /// A value indicating whether this instance is default.    Probe Field: &#x60;disposition[\&quot;default\&quot;]&#x60;    Applies to: &#x60;MediaBrowser.Model.Entities.MediaStreamType.Video&#x60;, &#x60;MediaBrowser.Model.Entities.MediaStreamType.Audio&#x60;, &#x60;MediaBrowser.Model.Entities.MediaStreamType.Subtitle&#x60;.
        /// </summary>
        /// <value>A value indicating whether this instance is default.    Probe Field: &#x60;disposition[\&quot;default\&quot;]&#x60;    Applies to: &#x60;MediaBrowser.Model.Entities.MediaStreamType.Video&#x60;, &#x60;MediaBrowser.Model.Entities.MediaStreamType.Audio&#x60;, &#x60;MediaBrowser.Model.Entities.MediaStreamType.Subtitle&#x60;.</value>
        [DataMember(Name="IsDefault", EmitDefaultValue=false)]
        public bool? IsDefault { get; set; }

        /// <summary>
        /// A value indicating whether this instance is forced.    Probe Field: &#x60;disposition[\&quot;forced\&quot;]&#x60;    Applies to: &#x60;MediaBrowser.Model.Entities.MediaStreamType.Video&#x60;, &#x60;MediaBrowser.Model.Entities.MediaStreamType.Audio&#x60;, &#x60;MediaBrowser.Model.Entities.MediaStreamType.Subtitle&#x60;.
        /// </summary>
        /// <value>A value indicating whether this instance is forced.    Probe Field: &#x60;disposition[\&quot;forced\&quot;]&#x60;    Applies to: &#x60;MediaBrowser.Model.Entities.MediaStreamType.Video&#x60;, &#x60;MediaBrowser.Model.Entities.MediaStreamType.Audio&#x60;, &#x60;MediaBrowser.Model.Entities.MediaStreamType.Subtitle&#x60;.</value>
        [DataMember(Name="IsForced", EmitDefaultValue=false)]
        public bool? IsForced { get; set; }

        /// <summary>
        /// Gets or Sets IsHearingImpaired
        /// </summary>
        [DataMember(Name="IsHearingImpaired", EmitDefaultValue=false)]
        public bool? IsHearingImpaired { get; set; }

        /// <summary>
        /// The height.    Probe Field: &#x60;height&#x60;    Applies to: &#x60;MediaBrowser.Model.Entities.MediaStreamType.Video&#x60;.
        /// </summary>
        /// <value>The height.    Probe Field: &#x60;height&#x60;    Applies to: &#x60;MediaBrowser.Model.Entities.MediaStreamType.Video&#x60;.</value>
        [DataMember(Name="Height", EmitDefaultValue=false)]
        public int? Height { get; set; }

        /// <summary>
        /// The width.    Probe Field: &#x60;width&#x60;    Applies to: &#x60;MediaBrowser.Model.Entities.MediaStreamType.Video&#x60;.
        /// </summary>
        /// <value>The width.    Probe Field: &#x60;width&#x60;    Applies to: &#x60;MediaBrowser.Model.Entities.MediaStreamType.Video&#x60;.</value>
        [DataMember(Name="Width", EmitDefaultValue=false)]
        public int? Width { get; set; }

        /// <summary>
        /// The average frame rate..    Probe Field: &#x60;avg_frame_rate&#x60;    Applies to: &#x60;MediaBrowser.Model.Entities.MediaStreamType.Video&#x60;.    Actual type: &#x60;Emby.Media.Model.Types.Rational&#x60;.
        /// </summary>
        /// <value>The average frame rate..    Probe Field: &#x60;avg_frame_rate&#x60;    Applies to: &#x60;MediaBrowser.Model.Entities.MediaStreamType.Video&#x60;.    Actual type: &#x60;Emby.Media.Model.Types.Rational&#x60;.</value>
        [DataMember(Name="AverageFrameRate", EmitDefaultValue=false)]
        public float? AverageFrameRate { get; set; }

        /// <summary>
        /// The real frame rate..    Probe Field: &#x60;r_frame_rate&#x60;    Applies to: &#x60;MediaBrowser.Model.Entities.MediaStreamType.Video&#x60;.    Actual type: &#x60;Emby.Media.Model.Types.Rational&#x60;.
        /// </summary>
        /// <value>The real frame rate..    Probe Field: &#x60;r_frame_rate&#x60;    Applies to: &#x60;MediaBrowser.Model.Entities.MediaStreamType.Video&#x60;.    Actual type: &#x60;Emby.Media.Model.Types.Rational&#x60;.</value>
        [DataMember(Name="RealFrameRate", EmitDefaultValue=false)]
        public float? RealFrameRate { get; set; }

        /// <summary>
        /// The profile.    Probe Field: &#x60;profile&#x60;    Applies to: &#x60;MediaBrowser.Model.Entities.MediaStreamType.Video&#x60;, &#x60;MediaBrowser.Model.Entities.MediaStreamType.Audio&#x60;    Related Enums: &#x60;Emby.Media.Model.Enums.AacProfiles&#x60;, &#x60;Emby.Media.Model.Enums.AvcProfiles&#x60;, &#x60;Emby.Media.Model.Enums.H263Profiles&#x60;, &#x60;Emby.Media.Model.Enums.HevcProfiles&#x60;, &#x60;Emby.Media.Model.Enums.Mpeg2Profiles&#x60;,&#x60;Emby.Media.Model.Enums.Vc1Profiles&#x60;, &#x60;Emby.Media.Model.Enums.Mpeg4Profiles&#x60;, &#x60;Emby.Media.Model.Enums.Vp8Profiles&#x60;, &#x60;Emby.Media.Model.Enums.Vp9Profiles&#x60;.
        /// </summary>
        /// <value>The profile.    Probe Field: &#x60;profile&#x60;    Applies to: &#x60;MediaBrowser.Model.Entities.MediaStreamType.Video&#x60;, &#x60;MediaBrowser.Model.Entities.MediaStreamType.Audio&#x60;    Related Enums: &#x60;Emby.Media.Model.Enums.AacProfiles&#x60;, &#x60;Emby.Media.Model.Enums.AvcProfiles&#x60;, &#x60;Emby.Media.Model.Enums.H263Profiles&#x60;, &#x60;Emby.Media.Model.Enums.HevcProfiles&#x60;, &#x60;Emby.Media.Model.Enums.Mpeg2Profiles&#x60;,&#x60;Emby.Media.Model.Enums.Vc1Profiles&#x60;, &#x60;Emby.Media.Model.Enums.Mpeg4Profiles&#x60;, &#x60;Emby.Media.Model.Enums.Vp8Profiles&#x60;, &#x60;Emby.Media.Model.Enums.Vp9Profiles&#x60;.</value>
        [DataMember(Name="Profile", EmitDefaultValue=false)]
        public string Profile { get; set; }

        /// <summary>
        /// Gets or Sets Type
        /// </summary>
        [DataMember(Name="Type", EmitDefaultValue=false)]
        public MediaStreamType Type { get; set; }

        /// <summary>
        /// The aspect ratio.    Probe Field: &#x60;display_aspect_ratio&#x60;    Applies to: &#x60;MediaBrowser.Model.Entities.MediaStreamType.Video&#x60;.    Actual type: &#x60;Emby.Media.Model.Types.Rational&#x60;.
        /// </summary>
        /// <value>The aspect ratio.    Probe Field: &#x60;display_aspect_ratio&#x60;    Applies to: &#x60;MediaBrowser.Model.Entities.MediaStreamType.Video&#x60;.    Actual type: &#x60;Emby.Media.Model.Types.Rational&#x60;.</value>
        [DataMember(Name="AspectRatio", EmitDefaultValue=false)]
        public string AspectRatio { get; set; }

        /// <summary>
        /// The index of the stream inside its container.    Probe Field: &#x60;index&#x60;    Applies to: &#x60;MediaBrowser.Model.Entities.MediaStreamType.Video&#x60;, &#x60;MediaBrowser.Model.Entities.MediaStreamType.Audio&#x60;, &#x60;MediaBrowser.Model.Entities.MediaStreamType.Subtitle&#x60;.
        /// </summary>
        /// <value>The index of the stream inside its container.    Probe Field: &#x60;index&#x60;    Applies to: &#x60;MediaBrowser.Model.Entities.MediaStreamType.Video&#x60;, &#x60;MediaBrowser.Model.Entities.MediaStreamType.Audio&#x60;, &#x60;MediaBrowser.Model.Entities.MediaStreamType.Subtitle&#x60;.</value>
        [DataMember(Name="Index", EmitDefaultValue=false)]
        public int? Index { get; set; }

        /// <summary>
        /// A value indicating whether this instance is external.    Custom property set by the application.
        /// </summary>
        /// <value>A value indicating whether this instance is external.    Custom property set by the application.</value>
        [DataMember(Name="IsExternal", EmitDefaultValue=false)]
        public bool? IsExternal { get; set; }

        /// <summary>
        /// Gets or Sets DeliveryMethod
        /// </summary>
        [DataMember(Name="DeliveryMethod", EmitDefaultValue=false)]
        public SubtitleDeliveryMethod DeliveryMethod { get; set; }

        /// <summary>
        /// The delivery URL.    Custom property set by the application.
        /// </summary>
        /// <value>The delivery URL.    Custom property set by the application.</value>
        [DataMember(Name="DeliveryUrl", EmitDefaultValue=false)]
        public string DeliveryUrl { get; set; }

        /// <summary>
        /// A value indicating whether this instance is external URL.    Custom property set by the application.
        /// </summary>
        /// <value>A value indicating whether this instance is external URL.    Custom property set by the application.</value>
        [DataMember(Name="IsExternalUrl", EmitDefaultValue=false)]
        public bool? IsExternalUrl { get; set; }

        /// <summary>
        /// Gets or Sets IsTextSubtitleStream
        /// </summary>
        [DataMember(Name="IsTextSubtitleStream", EmitDefaultValue=false)]
        public bool? IsTextSubtitleStream { get; set; }

        /// <summary>
        /// A value indicating whether \\[supports external stream\\].
        /// </summary>
        /// <value>A value indicating whether \\[supports external stream\\].</value>
        [DataMember(Name="SupportsExternalStream", EmitDefaultValue=false)]
        public bool? SupportsExternalStream { get; set; }

        /// <summary>
        /// The filename.
        /// </summary>
        /// <value>The filename.</value>
        [DataMember(Name="Path", EmitDefaultValue=false)]
        public string Path { get; set; }

        /// <summary>
        /// Gets or Sets Protocol
        /// </summary>
        [DataMember(Name="Protocol", EmitDefaultValue=false)]
        public MediaProtocol Protocol { get; set; }

        /// <summary>
        /// The pixel format.    Probe Field: &#x60;pix_fmt&#x60;    Applies to: &#x60;MediaBrowser.Model.Entities.MediaStreamType.Video&#x60;.    Actual type: &#x60;MediaBrowser.Model.Entities.MediaStream.PixelFormat&#x60;.
        /// </summary>
        /// <value>The pixel format.    Probe Field: &#x60;pix_fmt&#x60;    Applies to: &#x60;MediaBrowser.Model.Entities.MediaStreamType.Video&#x60;.    Actual type: &#x60;MediaBrowser.Model.Entities.MediaStream.PixelFormat&#x60;.</value>
        [DataMember(Name="PixelFormat", EmitDefaultValue=false)]
        public string PixelFormat { get; set; }

        /// <summary>
        /// The codec level.    Probe Field: &#x60;level&#x60;    Applies to: &#x60;MediaBrowser.Model.Entities.MediaStreamType.Video&#x60;    Related Enums: &#x60;Emby.Media.Model.Enums.AvcLevels&#x60;, &#x60;Emby.Media.Model.Enums.H263Levels&#x60;, &#x60;Emby.Media.Model.Enums.HevcLevels&#x60;, &#x60;Emby.Media.Model.Enums.Mpeg2Levels&#x60;,&#x60;Emby.Media.Model.Enums.Vc1Levels&#x60;, &#x60;Emby.Media.Model.Enums.Mpeg4Levels&#x60;, &#x60;Emby.Media.Model.Enums.Vp8Levels&#x60;, &#x60;Emby.Media.Model.Enums.Vp9Levels&#x60;.
        /// </summary>
        /// <value>The codec level.    Probe Field: &#x60;level&#x60;    Applies to: &#x60;MediaBrowser.Model.Entities.MediaStreamType.Video&#x60;    Related Enums: &#x60;Emby.Media.Model.Enums.AvcLevels&#x60;, &#x60;Emby.Media.Model.Enums.H263Levels&#x60;, &#x60;Emby.Media.Model.Enums.HevcLevels&#x60;, &#x60;Emby.Media.Model.Enums.Mpeg2Levels&#x60;,&#x60;Emby.Media.Model.Enums.Vc1Levels&#x60;, &#x60;Emby.Media.Model.Enums.Mpeg4Levels&#x60;, &#x60;Emby.Media.Model.Enums.Vp8Levels&#x60;, &#x60;Emby.Media.Model.Enums.Vp9Levels&#x60;.</value>
        [DataMember(Name="Level", EmitDefaultValue=false)]
        public double? Level { get; set; }

        /// <summary>
        /// A value indicating whether this instance is anamorphic.
        /// </summary>
        /// <value>A value indicating whether this instance is anamorphic.</value>
        [DataMember(Name="IsAnamorphic", EmitDefaultValue=false)]
        public bool? IsAnamorphic { get; set; }

        /// <summary>
        /// Gets or Sets ExtendedVideoType
        /// </summary>
        [DataMember(Name="ExtendedVideoType", EmitDefaultValue=false)]
        public ExtendedVideoTypes ExtendedVideoType { get; set; }

        /// <summary>
        /// Gets or Sets ExtendedVideoSubType
        /// </summary>
        [DataMember(Name="ExtendedVideoSubType", EmitDefaultValue=false)]
        public ExtendedVideoSubTypes ExtendedVideoSubType { get; set; }

        /// <summary>
        /// The extended video sub\\-type description.
        /// </summary>
        /// <value>The extended video sub\\-type description.</value>
        [DataMember(Name="ExtendedVideoSubTypeDescription", EmitDefaultValue=false)]
        public string ExtendedVideoSubTypeDescription { get; set; }

        /// <summary>
        /// Used only by our Windows app. Not used by Emby Server.
        /// </summary>
        /// <value>Used only by our Windows app. Not used by Emby Server.</value>
        [DataMember(Name="ItemId", EmitDefaultValue=false)]
        public string ItemId { get; set; }

        /// <summary>
        /// Used only by our Windows app. Not used by Emby Server.
        /// </summary>
        /// <value>Used only by our Windows app. Not used by Emby Server.</value>
        [DataMember(Name="ServerId", EmitDefaultValue=false)]
        public string ServerId { get; set; }

        /// <summary>
        /// The size of the attachment.
        /// </summary>
        /// <value>The size of the attachment.</value>
        [DataMember(Name="AttachmentSize", EmitDefaultValue=false)]
        public int? AttachmentSize { get; set; }

        /// <summary>
        /// The type of the MIME.
        /// </summary>
        /// <value>The type of the MIME.</value>
        [DataMember(Name="MimeType", EmitDefaultValue=false)]
        public string MimeType { get; set; }

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
            sb.Append("  IsHearingImpaired: ").Append(IsHearingImpaired).Append("\n");
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
            sb.Append("  ExtendedVideoType: ").Append(ExtendedVideoType).Append("\n");
            sb.Append("  ExtendedVideoSubType: ").Append(ExtendedVideoSubType).Append("\n");
            sb.Append("  ExtendedVideoSubTypeDescription: ").Append(ExtendedVideoSubTypeDescription).Append("\n");
            sb.Append("  ItemId: ").Append(ItemId).Append("\n");
            sb.Append("  ServerId: ").Append(ServerId).Append("\n");
            sb.Append("  AttachmentSize: ").Append(AttachmentSize).Append("\n");
            sb.Append("  MimeType: ").Append(MimeType).Append("\n");
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
                    this.IsHearingImpaired == input.IsHearingImpaired ||
                    (this.IsHearingImpaired != null &&
                    this.IsHearingImpaired.Equals(input.IsHearingImpaired))
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
                    this.ExtendedVideoType == input.ExtendedVideoType ||
                    (this.ExtendedVideoType != null &&
                    this.ExtendedVideoType.Equals(input.ExtendedVideoType))
                ) && 
                (
                    this.ExtendedVideoSubType == input.ExtendedVideoSubType ||
                    (this.ExtendedVideoSubType != null &&
                    this.ExtendedVideoSubType.Equals(input.ExtendedVideoSubType))
                ) && 
                (
                    this.ExtendedVideoSubTypeDescription == input.ExtendedVideoSubTypeDescription ||
                    (this.ExtendedVideoSubTypeDescription != null &&
                    this.ExtendedVideoSubTypeDescription.Equals(input.ExtendedVideoSubTypeDescription))
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
                if (this.IsHearingImpaired != null)
                    hashCode = hashCode * 59 + this.IsHearingImpaired.GetHashCode();
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
                if (this.ExtendedVideoType != null)
                    hashCode = hashCode * 59 + this.ExtendedVideoType.GetHashCode();
                if (this.ExtendedVideoSubType != null)
                    hashCode = hashCode * 59 + this.ExtendedVideoSubType.GetHashCode();
                if (this.ExtendedVideoSubTypeDescription != null)
                    hashCode = hashCode * 59 + this.ExtendedVideoSubTypeDescription.GetHashCode();
                if (this.ItemId != null)
                    hashCode = hashCode * 59 + this.ItemId.GetHashCode();
                if (this.ServerId != null)
                    hashCode = hashCode * 59 + this.ServerId.GetHashCode();
                if (this.AttachmentSize != null)
                    hashCode = hashCode * 59 + this.AttachmentSize.GetHashCode();
                if (this.MimeType != null)
                    hashCode = hashCode * 59 + this.MimeType.GetHashCode();
                if (this.SubtitleLocationType != null)
                    hashCode = hashCode * 59 + this.SubtitleLocationType.GetHashCode();
                return hashCode;
            }
        }

    }
}
