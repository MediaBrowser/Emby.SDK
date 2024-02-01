/*
 * Emby Server REST API
 *
 * Explore the Emby Server API
 *
 */
package embyclient-rest-go
// MediaStreamType : Enum MediaStreamType  
type MediaStreamType string

// List of MediaStreamType
const (
	UNKNOWN_MediaStreamType MediaStreamType = "Unknown"
	AUDIO_MediaStreamType MediaStreamType = "Audio"
	VIDEO_MediaStreamType MediaStreamType = "Video"
	SUBTITLE_MediaStreamType MediaStreamType = "Subtitle"
	EMBEDDED_IMAGE_MediaStreamType MediaStreamType = "EmbeddedImage"
	ATTACHMENT_MediaStreamType MediaStreamType = "Attachment"
	DATA_MediaStreamType MediaStreamType = "Data"
)
