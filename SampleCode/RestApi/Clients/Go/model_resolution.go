/*
 * Emby Server REST API
 *
 * Explore the Emby Server API
 *
 */
package embyclient-rest-go

// Struct representing a video resolution specified in X and Y dimension.      `System.IComparable`      `System.IEquatable`1`  
type Resolution struct {
	// The resolution width.
	Width int32 `json:"Width,omitempty"`
	// The resolution height.
	Height int32 `json:"Height,omitempty"`
}
