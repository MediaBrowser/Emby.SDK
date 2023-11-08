/*
 * Emby Server REST API (BETA)
 *
 * Explore the Emby Server API
 *
 */
package embyclient-rest-go

type LiveTvApiNameIdDescriptionPair struct {
	ShortOverview string `json:"ShortOverview,omitempty"`
	// The name.
	Name string `json:"Name,omitempty"`
	// The identifier.
	Id string `json:"Id,omitempty"`
}
