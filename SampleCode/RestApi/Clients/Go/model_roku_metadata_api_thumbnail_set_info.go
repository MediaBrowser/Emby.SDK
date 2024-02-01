/*
 * Emby Server REST API
 *
 * Explore the Emby Server API
 *
 */
package embyclient-rest-go

type RokuMetadataApiThumbnailSetInfo struct {
	AspectRatio float64 `json:"AspectRatio,omitempty"`
	Thumbnails []RokuMetadataApiThumbnailInfo `json:"Thumbnails,omitempty"`
}
