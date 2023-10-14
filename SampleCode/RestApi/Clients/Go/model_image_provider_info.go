/*
 * Emby Server REST API (BETA)
 *
 * Explore the Emby Server API
 *
 */
package embyclient-rest-go

// Class ImageProviderInfo.  
type ImageProviderInfo struct {
	// The name.
	Name string `json:"Name,omitempty"`
	SupportedImages []ImageType `json:"SupportedImages,omitempty"`
}
