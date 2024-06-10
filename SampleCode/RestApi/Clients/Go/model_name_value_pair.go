/*
 * Emby Server REST API (BETA)
 *
 * Explore the Emby Server API
 *
 */
package embyclient

type NameValuePair struct {
	// The name.
	Name string `json:"Name,omitempty"`
	// The value.
	Value string `json:"Value,omitempty"`
}
