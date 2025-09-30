/*
 * Emby Server REST API (BETA)
 *
 * Explore the Emby Server API
 *
 */
package embyclient

type ContentSection struct {
	Name string `json:"Name,omitempty"`
	Subtitle string `json:"Subtitle,omitempty"`
	Id string `json:"Id,omitempty"`
	SectionType string `json:"SectionType,omitempty"`
	CollectionType string `json:"CollectionType,omitempty"`
	ViewType string `json:"ViewType,omitempty"`
	Monitor []string `json:"Monitor,omitempty"`
	CardSizeOffset int32 `json:"CardSizeOffset,omitempty"`
	ScrollDirection *ScrollDirection `json:"ScrollDirection,omitempty"`
	ParentItem *BaseItemDto `json:"ParentItem,omitempty"`
	TextInfo *TextSectionInfo `json:"TextInfo,omitempty"`
	PremiumFeature string `json:"PremiumFeature,omitempty"`
	PremiumMessage string `json:"PremiumMessage,omitempty"`
	RefreshInterval int32 `json:"RefreshInterval,omitempty"`
}
