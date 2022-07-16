/*
 * Emby Server REST API (BETA)
 *
 * Explore the Emby Server API
 *
 * API version: 4.8.0.6
 */
package embyclient-rest-go

type RecommendationDto struct {
	Items []BaseItemDto `json:"Items,omitempty"`
	RecommendationType *RecommendationType `json:"RecommendationType,omitempty"`
	BaselineItemName string `json:"BaselineItemName,omitempty"`
	CategoryId int64 `json:"CategoryId,omitempty"`
}
