/*
 * Emby Server REST API
 *
 * Explore the Emby Server API
 *
 */
package embyclient-rest-go

type LibraryAddVirtualFolder struct {
	Name string `json:"Name,omitempty"`
	CollectionType string `json:"CollectionType,omitempty"`
	RefreshLibrary bool `json:"RefreshLibrary,omitempty"`
	Paths []string `json:"Paths,omitempty"`
	LibraryOptions *LibraryOptions `json:"LibraryOptions,omitempty"`
}
