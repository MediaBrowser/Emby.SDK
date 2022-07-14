/*
 * Emby Server REST API (BETA)
 *
 * Explore the Emby Server API
 *
 * API version: 4.8.0.3
 */
package embyclient-rest-go

type SyncModelSyncJobCreationResult struct {
	Job *SyncSyncJob `json:"Job,omitempty"`
	JobItems []SyncModelSyncJobItem `json:"JobItems,omitempty"`
}
