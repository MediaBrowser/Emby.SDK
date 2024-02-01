/*
 * Emby Server REST API
 *
 * Explore the Emby Server API
 *
 */
package embyclient-rest-go

type CodecType string

// List of CodecType
const (
	VIDEO_CodecType CodecType = "Video"
	VIDEO_AUDIO_CodecType CodecType = "VideoAudio"
	AUDIO_CodecType CodecType = "Audio"
)
