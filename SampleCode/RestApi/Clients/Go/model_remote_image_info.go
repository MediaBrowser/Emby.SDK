/*
 * Emby Server REST API (BETA)
 *
 * Explore the Emby Server API
 *
 * API version: 4.8.0.6
 */
package embyclient-rest-go

type RemoteImageInfo struct {
	ProviderName string `json:"ProviderName,omitempty"`
	Url string `json:"Url,omitempty"`
	ThumbnailUrl string `json:"ThumbnailUrl,omitempty"`
	Height int32 `json:"Height,omitempty"`
	Width int32 `json:"Width,omitempty"`
	CommunityRating float64 `json:"CommunityRating,omitempty"`
	VoteCount int32 `json:"VoteCount,omitempty"`
	Language string `json:"Language,omitempty"`
	DisplayLanguage string `json:"DisplayLanguage,omitempty"`
	Type_ *ImageType `json:"Type,omitempty"`
	RatingType *RatingType `json:"RatingType,omitempty"`
}
