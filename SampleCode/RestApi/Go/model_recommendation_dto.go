/*
 * Emby Server REST API (BETA)
 *
 * Explore the Emby Server API
 *
 */
package embyclient

type RecommendationDto struct {
	Items []BaseItemDto `json:"Items,omitempty"`
	RecommendationType *RecommendationType `json:"RecommendationType,omitempty"`
	BaselineItemName string `json:"BaselineItemName,omitempty"`
	CategoryId int64 `json:"CategoryId,omitempty"`
}
