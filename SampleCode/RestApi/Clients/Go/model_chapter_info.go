/*
 * Emby Server REST API (BETA)
 *
 * Explore the Emby Server API
 *
 * API version: 4.8.0.5
 */
package embyclient-rest-go

type ChapterInfo struct {
	StartPositionTicks int64 `json:"StartPositionTicks,omitempty"`
	Name string `json:"Name,omitempty"`
	ImageTag string `json:"ImageTag,omitempty"`
	MarkerType *MarkerType `json:"MarkerType,omitempty"`
	ChapterIndex int32 `json:"ChapterIndex,omitempty"`
}
