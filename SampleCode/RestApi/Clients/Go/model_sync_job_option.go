/*
 * Emby Server REST API
 *
 * Explore the Emby Server API
 *
 */
package embyclient-rest-go

type SyncJobOption string

// List of SyncJobOption
const (
	NAME_SyncJobOption SyncJobOption = "Name"
	QUALITY_SyncJobOption SyncJobOption = "Quality"
	UNWATCHED_ONLY_SyncJobOption SyncJobOption = "UnwatchedOnly"
	SYNC_NEW_CONTENT_SyncJobOption SyncJobOption = "SyncNewContent"
	ITEM_LIMIT_SyncJobOption SyncJobOption = "ItemLimit"
	PROFILE_SyncJobOption SyncJobOption = "Profile"
)
