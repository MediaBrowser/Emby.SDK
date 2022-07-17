/*
 * Emby Server REST API (BETA)
 *
 * Explore the Emby Server API
 *
 */
package embyclient-rest-go

type SyncSyncCategory string

// List of Sync.SyncCategory
const (
	LATEST_SyncSyncCategory SyncSyncCategory = "Latest"
	NEXT_UP_SyncSyncCategory SyncSyncCategory = "NextUp"
	RESUME_SyncSyncCategory SyncSyncCategory = "Resume"
)
