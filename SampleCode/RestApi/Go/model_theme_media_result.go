/*
 * Emby Server REST API (BETA)
 *
 * Explore the Emby Server API
 *
 */
package embyclient

// Class ThemeMediaResult  
type ThemeMediaResult struct {
	// The owner id.
	OwnerId int64 `json:"OwnerId,omitempty"`
	Items []BaseItemDto `json:"Items,omitempty"`
	TotalRecordCount int32 `json:"TotalRecordCount,omitempty"`
}
