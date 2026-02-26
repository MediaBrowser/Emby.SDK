/*
 * Emby Server REST API (BETA)
 *
 * Explore the Emby Server API
 *
 */
package embyclient

type ContentSection struct {
	Name string `json:"Name,omitempty"`
	CustomName string `json:"CustomName,omitempty"`
	Subtitle string `json:"Subtitle,omitempty"`
	Id string `json:"Id,omitempty"`
	SectionType string `json:"SectionType,omitempty"`
	CollectionType string `json:"CollectionType,omitempty"`
	ViewType string `json:"ViewType,omitempty"`
	ImageType string `json:"ImageType,omitempty"`
	DisplayMode string `json:"DisplayMode,omitempty"`
	Monitor []string `json:"Monitor,omitempty"`
	ItemTypes []string `json:"ItemTypes,omitempty"`
	ExcludedFolders []string `json:"ExcludedFolders,omitempty"`
	CardSizeOffset int32 `json:"CardSizeOffset,omitempty"`
	ScrollDirection *ScrollDirection `json:"ScrollDirection,omitempty"`
	ParentItem *BaseItemDto `json:"ParentItem,omitempty"`
	ParentId string `json:"ParentId,omitempty"`
	TextInfo *TextSectionInfo `json:"TextInfo,omitempty"`
	PremiumFeature string `json:"PremiumFeature,omitempty"`
	PremiumMessage string `json:"PremiumMessage,omitempty"`
	RefreshInterval int32 `json:"RefreshInterval,omitempty"`
	SortBy string `json:"SortBy,omitempty"`
	SortOrder string `json:"SortOrder,omitempty"`
	IncludeNextUpInResume bool `json:"IncludeNextUpInResume,omitempty"`
	Query *ItemsQuery `json:"Query,omitempty"`
}
