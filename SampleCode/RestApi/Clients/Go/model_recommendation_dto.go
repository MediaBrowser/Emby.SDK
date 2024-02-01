/*
 * Emby Server REST API
 *
 * Explore the Emby Server API
 *
 */
package embyclient-rest-go

type RecommendationDto struct {
	Items []BaseItemDto `json:"Items,omitempty"`
	RecommendationType *RecommendationType `json:"RecommendationType,omitempty"`
	BaselineItemName string `json:"BaselineItemName,omitempty"`
	CategoryId int64 `json:"CategoryId,omitempty"`
}
