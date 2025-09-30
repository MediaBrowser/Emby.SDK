/*
 * Emby Server REST API (BETA)
 *
 * Explore the Emby Server API
 *
 */
package embyclient

type PlaybackErrorCode string

// List of PlaybackErrorCode
const (
	NOT_ALLOWED_PlaybackErrorCode PlaybackErrorCode = "NotAllowed"
	NO_COMPATIBLE_STREAM_PlaybackErrorCode PlaybackErrorCode = "NoCompatibleStream"
	RATE_LIMIT_EXCEEDED_PlaybackErrorCode PlaybackErrorCode = "RateLimitExceeded"
)
