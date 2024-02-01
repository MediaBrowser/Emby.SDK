/*
 * Emby Server REST API
 *
 * Explore the Emby Server API
 *
 */
package embyclient-rest-go

type DlnaProfilesProtocolInfoDetection struct {
	EnabledForVideo bool `json:"EnabledForVideo,omitempty"`
	EnabledForAudio bool `json:"EnabledForAudio,omitempty"`
	EnabledForPhotos bool `json:"EnabledForPhotos,omitempty"`
}
