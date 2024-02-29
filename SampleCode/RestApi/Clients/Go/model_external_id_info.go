/*
 * Emby Server REST API
 *
 * Explore the Emby Server API
 *
 */
package embyclient-rest-go

type ExternalIdInfo struct {
	// The name.
	Name string `json:"Name,omitempty"`
	// The key.
	Key string `json:"Key,omitempty"`
	Website string `json:"Website,omitempty"`
	// The URL format string.
	UrlFormatString string `json:"UrlFormatString,omitempty"`
	IsSupportedAsIdentifier bool `json:"IsSupportedAsIdentifier,omitempty"`
}
