/*
 * Emby Server REST API
 *
 * Explore the Emby Server API
 *
 */
package embyclient-rest-go

type LibraryLibraryOptionInfo struct {
	Name string `json:"Name,omitempty"`
	SetupUrl string `json:"SetupUrl,omitempty"`
	DefaultEnabled bool `json:"DefaultEnabled,omitempty"`
	Features []MetadataFeatures `json:"Features,omitempty"`
}
