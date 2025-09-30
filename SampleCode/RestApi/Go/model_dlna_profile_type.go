/*
 * Emby Server REST API (BETA)
 *
 * Explore the Emby Server API
 *
 */
package embyclient

type DlnaProfileType string

// List of DlnaProfileType
const (
	AUDIO_DlnaProfileType DlnaProfileType = "Audio"
	VIDEO_DlnaProfileType DlnaProfileType = "Video"
	PHOTO_DlnaProfileType DlnaProfileType = "Photo"
)
