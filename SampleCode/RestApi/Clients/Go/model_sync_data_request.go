/*
 * Emby Server REST API (BETA)
 *
 * Explore the Emby Server API
 *
 */
package embyclient-rest-go

type SyncDataRequest struct {
	LocalItemIds []string `json:"LocalItemIds,omitempty"`
	TargetId string `json:"TargetId,omitempty"`
}
