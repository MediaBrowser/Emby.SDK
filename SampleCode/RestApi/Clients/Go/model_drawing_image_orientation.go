/*
 * Emby Server REST API (BETA)
 *
 * Explore the Emby Server API
 *
 * API version: 4.8.0.3
 */
package embyclient-rest-go

type DrawingImageOrientation string

// List of Drawing.ImageOrientation
const (
	TOP_LEFT_DrawingImageOrientation DrawingImageOrientation = "TopLeft"
	TOP_RIGHT_DrawingImageOrientation DrawingImageOrientation = "TopRight"
	BOTTOM_RIGHT_DrawingImageOrientation DrawingImageOrientation = "BottomRight"
	BOTTOM_LEFT_DrawingImageOrientation DrawingImageOrientation = "BottomLeft"
	LEFT_TOP_DrawingImageOrientation DrawingImageOrientation = "LeftTop"
	RIGHT_TOP_DrawingImageOrientation DrawingImageOrientation = "RightTop"
	RIGHT_BOTTOM_DrawingImageOrientation DrawingImageOrientation = "RightBottom"
	LEFT_BOTTOM_DrawingImageOrientation DrawingImageOrientation = "LeftBottom"
)
