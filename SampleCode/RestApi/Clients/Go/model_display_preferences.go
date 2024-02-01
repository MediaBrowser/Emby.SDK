/*
 * Emby Server REST API
 *
 * Explore the Emby Server API
 *
 */
package embyclient-rest-go

// Defines the display preferences for any item that supports them (usually Folders)  
type DisplayPreferences struct {
	// The user id.
	Id string `json:"Id,omitempty"`
	// The sort by.
	SortBy string `json:"SortBy,omitempty"`
	// The custom prefs.
	CustomPrefs map[string]string `json:"CustomPrefs,omitempty"`
	SortOrder *SortOrder `json:"SortOrder,omitempty"`
	// The client
	Client string `json:"Client,omitempty"`
}
