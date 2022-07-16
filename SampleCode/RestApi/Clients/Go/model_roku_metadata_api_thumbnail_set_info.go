/*
 * Emby Server REST API (BETA)
 *
 * Explore the Emby Server API
 *
 * API version: 4.8.0.6
 */
package embyclient-rest-go

type RokuMetadataApiThumbnailSetInfo struct {
	AspectRatio float64 `json:"AspectRatio,omitempty"`
	Thumbnails []RokuMetadataApiThumbnailInfo `json:"Thumbnails,omitempty"`
}
