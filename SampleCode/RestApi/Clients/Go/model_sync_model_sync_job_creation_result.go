/*
 * Emby Server REST API (BETA)
 *
 * Explore the Emby Server API
 *
 */
package embyclient-rest-go

type SyncModelSyncJobCreationResult struct {
	Job *SyncSyncJob `json:"Job,omitempty"`
	JobItems []SyncModelSyncJobItem `json:"JobItems,omitempty"`
}
