/*
 * Emby Server REST API (BETA)
 *
 * Explore the Emby Server API
 *
 * API version: 4.8.0.6
 */
package embyclient-rest-go

type MediaInfoPlaybackInfoResponse struct {
	MediaSources []MediaSourceInfo `json:"MediaSources,omitempty"`
	PlaySessionId string `json:"PlaySessionId,omitempty"`
	ErrorCode *DlnaPlaybackErrorCode `json:"ErrorCode,omitempty"`
}
