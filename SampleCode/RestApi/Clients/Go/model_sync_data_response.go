/*
 * Emby Server REST API
 *
 * Explore the Emby Server API
 *
 */
package embyclient-rest-go

type SyncDataResponse struct {
	ItemIdsToRemove []string `json:"ItemIdsToRemove,omitempty"`
}
