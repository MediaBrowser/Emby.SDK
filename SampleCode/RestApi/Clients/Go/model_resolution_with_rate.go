/*
 * Emby Server REST API
 *
 * Explore the Emby Server API
 *
 */
package embyclient-rest-go

// Struct representing a combination of video resolution and frame rate.      `System.IEquatable`1`  
type ResolutionWithRate struct {
	// The resolution width.
	Width int32 `json:"Width,omitempty"`
	// The resolution height.
	Height int32 `json:"Height,omitempty"`
	// The frame rate in frames/second (fps).
	FrameRate float64 `json:"FrameRate,omitempty"`
	Resolution *Resolution `json:"Resolution,omitempty"`
}
