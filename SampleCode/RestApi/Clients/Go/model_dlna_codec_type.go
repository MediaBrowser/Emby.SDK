/*
 * Emby Server REST API (BETA)
 *
 * Explore the Emby Server API
 *
 * API version: 4.8.0.3
 */
package embyclient-rest-go

type DlnaCodecType string

// List of Dlna.CodecType
const (
	VIDEO_DlnaCodecType DlnaCodecType = "Video"
	VIDEO_AUDIO_DlnaCodecType DlnaCodecType = "VideoAudio"
	AUDIO_DlnaCodecType DlnaCodecType = "Audio"
)
