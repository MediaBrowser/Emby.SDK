/*
 * Emby Server REST API (BETA)
 *
 * Explore the Emby Server API
 *
 */
package embyclient

type ApiSetChannelSortIndex struct {
	Id string `json:"Id,omitempty"`
	ManagementId string `json:"ManagementId,omitempty"`
	NewIndex int32 `json:"NewIndex,omitempty"`
}
