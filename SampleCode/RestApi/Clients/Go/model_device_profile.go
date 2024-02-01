/*
 * Emby Server REST API
 *
 * Explore the Emby Server API
 *
 */
package embyclient-rest-go

type DeviceProfile struct {
	// The name.
	Name string `json:"Name,omitempty"`
	Id string `json:"Id,omitempty"`
	SupportedMediaTypes string `json:"SupportedMediaTypes,omitempty"`
	MaxStreamingBitrate int64 `json:"MaxStreamingBitrate,omitempty"`
	MusicStreamingTranscodingBitrate int32 `json:"MusicStreamingTranscodingBitrate,omitempty"`
	MaxStaticMusicBitrate int32 `json:"MaxStaticMusicBitrate,omitempty"`
	// The direct play profiles.
	DirectPlayProfiles []DirectPlayProfile `json:"DirectPlayProfiles,omitempty"`
	// The transcoding profiles.
	TranscodingProfiles []TranscodingProfile `json:"TranscodingProfiles,omitempty"`
	ContainerProfiles []ContainerProfile `json:"ContainerProfiles,omitempty"`
	CodecProfiles []CodecProfile `json:"CodecProfiles,omitempty"`
	ResponseProfiles []ResponseProfile `json:"ResponseProfiles,omitempty"`
	SubtitleProfiles []SubtitleProfile `json:"SubtitleProfiles,omitempty"`
}
