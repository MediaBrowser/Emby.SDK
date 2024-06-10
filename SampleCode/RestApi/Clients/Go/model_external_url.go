/*
 * Emby Server REST API (BETA)
 *
 * Explore the Emby Server API
 *
 */
package embyclient

type ExternalUrl struct {
	// The name.
	Name string `json:"Name,omitempty"`
	// The type of the item.
	Url string `json:"Url,omitempty"`
}
