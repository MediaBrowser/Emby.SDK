/*
 * Emby Server REST API (BETA)
 *
 * Explore the Emby Server API
 *
 */
package embyclient

// Class ImageProviderInfo.  
type ImageProviderInfo struct {
	// The name.
	Name string `json:"Name,omitempty"`
	SupportedImages []ImageType `json:"SupportedImages,omitempty"`
}
