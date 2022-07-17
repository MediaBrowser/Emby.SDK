/*
 * Emby Server REST API (BETA)
 *
 * Explore the Emby Server API
 *
 */
package embyclient-rest-go

type LiveTvApiSetChannelSortIndex struct {
	Id string `json:"Id,omitempty"`
	ManagementId string `json:"ManagementId,omitempty"`
	NewIndex int32 `json:"NewIndex,omitempty"`
}
