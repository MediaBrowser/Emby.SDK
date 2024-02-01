/*
 * Emby Server REST API
 *
 * Explore the Emby Server API
 *
 */
package embyclient-rest-go

type SyncCategory string

// List of SyncCategory
const (
	LATEST_SyncCategory SyncCategory = "Latest"
	NEXT_UP_SyncCategory SyncCategory = "NextUp"
	RESUME_SyncCategory SyncCategory = "Resume"
)
