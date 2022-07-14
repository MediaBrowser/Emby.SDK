/*
 * Emby Server REST API (BETA)
 *
 * Explore the Emby Server API
 *
 * API version: 4.8.0.3
 */
package embyclient-rest-go

type EmbyDlnaProfilesProtocolInfoDetection struct {
	EnabledForVideo bool `json:"EnabledForVideo,omitempty"`
	EnabledForAudio bool `json:"EnabledForAudio,omitempty"`
	EnabledForPhotos bool `json:"EnabledForPhotos,omitempty"`
}
