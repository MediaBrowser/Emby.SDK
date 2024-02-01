/*
 * Emby Server REST API
 *
 * Explore the Emby Server API
 *
 */
package embyclient-rest-go

type VideoCodecBase struct {
	CodecDeviceInfo *CommonInterfacesICodecDeviceInfo `json:"CodecDeviceInfo,omitempty"`
	CodecKind *CodecKinds `json:"CodecKind,omitempty"`
	MediaTypeName string `json:"MediaTypeName,omitempty"`
	VideoMediaType *VideoMediaTypes `json:"VideoMediaType,omitempty"`
	MinWidth int32 `json:"MinWidth,omitempty"`
	MaxWidth int32 `json:"MaxWidth,omitempty"`
	MinHeight int32 `json:"MinHeight,omitempty"`
	MaxHeight int32 `json:"MaxHeight,omitempty"`
	WidthAlignment int32 `json:"WidthAlignment,omitempty"`
	HeightAlignment int32 `json:"HeightAlignment,omitempty"`
	MaxBitRate *BitRate `json:"MaxBitRate,omitempty"`
	SupportedColorFormats []ColorFormats `json:"SupportedColorFormats,omitempty"`
	SupportedColorFormatStrings []string `json:"SupportedColorFormatStrings,omitempty"`
	ProfileAndLevelInformation []ProfileLevelInformation `json:"ProfileAndLevelInformation,omitempty"`
	Id string `json:"Id,omitempty"`
	Direction *CodecDirections `json:"Direction,omitempty"`
	Name string `json:"Name,omitempty"`
	Description string `json:"Description,omitempty"`
	FrameworkCodec string `json:"FrameworkCodec,omitempty"`
	IsHardwareCodec bool `json:"IsHardwareCodec,omitempty"`
	SecondaryFramework *SecondaryFrameworks `json:"SecondaryFramework,omitempty"`
	SecondaryFrameworkCodec string `json:"SecondaryFrameworkCodec,omitempty"`
	MaxInstanceCount int32 `json:"MaxInstanceCount,omitempty"`
	IsEnabledByDefault bool `json:"IsEnabledByDefault,omitempty"`
	DefaultPriority int32 `json:"DefaultPriority,omitempty"`
}
