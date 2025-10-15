/*
 * Emby Server REST API (BETA)
 *
 * Explore the Emby Server API
 *
 */
package embyclient
import (
	"time"
)

type EntitiesItemImageInfo struct {
	// The path.
	Path string `json:"Path,omitempty"`
	Type_ *ImageType `json:"Type,omitempty"`
	Orientation *DrawingImageOrientation `json:"Orientation,omitempty"`
	// The date modified.
	DateModified time.Time `json:"DateModified,omitempty"`
	Width int32 `json:"Width,omitempty"`
	Height int32 `json:"Height,omitempty"`
}
