/*
 * Emby Server REST API (BETA)
 *
 * Explore the Emby Server API
 *
 * API version: 4.8.0.5
 */
package embyclient-rest-go

type SyncModelItemFileType string

// List of Sync.Model.ItemFileType
const (
	MEDIA_SyncModelItemFileType SyncModelItemFileType = "Media"
	IMAGE_SyncModelItemFileType SyncModelItemFileType = "Image"
	SUBTITLES_SyncModelItemFileType SyncModelItemFileType = "Subtitles"
)
