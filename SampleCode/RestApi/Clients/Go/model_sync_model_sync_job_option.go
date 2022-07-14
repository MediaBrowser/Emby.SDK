/*
 * Emby Server REST API (BETA)
 *
 * Explore the Emby Server API
 *
 * API version: 4.8.0.3
 */
package embyclient-rest-go

type SyncModelSyncJobOption string

// List of Sync.Model.SyncJobOption
const (
	NAME_SyncModelSyncJobOption SyncModelSyncJobOption = "Name"
	QUALITY_SyncModelSyncJobOption SyncModelSyncJobOption = "Quality"
	UNWATCHED_ONLY_SyncModelSyncJobOption SyncModelSyncJobOption = "UnwatchedOnly"
	SYNC_NEW_CONTENT_SyncModelSyncJobOption SyncModelSyncJobOption = "SyncNewContent"
	ITEM_LIMIT_SyncModelSyncJobOption SyncModelSyncJobOption = "ItemLimit"
	PROFILE_SyncModelSyncJobOption SyncModelSyncJobOption = "Profile"
)
