/*
 * Emby Server REST API
 *
 * Explore the Emby Server API
 *
 */
package embyclient-rest-go

type DlnaProfileType string

// List of DlnaProfileType
const (
	AUDIO_DlnaProfileType DlnaProfileType = "Audio"
	VIDEO_DlnaProfileType DlnaProfileType = "Video"
	PHOTO_DlnaProfileType DlnaProfileType = "Photo"
)
