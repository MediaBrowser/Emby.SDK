/*
 * Emby Server REST API
 *
 * Explore the Emby Server API
 *
 */
package embyclient-rest-go

type PlaybackInfoResponse struct {
	// The media sources.
	MediaSources []MediaSourceInfo `json:"MediaSources,omitempty"`
	// The play session identifier.
	PlaySessionId string `json:"PlaySessionId,omitempty"`
	ErrorCode *PlaybackErrorCode `json:"ErrorCode,omitempty"`
}
