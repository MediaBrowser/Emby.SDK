/*
 * Emby Server REST API (BETA)
 *
 * Explore the Emby Server API
 *
 * API version: 4.8.0.5
 */
package embyclient-rest-go

type SyncModelSyncDataRequest struct {
	LocalItemIds []string `json:"LocalItemIds,omitempty"`
	TargetId string `json:"TargetId,omitempty"`
}
