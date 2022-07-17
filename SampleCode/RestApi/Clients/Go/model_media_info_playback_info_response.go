/*
 * Emby REST API
 *
 * Explore the Emby Server API
 *
 */
package embyclient-rest-go

type MediaInfoPlaybackInfoResponse struct {
	MediaSources []MediaSourceInfo `json:"MediaSources,omitempty"`
	PlaySessionId string `json:"PlaySessionId,omitempty"`
	ErrorCode *DlnaPlaybackErrorCode `json:"ErrorCode,omitempty"`
}
