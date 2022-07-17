/*
 * Emby REST API
 *
 * Explore the Emby Server API
 *
 */
package embyclient-rest-go

type SyncModelSyncedItemProgress struct {
	Progress float64 `json:"Progress,omitempty"`
	Status *SyncModelSyncJobItemStatus `json:"Status,omitempty"`
}
