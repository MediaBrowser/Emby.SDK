/*
 * Emby Server REST API (BETA)
 *
 * Explore the Emby Server API
 *
 * API version: 4.8.0.3
 */
package embyclient-rest-go

type LibraryAddVirtualFolder struct {
	Name string `json:"Name,omitempty"`
	CollectionType string `json:"CollectionType,omitempty"`
	RefreshLibrary bool `json:"RefreshLibrary,omitempty"`
	Paths []string `json:"Paths,omitempty"`
	LibraryOptions *ConfigurationLibraryOptions `json:"LibraryOptions,omitempty"`
}
