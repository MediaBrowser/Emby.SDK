/*
 * Emby Server REST API (BETA)
 *
 * Explore the Emby Server API
 *
 */
package embyclient

type RokuMetadataApiThumbnailSetInfo struct {
	AspectRatio float64 `json:"AspectRatio,omitempty"`
	Thumbnails []RokuMetadataApiThumbnailInfo `json:"Thumbnails,omitempty"`
}
