/*
 * Emby Server REST API
 *
 * Explore the Emby Server API
 *
 */
package embyclient-rest-go

type DlnaProfilesDlnaProfile struct {
	Type_ *DlnaProfilesDeviceProfileType `json:"Type,omitempty"`
	Path string `json:"Path,omitempty"`
	UserId string `json:"UserId,omitempty"`
	AlbumArtPn string `json:"AlbumArtPn,omitempty"`
	MaxAlbumArtWidth int32 `json:"MaxAlbumArtWidth,omitempty"`
	MaxAlbumArtHeight int32 `json:"MaxAlbumArtHeight,omitempty"`
	MaxIconWidth int32 `json:"MaxIconWidth,omitempty"`
	MaxIconHeight int32 `json:"MaxIconHeight,omitempty"`
	FriendlyName string `json:"FriendlyName,omitempty"`
	Manufacturer string `json:"Manufacturer,omitempty"`
	ManufacturerUrl string `json:"ManufacturerUrl,omitempty"`
	ModelName string `json:"ModelName,omitempty"`
	ModelDescription string `json:"ModelDescription,omitempty"`
	ModelNumber string `json:"ModelNumber,omitempty"`
	ModelUrl string `json:"ModelUrl,omitempty"`
	SerialNumber string `json:"SerialNumber,omitempty"`
	EnableAlbumArtInDidl bool `json:"EnableAlbumArtInDidl,omitempty"`
	EnableSingleAlbumArtLimit bool `json:"EnableSingleAlbumArtLimit,omitempty"`
	EnableSingleSubtitleLimit bool `json:"EnableSingleSubtitleLimit,omitempty"`
	ProtocolInfo string `json:"ProtocolInfo,omitempty"`
	TimelineOffsetSeconds int32 `json:"TimelineOffsetSeconds,omitempty"`
	RequiresPlainVideoItems bool `json:"RequiresPlainVideoItems,omitempty"`
	RequiresPlainFolders bool `json:"RequiresPlainFolders,omitempty"`
	IgnoreTranscodeByteRangeRequests bool `json:"IgnoreTranscodeByteRangeRequests,omitempty"`
	SupportsSamsungBookmark bool `json:"SupportsSamsungBookmark,omitempty"`
	Identification *DlnaProfilesDeviceIdentification `json:"Identification,omitempty"`
	ProtocolInfoDetection *DlnaProfilesProtocolInfoDetection `json:"ProtocolInfoDetection,omitempty"`
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
