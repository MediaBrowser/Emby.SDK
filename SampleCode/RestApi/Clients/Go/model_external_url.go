/*
 * Emby Server REST API
 *
 * Explore the Emby Server API
 *
 */
package embyclient-rest-go

type ExternalUrl struct {
	// The name.
	Name string `json:"Name,omitempty"`
	// The type of the item.
	Url string `json:"Url,omitempty"`
}
