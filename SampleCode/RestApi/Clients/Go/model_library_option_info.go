/*
 * Emby Server REST API (BETA)
 *
 * Explore the Emby Server API
 *
 */
package embyclient

type LibraryOptionInfo struct {
	Name string `json:"Name,omitempty"`
	SetupUrl string `json:"SetupUrl,omitempty"`
	DefaultEnabled bool `json:"DefaultEnabled,omitempty"`
	Features []MetadataFeatures `json:"Features,omitempty"`
}
