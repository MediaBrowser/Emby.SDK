/*
 * Emby Server REST API
 *
 * Explore the Emby Server API
 *
 */
package embyclient-rest-go

type ApiListingProviderTypeInfo struct {
	Name string `json:"Name,omitempty"`
	Id string `json:"Id,omitempty"`
	SetupUrl string `json:"SetupUrl,omitempty"`
}
