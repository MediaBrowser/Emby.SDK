/*
 * Emby Server REST API
 *
 * Explore the Emby Server API
 *
 */
package embyclient-rest-go

type PlayMethod string

// List of PlayMethod
const (
	TRANSCODE_PlayMethod PlayMethod = "Transcode"
	DIRECT_STREAM_PlayMethod PlayMethod = "DirectStream"
	DIRECT_PLAY_PlayMethod PlayMethod = "DirectPlay"
)
