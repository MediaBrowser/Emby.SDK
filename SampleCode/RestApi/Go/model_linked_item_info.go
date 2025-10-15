/*
 * Emby Server REST API (BETA)
 *
 * Explore the Emby Server API
 *
 */
package embyclient

type LinkedItemInfo struct {
	ProviderIds *map[string]string `json:"ProviderIds,omitempty"`
	// The name.
	Name string `json:"Name,omitempty"`
	// The identifier.
	Id int64 `json:"Id,omitempty"`
}
