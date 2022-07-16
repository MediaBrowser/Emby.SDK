/*
 * Emby Server REST API (BETA)
 *
 * Explore the Emby Server API
 *
 * API version: 4.8.0.6
 */
package embyclient-rest-go

type PlayMethod string

// List of PlayMethod
const (
	TRANSCODE_PlayMethod PlayMethod = "Transcode"
	DIRECT_STREAM_PlayMethod PlayMethod = "DirectStream"
	DIRECT_PLAY_PlayMethod PlayMethod = "DirectPlay"
)
