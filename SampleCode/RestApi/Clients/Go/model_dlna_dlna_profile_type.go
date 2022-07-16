/*
 * Emby Server REST API (BETA)
 *
 * Explore the Emby Server API
 *
 * API version: 4.8.0.5
 */
package embyclient-rest-go

type DlnaDlnaProfileType string

// List of Dlna.DlnaProfileType
const (
	AUDIO_DlnaDlnaProfileType DlnaDlnaProfileType = "Audio"
	VIDEO_DlnaDlnaProfileType DlnaDlnaProfileType = "Video"
	PHOTO_DlnaDlnaProfileType DlnaDlnaProfileType = "Photo"
)
