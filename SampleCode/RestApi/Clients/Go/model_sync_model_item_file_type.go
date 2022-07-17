/*
 * Emby Server REST API (BETA)
 *
 * Explore the Emby Server API
 *
 */
package embyclient-rest-go

type SyncModelItemFileType string

// List of Sync.Model.ItemFileType
const (
	MEDIA_SyncModelItemFileType SyncModelItemFileType = "Media"
	IMAGE_SyncModelItemFileType SyncModelItemFileType = "Image"
	SUBTITLES_SyncModelItemFileType SyncModelItemFileType = "Subtitles"
)
