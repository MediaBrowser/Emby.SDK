/*
 * Emby Server REST API
 *
 * Explore the Emby Server API
 *
 */
package embyclient-rest-go

type Video3DFormat string

// List of Video3DFormat
const (
	HALF_SIDE_BY_SIDE_Video3DFormat Video3DFormat = "HalfSideBySide"
	FULL_SIDE_BY_SIDE_Video3DFormat Video3DFormat = "FullSideBySide"
	FULL_TOP_AND_BOTTOM_Video3DFormat Video3DFormat = "FullTopAndBottom"
	HALF_TOP_AND_BOTTOM_Video3DFormat Video3DFormat = "HalfTopAndBottom"
	MVC_Video3DFormat Video3DFormat = "MVC"
)
