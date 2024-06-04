/*
 * Emby Server REST API (BETA)
 *
 * Explore the Emby Server API
 *
 */
package embyclient-rest-go

type DisplayPreferences struct {
	Id string `json:"Id,omitempty"`
	SortBy string `json:"SortBy,omitempty"`
	CustomPrefs map[string]string `json:"CustomPrefs,omitempty"`
	SortOrder *SortOrder `json:"SortOrder,omitempty"`
	Client string `json:"Client,omitempty"`
}
