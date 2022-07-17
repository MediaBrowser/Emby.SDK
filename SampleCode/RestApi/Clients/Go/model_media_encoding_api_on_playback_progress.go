/*
 * Emby REST API
 *
 * Explore the Emby Server API
 *
 */
package embyclient-rest-go

type MediaEncodingApiOnPlaybackProgress struct {
	PlaylistIndex int32 `json:"PlaylistIndex,omitempty"`
	PlaylistLength int32 `json:"PlaylistLength,omitempty"`
	EventName *ProgressEvent `json:"EventName,omitempty"`
}
