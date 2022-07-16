/*
 * Emby Server REST API (BETA)
 *
 * Explore the Emby Server API
 *
 * API version: 4.8.0.6
 */
package embyclient-rest-go

type RemoteImageResult struct {
	Images []RemoteImageInfo `json:"Images,omitempty"`
	TotalRecordCount int32 `json:"TotalRecordCount,omitempty"`
	Providers []string `json:"Providers,omitempty"`
}
