/*
 * Emby Server REST API (BETA)
 *
 * Explore the Emby Server API
 *
 * API version: 4.8.0.6
 */
package embyclient-rest-go

type DlnaPlaybackErrorCode string

// List of Dlna.PlaybackErrorCode
const (
	NOT_ALLOWED_DlnaPlaybackErrorCode DlnaPlaybackErrorCode = "NotAllowed"
	NO_COMPATIBLE_STREAM_DlnaPlaybackErrorCode DlnaPlaybackErrorCode = "NoCompatibleStream"
	RATE_LIMIT_EXCEEDED_DlnaPlaybackErrorCode DlnaPlaybackErrorCode = "RateLimitExceeded"
)
