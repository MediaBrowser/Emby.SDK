/*
 * Emby Server REST API (BETA)
 *
 * Explore the Emby Server API
 *
 */
package embyclient-rest-go

type UserLibraryAddTags struct {
	Tags []NameIdPair `json:"Tags,omitempty"`
}
