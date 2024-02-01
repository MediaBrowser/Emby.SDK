/*
 * Emby Server REST API
 *
 * Explore the Emby Server API
 *
 */
package embyclient-rest-go

type ItemFileType string

// List of ItemFileType
const (
	MEDIA_ItemFileType ItemFileType = "Media"
	IMAGE_ItemFileType ItemFileType = "Image"
	SUBTITLES_ItemFileType ItemFileType = "Subtitles"
)
