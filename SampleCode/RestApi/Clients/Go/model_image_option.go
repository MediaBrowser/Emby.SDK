/*
 * Emby Server REST API
 *
 * Explore the Emby Server API
 *
 */
package embyclient-rest-go

type ImageOption struct {
	Type_ *ImageType `json:"Type,omitempty"`
	// The limit.
	Limit int32 `json:"Limit,omitempty"`
	// The minimum width.
	MinWidth int32 `json:"MinWidth,omitempty"`
}
