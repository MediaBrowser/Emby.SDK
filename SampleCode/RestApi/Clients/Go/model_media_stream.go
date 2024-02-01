/*
 * Emby Server REST API
 *
 * Explore the Emby Server API
 *
 */
package embyclient-rest-go

// MediaStream information.      MediaStream itens are typically included in a `MediaBrowser.Model.Dto.MediaSourceInfo` object.      `MediaBrowser.Model.Dto.MediaSourceInfo.MediaStreams`  
type MediaStream struct {
	// The codec.    Probe Field: `codec_name`    Applies to: `MediaBrowser.Model.Entities.MediaStreamType.Video`, `MediaBrowser.Model.Entities.MediaStreamType.Audio`, `MediaBrowser.Model.Entities.MediaStreamType.Subtitle`    Related Enums: `T:Emby.Media.Model.Enums.VideoMediaTypes`, `Emby.Media.Model.Enums.AudioMediaTypes`, `Emby.Media.Model.Enums.SubtitleMediaTypes`.
	Codec string `json:"Codec,omitempty"`
	// The codec tag.    Probe Field: `codec_tag`    Applies to: `MediaBrowser.Model.Entities.MediaStreamType.Video`, `MediaBrowser.Model.Entities.MediaStreamType.Audio`, `MediaBrowser.Model.Entities.MediaStreamType.Subtitle`.
	CodecTag string `json:"CodecTag,omitempty"`
	// The language.    Probe Field: `tags[\"language\"]`    Applies to: `MediaBrowser.Model.Entities.MediaStreamType.Audio`, `MediaBrowser.Model.Entities.MediaStreamType.Subtitle`.
	Language string `json:"Language,omitempty"`
	// The color transfer characteristics.    Probe Field: `color_transfer`    Applies to: `MediaBrowser.Model.Entities.MediaStreamType.Video`    Related Enum: `Emby.Media.Model.Enums.ColorTransfers`.
	ColorTransfer string `json:"ColorTransfer,omitempty"`
	// The chromaticity coordinates of the source primaries.    Probe Field: `color_primaries`    Applies to: `MediaBrowser.Model.Entities.MediaStreamType.Video`    Related Enum: `Emby.Media.Model.Enums.ColorPrimaries`.
	ColorPrimaries string `json:"ColorPrimaries,omitempty"`
	// The YUV colorspace type.    Probe Field: `color_space`    Applies to: `MediaBrowser.Model.Entities.MediaStreamType.Video`    Related Enum: `Emby.Media.Model.Enums.ColorSpaces`.
	ColorSpace string `json:"ColorSpace,omitempty"`
	// The comment.    Probe Field: `tags[\"comment\"]`    Applies to: `MediaBrowser.Model.Entities.MediaStreamType.Video`, `MediaBrowser.Model.Entities.MediaStreamType.Audio`, `MediaBrowser.Model.Entities.MediaStreamType.Subtitle`.
	Comment string `json:"Comment,omitempty"`
	// The start time of the stream.    Probe Field: `start_time`    Applies to: `MediaBrowser.Model.Entities.MediaStreamType.Video`, `MediaBrowser.Model.Entities.MediaStreamType.Audio`, `MediaBrowser.Model.Entities.MediaStreamType.Subtitle`.    Actual type: `System.TimeSpan`.
	StreamStartTimeTicks int64 `json:"StreamStartTimeTicks,omitempty"`
	// The time\\-base.    Probe Field: `time_base`    Applies to: `MediaBrowser.Model.Entities.MediaStreamType.Video`, `MediaBrowser.Model.Entities.MediaStreamType.Audio`, `MediaBrowser.Model.Entities.MediaStreamType.Subtitle`.    Actual type: `Emby.Media.Model.Types.Rational`.
	TimeBase string `json:"TimeBase,omitempty"`
	// The title.    Probe Field: `tags[\"title\"]`    Applies to: `MediaBrowser.Model.Entities.MediaStreamType.Video`, `MediaBrowser.Model.Entities.MediaStreamType.Audio`, `MediaBrowser.Model.Entities.MediaStreamType.Subtitle`.
	Title string `json:"Title,omitempty"`
	// The extradata.    Probe Field: `extradata`    Applies to: `MediaBrowser.Model.Entities.MediaStreamType.Video`, `MediaBrowser.Model.Entities.MediaStreamType.Audio`, `MediaBrowser.Model.Entities.MediaStreamType.Subtitle`.    Currently, this value is only parsed for subtitle streams with codec `Emby.Media.Model.Enums.SubtitleMediaTypes.dvb_teletext`.
	Extradata string `json:"Extradata,omitempty"`
	VideoRange string `json:"VideoRange,omitempty"`
	// The display title.    Custom property set by the application.
	DisplayTitle string `json:"DisplayTitle,omitempty"`
	// The display language.    Custom property set by the application.
	DisplayLanguage string `json:"DisplayLanguage,omitempty"`
	// The nal length size.    Probe Field: `nal_length_size`    Applies to: `MediaBrowser.Model.Entities.MediaStreamType.Video` of type `Emby.Media.Model.Enums.VideoMediaTypes.h264`.    Actual type: `System.Int32`.
	NalLengthSize string `json:"NalLengthSize,omitempty"`
	// A value indicating whether this instance is interlaced.    Probe Field: `field_order` \\!\\= `progressive`    Applies to: `MediaBrowser.Model.Entities.MediaStreamType.Video`.
	IsInterlaced bool `json:"IsInterlaced,omitempty"`
	IsAVC bool `json:"IsAVC,omitempty"`
	// The channel layout.    Probe Field: `channel_layout`    Applies to: `MediaBrowser.Model.Entities.MediaStreamType.Audio`    Related Enum: `MediaBrowser.Model.Entities.MediaStream.ChannelLayout`.
	ChannelLayout string `json:"ChannelLayout,omitempty"`
	// The bit rate.    Probe Field: `bit_rate`    Applies to: `MediaBrowser.Model.Entities.MediaStreamType.Video`, `MediaBrowser.Model.Entities.MediaStreamType.Audio`.    THIS VALUE IS PROCESSED BY CUSTOM LOGIC AND DOES NOT NECESSARILY MATCH FFPROBE RESULTS\\!
	BitRate int32 `json:"BitRate,omitempty"`
	// The bit depth.    Probe Field: `bits_per_sample` or `bits_per_raw_sample`    Applies to: `MediaBrowser.Model.Entities.MediaStreamType.Video`, `MediaBrowser.Model.Entities.MediaStreamType.Audio`.
	BitDepth int32 `json:"BitDepth,omitempty"`
	// The reference frames.    Probe Field: `refs`    Applies to: `MediaBrowser.Model.Entities.MediaStreamType.Video`.
	RefFrames int32 `json:"RefFrames,omitempty"`
	Rotation int32 `json:"Rotation,omitempty"`
	// The audio channel count.    Probe Field: `channels`    Applies to: `MediaBrowser.Model.Entities.MediaStreamType.Audio`.
	Channels int32 `json:"Channels,omitempty"`
	// The sample rate.    Probe Field: `sample_rate`    Applies to: `MediaBrowser.Model.Entities.MediaStreamType.Audio`    Related Enum: `Emby.Media.Model.Enums.SampleRates`.
	SampleRate int32 `json:"SampleRate,omitempty"`
	// A value indicating whether this instance is default.    Probe Field: `disposition[\"default\"]`    Applies to: `MediaBrowser.Model.Entities.MediaStreamType.Video`, `MediaBrowser.Model.Entities.MediaStreamType.Audio`, `MediaBrowser.Model.Entities.MediaStreamType.Subtitle`.
	IsDefault bool `json:"IsDefault,omitempty"`
	// A value indicating whether this instance is forced.    Probe Field: `disposition[\"forced\"]`    Applies to: `MediaBrowser.Model.Entities.MediaStreamType.Video`, `MediaBrowser.Model.Entities.MediaStreamType.Audio`, `MediaBrowser.Model.Entities.MediaStreamType.Subtitle`.
	IsForced bool `json:"IsForced,omitempty"`
	IsHearingImpaired bool `json:"IsHearingImpaired,omitempty"`
	// The height.    Probe Field: `height`    Applies to: `MediaBrowser.Model.Entities.MediaStreamType.Video`.
	Height int32 `json:"Height,omitempty"`
	// The width.    Probe Field: `width`    Applies to: `MediaBrowser.Model.Entities.MediaStreamType.Video`.
	Width int32 `json:"Width,omitempty"`
	// The average frame rate..    Probe Field: `avg_frame_rate`    Applies to: `MediaBrowser.Model.Entities.MediaStreamType.Video`.    Actual type: `Emby.Media.Model.Types.Rational`.
	AverageFrameRate float32 `json:"AverageFrameRate,omitempty"`
	// The real frame rate..    Probe Field: `r_frame_rate`    Applies to: `MediaBrowser.Model.Entities.MediaStreamType.Video`.    Actual type: `Emby.Media.Model.Types.Rational`.
	RealFrameRate float32 `json:"RealFrameRate,omitempty"`
	// The profile.    Probe Field: `profile`    Applies to: `MediaBrowser.Model.Entities.MediaStreamType.Video`, `MediaBrowser.Model.Entities.MediaStreamType.Audio`    Related Enums: `Emby.Media.Model.Enums.AacProfiles`, `Emby.Media.Model.Enums.AvcProfiles`, `Emby.Media.Model.Enums.H263Profiles`, `Emby.Media.Model.Enums.HevcProfiles`, `Emby.Media.Model.Enums.Mpeg2Profiles`,`Emby.Media.Model.Enums.Vc1Profiles`, `Emby.Media.Model.Enums.Mpeg4Profiles`, `Emby.Media.Model.Enums.Vp8Profiles`, `Emby.Media.Model.Enums.Vp9Profiles`.
	Profile string `json:"Profile,omitempty"`
	Type_ *MediaStreamType `json:"Type,omitempty"`
	// The aspect ratio.    Probe Field: `display_aspect_ratio`    Applies to: `MediaBrowser.Model.Entities.MediaStreamType.Video`.    Actual type: `Emby.Media.Model.Types.Rational`.
	AspectRatio string `json:"AspectRatio,omitempty"`
	// The index of the stream inside its container.    Probe Field: `index`    Applies to: `MediaBrowser.Model.Entities.MediaStreamType.Video`, `MediaBrowser.Model.Entities.MediaStreamType.Audio`, `MediaBrowser.Model.Entities.MediaStreamType.Subtitle`.
	Index int32 `json:"Index,omitempty"`
	// A value indicating whether this instance is external.    Custom property set by the application.
	IsExternal bool `json:"IsExternal,omitempty"`
	DeliveryMethod *SubtitleDeliveryMethod `json:"DeliveryMethod,omitempty"`
	// The delivery URL.    Custom property set by the application.
	DeliveryUrl string `json:"DeliveryUrl,omitempty"`
	// A value indicating whether this instance is external URL.    Custom property set by the application.
	IsExternalUrl bool `json:"IsExternalUrl,omitempty"`
	IsTextSubtitleStream bool `json:"IsTextSubtitleStream,omitempty"`
	// A value indicating whether \\[supports external stream\\].
	SupportsExternalStream bool `json:"SupportsExternalStream,omitempty"`
	// The filename.
	Path string `json:"Path,omitempty"`
	Protocol *MediaProtocol `json:"Protocol,omitempty"`
	// The pixel format.    Probe Field: `pix_fmt`    Applies to: `MediaBrowser.Model.Entities.MediaStreamType.Video`.    Actual type: `MediaBrowser.Model.Entities.MediaStream.PixelFormat`.
	PixelFormat string `json:"PixelFormat,omitempty"`
	// The codec level.    Probe Field: `level`    Applies to: `MediaBrowser.Model.Entities.MediaStreamType.Video`    Related Enums: `Emby.Media.Model.Enums.AvcLevels`, `Emby.Media.Model.Enums.H263Levels`, `Emby.Media.Model.Enums.HevcLevels`, `Emby.Media.Model.Enums.Mpeg2Levels`,`Emby.Media.Model.Enums.Vc1Levels`, `Emby.Media.Model.Enums.Mpeg4Levels`, `Emby.Media.Model.Enums.Vp8Levels`, `Emby.Media.Model.Enums.Vp9Levels`.
	Level float64 `json:"Level,omitempty"`
	// A value indicating whether this instance is anamorphic.
	IsAnamorphic bool `json:"IsAnamorphic,omitempty"`
	ExtendedVideoType *ExtendedVideoTypes `json:"ExtendedVideoType,omitempty"`
	ExtendedVideoSubType *ExtendedVideoSubTypes `json:"ExtendedVideoSubType,omitempty"`
	// The extended video sub\\-type description.
	ExtendedVideoSubTypeDescription string `json:"ExtendedVideoSubTypeDescription,omitempty"`
	// Used only by our Windows app. Not used by Emby Server.
	ItemId string `json:"ItemId,omitempty"`
	// Used only by our Windows app. Not used by Emby Server.
	ServerId string `json:"ServerId,omitempty"`
	// The size of the attachment.
	AttachmentSize int32 `json:"AttachmentSize,omitempty"`
	// The type of the MIME.
	MimeType string `json:"MimeType,omitempty"`
	SubtitleLocationType *SubtitleLocationType `json:"SubtitleLocationType,omitempty"`
}
