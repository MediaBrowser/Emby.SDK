/*
 * Emby REST API
 *
 * Explore the Emby Server API
 *
 */
package embyclient-rest-go

type ExternalIdInfo struct {
	Name string `json:"Name,omitempty"`
	Key string `json:"Key,omitempty"`
	UrlFormatString string `json:"UrlFormatString,omitempty"`
	IsSupportedAsIdentifier bool `json:"IsSupportedAsIdentifier,omitempty"`
}
