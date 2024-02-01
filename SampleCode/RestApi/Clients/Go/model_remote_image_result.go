/*
 * Emby Server REST API
 *
 * Explore the Emby Server API
 *
 */
package embyclient-rest-go

// Class RemoteImageResult.  
type RemoteImageResult struct {
	// The images.
	Images []RemoteImageInfo `json:"Images,omitempty"`
	// The total record count.
	TotalRecordCount int32 `json:"TotalRecordCount,omitempty"`
	// The providers.
	Providers []string `json:"Providers,omitempty"`
}
