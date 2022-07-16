/*
 * Emby Server REST API (BETA)
 *
 * Explore the Emby Server API
 *
 * API version: 4.8.0.5
 */
package embyclient-rest-go

type MediaEncodingApiOnPlaybackProgress struct {
	PlaylistIndex int32 `json:"PlaylistIndex,omitempty"`
	PlaylistLength int32 `json:"PlaylistLength,omitempty"`
	EventName *ProgressEvent `json:"EventName,omitempty"`
}
