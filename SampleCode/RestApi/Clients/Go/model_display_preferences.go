/*
 * Emby REST API
 *
 * Explore the Emby Server API
 *
 */
package embyclient-rest-go

type DisplayPreferences struct {
	Id string `json:"Id,omitempty"`
	ViewType string `json:"ViewType,omitempty"`
	SortBy string `json:"SortBy,omitempty"`
	IndexBy string `json:"IndexBy,omitempty"`
	RememberIndexing bool `json:"RememberIndexing,omitempty"`
	PrimaryImageHeight int32 `json:"PrimaryImageHeight,omitempty"`
	PrimaryImageWidth int32 `json:"PrimaryImageWidth,omitempty"`
	CustomPrefs map[string]string `json:"CustomPrefs,omitempty"`
	ScrollDirection *ScrollDirection `json:"ScrollDirection,omitempty"`
	ShowBackdrop bool `json:"ShowBackdrop,omitempty"`
	RememberSorting bool `json:"RememberSorting,omitempty"`
	SortOrder *SortOrder `json:"SortOrder,omitempty"`
	Client string `json:"Client,omitempty"`
}
