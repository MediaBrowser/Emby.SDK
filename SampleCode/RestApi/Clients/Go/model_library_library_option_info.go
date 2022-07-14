/*
 * Emby Server REST API (BETA)
 *
 * Explore the Emby Server API
 *
 * API version: 4.8.0.3
 */
package embyclient-rest-go

type LibraryLibraryOptionInfo struct {
	Name string `json:"Name,omitempty"`
	DefaultEnabled bool `json:"DefaultEnabled,omitempty"`
	Features []ConfigurationMetadataFeatures `json:"Features,omitempty"`
}
