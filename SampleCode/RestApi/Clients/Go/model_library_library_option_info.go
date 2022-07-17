/*
 * Emby REST API
 *
 * Explore the Emby Server API
 *
 */
package embyclient-rest-go

type LibraryLibraryOptionInfo struct {
	Name string `json:"Name,omitempty"`
	DefaultEnabled bool `json:"DefaultEnabled,omitempty"`
	Features []ConfigurationMetadataFeatures `json:"Features,omitempty"`
}
