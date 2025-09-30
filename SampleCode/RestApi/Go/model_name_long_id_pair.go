/*
 * Emby Server REST API (BETA)
 *
 * Explore the Emby Server API
 *
 */
package embyclient

type NameLongIdPair struct {
	// The name.
	Name string `json:"Name,omitempty"`
	// The identifier.
	Id int64 `json:"Id,omitempty"`
}
