/*
 * Emby Server REST API (BETA)
 *
 * Explore the Emby Server API
 *
 */
package embyclient-rest-go

type UserLibraryRemoveTags struct {
	Tags []NameIdPair `json:"Tags,omitempty"`
}
