/*
 * Emby Server REST API (BETA)
 *
 * Explore the Emby Server API
 *
 * API version: 4.8.0.3
 */
package embyclient-rest-go

type EmbyMediaModelTypesResolutionWithRate struct {
	Width int32 `json:"Width,omitempty"`
	Height int32 `json:"Height,omitempty"`
	FrameRate float64 `json:"FrameRate,omitempty"`
	Resolution *EmbyMediaModelTypesResolution `json:"Resolution,omitempty"`
}
