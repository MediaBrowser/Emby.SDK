/*
 * Emby Server REST API
 *
 * Explore the Emby Server API
 *
 */
package embyclient-rest-go

type NameLongIdPair struct {
	// The name.
	Name string `json:"Name,omitempty"`
	// The identifier.
	Id int64 `json:"Id,omitempty"`
}
