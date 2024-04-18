/*
 * Emby Server REST API
 *
 * Explore the Emby Server API
 *
 */
package embyclient-rest-go
import (
	"time"
)

type LiveTvSeriesTimerInfo struct {
	// Id of the recording.
	Id string `json:"Id,omitempty"`
	// ChannelId of the recording.
	ChannelId string `json:"ChannelId,omitempty"`
	ChannelIds []string `json:"ChannelIds,omitempty"`
	ParentFolderId int64 `json:"ParentFolderId,omitempty"`
	// The program identifier.
	ProgramId string `json:"ProgramId,omitempty"`
	// Name of the recording.
	Name string `json:"Name,omitempty"`
	ServiceName string `json:"ServiceName,omitempty"`
	// Description of the recording.
	Overview string `json:"Overview,omitempty"`
	// The start date of the recording, in UTC.
	StartDate time.Time `json:"StartDate,omitempty"`
	// The end date of the recording, in UTC.
	EndDate time.Time `json:"EndDate,omitempty"`
	// A value indicating whether \\[record any time\\].
	RecordAnyTime bool `json:"RecordAnyTime,omitempty"`
	KeepUpTo int32 `json:"KeepUpTo,omitempty"`
	KeepUntil *LiveTvKeepUntil `json:"KeepUntil,omitempty"`
	SkipEpisodesInLibrary bool `json:"SkipEpisodesInLibrary,omitempty"`
	MatchExistingItemsWithAnyLibrary bool `json:"MatchExistingItemsWithAnyLibrary,omitempty"`
	// A value indicating whether \\[record new only\\].
	RecordNewOnly bool `json:"RecordNewOnly,omitempty"`
	// The days.
	Days []DayOfWeek `json:"Days,omitempty"`
	// The priority.
	Priority int32 `json:"Priority,omitempty"`
	// The pre padding seconds.
	PrePaddingSeconds int32 `json:"PrePaddingSeconds,omitempty"`
	// The post padding seconds.
	PostPaddingSeconds int32 `json:"PostPaddingSeconds,omitempty"`
	// A value indicating whether this instance is pre padding required.
	IsPrePaddingRequired bool `json:"IsPrePaddingRequired,omitempty"`
	// A value indicating whether this instance is post padding required.
	IsPostPaddingRequired bool `json:"IsPostPaddingRequired,omitempty"`
	// The series identifier.
	SeriesId string `json:"SeriesId,omitempty"`
	ProviderIds *map[string]string `json:"ProviderIds,omitempty"`
	MaxRecordingSeconds int32 `json:"MaxRecordingSeconds,omitempty"`
	Keywords []LiveTvKeywordInfo `json:"Keywords,omitempty"`
	TimerType *LiveTvTimerType `json:"TimerType,omitempty"`
}
