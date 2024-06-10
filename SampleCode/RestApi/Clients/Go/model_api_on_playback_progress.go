/*
 * Emby Server REST API (BETA)
 *
 * Explore the Emby Server API
 *
 */
package embyclient

type ApiOnPlaybackProgress struct {
	PlaylistIndex int32 `json:"PlaylistIndex,omitempty"`
	PlaylistLength int32 `json:"PlaylistLength,omitempty"`
	Shuffle bool `json:"Shuffle,omitempty"`
	EventName *ProgressEvent `json:"EventName,omitempty"`
}
