/*
 * Emby Server REST API
 *
 * Explore the Emby Server API
 *
 */
package embyclient-rest-go

// Class RemoteImageInfo  
type RemoteImageInfo struct {
	// The name of the provider.
	ProviderName string `json:"ProviderName,omitempty"`
	// The URL.
	Url string `json:"Url,omitempty"`
	// A url used for previewing a smaller version
	ThumbnailUrl string `json:"ThumbnailUrl,omitempty"`
	// The height.
	Height int32 `json:"Height,omitempty"`
	// The width.
	Width int32 `json:"Width,omitempty"`
	// The community rating.
	CommunityRating float64 `json:"CommunityRating,omitempty"`
	// The vote count.
	VoteCount int32 `json:"VoteCount,omitempty"`
	// The language.
	Language string `json:"Language,omitempty"`
	DisplayLanguage string `json:"DisplayLanguage,omitempty"`
	Type_ *ImageType `json:"Type,omitempty"`
	RatingType *RatingType `json:"RatingType,omitempty"`
}
