/*
 * Emby Server REST API (BETA)
 *
 * Explore the Emby Server API
 *
 */
package embyclient-rest-go

type MediaStream struct {
	Codec string `json:"Codec,omitempty"`
	CodecTag string `json:"CodecTag,omitempty"`
	Language string `json:"Language,omitempty"`
	ColorTransfer string `json:"ColorTransfer,omitempty"`
	ColorPrimaries string `json:"ColorPrimaries,omitempty"`
	ColorSpace string `json:"ColorSpace,omitempty"`
	Comment string `json:"Comment,omitempty"`
	StreamStartTimeTicks int64 `json:"StreamStartTimeTicks,omitempty"`
	TimeBase string `json:"TimeBase,omitempty"`
	Title string `json:"Title,omitempty"`
	Extradata string `json:"Extradata,omitempty"`
	VideoRange string `json:"VideoRange,omitempty"`
	DisplayTitle string `json:"DisplayTitle,omitempty"`
	DisplayLanguage string `json:"DisplayLanguage,omitempty"`
	NalLengthSize string `json:"NalLengthSize,omitempty"`
	IsInterlaced bool `json:"IsInterlaced,omitempty"`
	IsAVC bool `json:"IsAVC,omitempty"`
	ChannelLayout string `json:"ChannelLayout,omitempty"`
	BitRate int32 `json:"BitRate,omitempty"`
	BitDepth int32 `json:"BitDepth,omitempty"`
	RefFrames int32 `json:"RefFrames,omitempty"`
	Rotation int32 `json:"Rotation,omitempty"`
	Channels int32 `json:"Channels,omitempty"`
	SampleRate int32 `json:"SampleRate,omitempty"`
	IsDefault bool `json:"IsDefault,omitempty"`
	IsForced bool `json:"IsForced,omitempty"`
	IsHearingImpaired bool `json:"IsHearingImpaired,omitempty"`
	Height int32 `json:"Height,omitempty"`
	Width int32 `json:"Width,omitempty"`
	AverageFrameRate float32 `json:"AverageFrameRate,omitempty"`
	RealFrameRate float32 `json:"RealFrameRate,omitempty"`
	Profile string `json:"Profile,omitempty"`
	Type_ *MediaStreamType `json:"Type,omitempty"`
	AspectRatio string `json:"AspectRatio,omitempty"`
	Index int32 `json:"Index,omitempty"`
	IsExternal bool `json:"IsExternal,omitempty"`
	DeliveryMethod *DlnaSubtitleDeliveryMethod `json:"DeliveryMethod,omitempty"`
	DeliveryUrl string `json:"DeliveryUrl,omitempty"`
	IsExternalUrl bool `json:"IsExternalUrl,omitempty"`
	IsTextSubtitleStream bool `json:"IsTextSubtitleStream,omitempty"`
	SupportsExternalStream bool `json:"SupportsExternalStream,omitempty"`
	Path string `json:"Path,omitempty"`
	Protocol *MediaInfoMediaProtocol `json:"Protocol,omitempty"`
	PixelFormat string `json:"PixelFormat,omitempty"`
	Level float64 `json:"Level,omitempty"`
	IsAnamorphic bool `json:"IsAnamorphic,omitempty"`
	ExtendedVideoType *ExtendedVideoTypes `json:"ExtendedVideoType,omitempty"`
	ExtendedVideoSubType *ExtendedVideoSubTypes `json:"ExtendedVideoSubType,omitempty"`
	ExtendedVideoSubTypeDescription string `json:"ExtendedVideoSubTypeDescription,omitempty"`
	ItemId string `json:"ItemId,omitempty"`
	ServerId string `json:"ServerId,omitempty"`
	AttachmentSize int32 `json:"AttachmentSize,omitempty"`
	MimeType string `json:"MimeType,omitempty"`
	SubtitleLocationType *SubtitleLocationType `json:"SubtitleLocationType,omitempty"`
}
