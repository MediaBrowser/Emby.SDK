/*
 * Emby Server REST API
 *
 * Explore the Emby Server API
 *
 */
package embyclient

type QueryResultSessionPartyMessage struct {
	Items []SessionPartyMessage `json:"Items,omitempty"`
	TotalRecordCount int32 `json:"TotalRecordCount,omitempty"`
}
