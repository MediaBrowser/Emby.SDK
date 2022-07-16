/*
 * Emby Server REST API (BETA)
 *
 * Explore the Emby Server API
 *
 * API version: 4.8.0.6
 */
package embyclient-rest-go

type VirtualFolderInfo struct {
	Name string `json:"Name,omitempty"`
	Locations []string `json:"Locations,omitempty"`
	CollectionType string `json:"CollectionType,omitempty"`
	LibraryOptions *ConfigurationLibraryOptions `json:"LibraryOptions,omitempty"`
	ItemId string `json:"ItemId,omitempty"`
	PrimaryImageItemId string `json:"PrimaryImageItemId,omitempty"`
	RefreshProgress float64 `json:"RefreshProgress,omitempty"`
	RefreshStatus string `json:"RefreshStatus,omitempty"`
}
