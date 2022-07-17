/*
 * Emby REST API
 *
 * Explore the Emby Server API
 *
 */
package embyclient-rest-go

type SyncModelSyncDataRequest struct {
	LocalItemIds []string `json:"LocalItemIds,omitempty"`
	TargetId string `json:"TargetId,omitempty"`
}
