/*
 * Emby Server REST API (BETA)
 *
 * Explore the Emby Server API
 *
 * API version: 4.8.0.5
 */
package embyclient-rest-go

type EmbyDlnaProfilesDlnaProfile struct {
	Type_ *EmbyDlnaProfilesDeviceProfileType `json:"Type,omitempty"`
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
	Identification *EmbyDlnaProfilesDeviceIdentification `json:"Identification,omitempty"`
	ProtocolInfoDetection *EmbyDlnaProfilesProtocolInfoDetection `json:"ProtocolInfoDetection,omitempty"`
	Name string `json:"Name,omitempty"`
	Id string `json:"Id,omitempty"`
	SupportedMediaTypes string `json:"SupportedMediaTypes,omitempty"`
	MaxStreamingBitrate int64 `json:"MaxStreamingBitrate,omitempty"`
	MusicStreamingTranscodingBitrate int32 `json:"MusicStreamingTranscodingBitrate,omitempty"`
	MaxStaticMusicBitrate int32 `json:"MaxStaticMusicBitrate,omitempty"`
	DirectPlayProfiles []DlnaDirectPlayProfile `json:"DirectPlayProfiles,omitempty"`
	TranscodingProfiles []DlnaTranscodingProfile `json:"TranscodingProfiles,omitempty"`
	ContainerProfiles []DlnaContainerProfile `json:"ContainerProfiles,omitempty"`
	CodecProfiles []DlnaCodecProfile `json:"CodecProfiles,omitempty"`
	ResponseProfiles []DlnaResponseProfile `json:"ResponseProfiles,omitempty"`
	SubtitleProfiles []DlnaSubtitleProfile `json:"SubtitleProfiles,omitempty"`
}
