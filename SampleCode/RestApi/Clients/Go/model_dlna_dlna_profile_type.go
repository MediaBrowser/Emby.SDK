/*
 * Emby REST API
 *
 * Explore the Emby Server API
 *
 */
package embyclient-rest-go

type DlnaDlnaProfileType string

// List of Dlna.DlnaProfileType
const (
	AUDIO_DlnaDlnaProfileType DlnaDlnaProfileType = "Audio"
	VIDEO_DlnaDlnaProfileType DlnaDlnaProfileType = "Video"
	PHOTO_DlnaDlnaProfileType DlnaDlnaProfileType = "Photo"
)
