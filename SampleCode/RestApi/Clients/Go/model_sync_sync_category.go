/*
 * Emby Server REST API (BETA)
 *
 * Explore the Emby Server API
 *
 * API version: 4.8.0.5
 */
package embyclient-rest-go

type SyncSyncCategory string

// List of Sync.SyncCategory
const (
	LATEST_SyncSyncCategory SyncSyncCategory = "Latest"
	NEXT_UP_SyncSyncCategory SyncSyncCategory = "NextUp"
	RESUME_SyncSyncCategory SyncSyncCategory = "Resume"
)
