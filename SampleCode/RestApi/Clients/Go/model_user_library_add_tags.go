/*
 * Emby Server REST API (BETA)
 *
 * Explore the Emby Server API
 *
 * API version: 4.8.0.6
 */
package embyclient-rest-go

type UserLibraryAddTags struct {
	Tags []NameIdPair `json:"Tags,omitempty"`
}