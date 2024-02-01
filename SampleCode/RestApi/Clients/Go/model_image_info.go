/*
 * Emby Server REST API
 *
 * Explore the Emby Server API
 *
 */
package embyclient-rest-go

// Class ImageInfo  
type ImageInfo struct {
	ImageType *ImageType `json:"ImageType,omitempty"`
	// The index of the image.
	ImageIndex int32 `json:"ImageIndex,omitempty"`
	// The path.
	Path string `json:"Path,omitempty"`
	Filename string `json:"Filename,omitempty"`
	// The height.
	Height int32 `json:"Height,omitempty"`
	// The width.
	Width int32 `json:"Width,omitempty"`
	// The size.
	Size int64 `json:"Size,omitempty"`
}
