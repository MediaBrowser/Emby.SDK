/*
 * Emby Server REST API (BETA)
 *
 * Explore the Emby Server API
 *
 */
package embyclient
import (
	"time"
)

type ApiBaseItemsRequest struct {
	IsSpecialEpisode bool `json:"IsSpecialEpisode,omitempty"`
	Is4K bool `json:"Is4K,omitempty"`
	MinDateCreated time.Time `json:"MinDateCreated,omitempty"`
	MaxDateCreated time.Time `json:"MaxDateCreated,omitempty"`
	EnableTotalRecordCount bool `json:"EnableTotalRecordCount,omitempty"`
	MatchAnyWord bool `json:"MatchAnyWord,omitempty"`
	IsDuplicate bool `json:"IsDuplicate,omitempty"`
	Name string `json:"Name,omitempty"`
	RecordingKeyword string `json:"RecordingKeyword,omitempty"`
	RecordingKeywordType *LiveTvKeywordType `json:"RecordingKeywordType,omitempty"`
	RandomSeed int32 `json:"RandomSeed,omitempty"`
	GenreIds string `json:"GenreIds,omitempty"`
	CollectionIds string `json:"CollectionIds,omitempty"`
	TagIds string `json:"TagIds,omitempty"`
	ExcludeTagIds string `json:"ExcludeTagIds,omitempty"`
	ItemPersonTypes []PersonType `json:"ItemPersonTypes,omitempty"`
	ExcludeArtistIds string `json:"ExcludeArtistIds,omitempty"`
	AlbumArtistIds string `json:"AlbumArtistIds,omitempty"`
	ComposerArtistIds string `json:"ComposerArtistIds,omitempty"`
	ContributingArtistIds string `json:"ContributingArtistIds,omitempty"`
	AlbumIds string `json:"AlbumIds,omitempty"`
	OuterIds string `json:"OuterIds,omitempty"`
	ListItemIds string `json:"ListItemIds,omitempty"`
	AudioLanguages string `json:"AudioLanguages,omitempty"`
	SubtitleLanguages string `json:"SubtitleLanguages,omitempty"`
	CanEditItems bool `json:"CanEditItems,omitempty"`
	GroupItemsInto *LibraryItemLinkType `json:"GroupItemsInto,omitempty"`
	IsStandaloneSpecial bool `json:"IsStandaloneSpecial,omitempty"`
	MinWidth int32 `json:"MinWidth,omitempty"`
	MinHeight int32 `json:"MinHeight,omitempty"`
	MaxWidth int32 `json:"MaxWidth,omitempty"`
	MaxHeight int32 `json:"MaxHeight,omitempty"`
	GroupProgramsBySeries bool `json:"GroupProgramsBySeries,omitempty"`
	AirDays []DayOfWeek `json:"AirDays,omitempty"`
	IsAiring bool `json:"IsAiring,omitempty"`
	HasAired bool `json:"HasAired,omitempty"`
	CollectionTypes string `json:"CollectionTypes,omitempty"`
	ExcludeSources []string `json:"ExcludeSources,omitempty"`
}
