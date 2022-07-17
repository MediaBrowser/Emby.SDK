/*
 * Emby Server REST API (BETA)
 *
 * Explore the Emby Server API
 *
 */
package embyclient-rest-go

type EmbyDlnaProfilesProtocolInfoDetection struct {
	EnabledForVideo bool `json:"EnabledForVideo,omitempty"`
	EnabledForAudio bool `json:"EnabledForAudio,omitempty"`
	EnabledForPhotos bool `json:"EnabledForPhotos,omitempty"`
}
