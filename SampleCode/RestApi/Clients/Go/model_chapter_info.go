/*
 * Emby Server REST API
 *
 * Explore the Emby Server API
 *
 */
package embyclient-rest-go

// Class ChapterInfo  
type ChapterInfo struct {
	// The start position ticks.
	StartPositionTicks int64 `json:"StartPositionTicks,omitempty"`
	// The name.
	Name string `json:"Name,omitempty"`
	ImageTag string `json:"ImageTag,omitempty"`
	MarkerType *MarkerType `json:"MarkerType,omitempty"`
	ChapterIndex int32 `json:"ChapterIndex,omitempty"`
}
