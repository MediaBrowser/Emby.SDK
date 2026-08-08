/*
 * Emby Server REST API (BETA)
 *
 * Explore the Emby Server API
 *
 */
package embyclient

type ItemsQuery struct {
	StudioIds []string `json:"StudioIds,omitempty"`
	TagIds []string `json:"TagIds,omitempty"`
	GenreIds []string `json:"GenreIds,omitempty"`
	CollectionTypes []string `json:"CollectionTypes,omitempty"`
	IsFavorite bool `json:"IsFavorite,omitempty"`
	IsPlayed bool `json:"IsPlayed,omitempty"`
	IsResumable bool `json:"IsResumable,omitempty"`
	IsSports bool `json:"IsSports,omitempty"`
	IsNews bool `json:"IsNews,omitempty"`
	IsSeries bool `json:"IsSeries,omitempty"`
	IsMovie bool `json:"IsMovie,omitempty"`
	IsRepeat bool `json:"IsRepeat,omitempty"`
}
