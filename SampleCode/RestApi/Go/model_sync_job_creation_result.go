/*
 * Emby Server REST API (BETA)
 *
 * Explore the Emby Server API
 *
 */
package embyclient

type SyncJobCreationResult struct {
	Job *SyncJob `json:"Job,omitempty"`
	JobItems []SyncJobItem `json:"JobItems,omitempty"`
}
