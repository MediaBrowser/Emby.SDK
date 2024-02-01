/*
 * Emby Server REST API
 *
 * Explore the Emby Server API
 *
 */
package embyclient-rest-go

// Used to hold information about a user's list of configured virtual folders  
type VirtualFolderInfo struct {
	// The name.
	Name string `json:"Name,omitempty"`
	// The locations.
	Locations []string `json:"Locations,omitempty"`
	// The type of the collection.
	CollectionType string `json:"CollectionType,omitempty"`
	LibraryOptions *LibraryOptions `json:"LibraryOptions,omitempty"`
	// The item identifier.
	ItemId string `json:"ItemId,omitempty"`
	// ItemId came first, so that is left for compatability purposes
	Id string `json:"Id,omitempty"`
	Guid string `json:"Guid,omitempty"`
	// The primary image item identifier.
	PrimaryImageItemId string `json:"PrimaryImageItemId,omitempty"`
	RefreshProgress float64 `json:"RefreshProgress,omitempty"`
	RefreshStatus string `json:"RefreshStatus,omitempty"`
}
