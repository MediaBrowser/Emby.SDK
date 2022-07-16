/*
 * Emby Server REST API (BETA)
 *
 * Explore the Emby Server API
 *
 * API version: 4.8.0.5
 */
package embyclient-rest-go

type ExternalIdInfo struct {
	Name string `json:"Name,omitempty"`
	Key string `json:"Key,omitempty"`
	UrlFormatString string `json:"UrlFormatString,omitempty"`
	IsSupportedAsIdentifier bool `json:"IsSupportedAsIdentifier,omitempty"`
}
