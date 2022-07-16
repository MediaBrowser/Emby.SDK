/*
 * Emby Server REST API (BETA)
 *
 * Explore the Emby Server API
 *
 * API version: 4.8.0.6
 */
package embyclient-rest-go
import (
	"time"
)

type LiveTvSeriesTimerInfo struct {
	Id string `json:"Id,omitempty"`
	ChannelId string `json:"ChannelId,omitempty"`
	ChannelIds []string `json:"ChannelIds,omitempty"`
	ProgramId string `json:"ProgramId,omitempty"`
	Name string `json:"Name,omitempty"`
	ServiceName string `json:"ServiceName,omitempty"`
	Overview string `json:"Overview,omitempty"`
	StartDate time.Time `json:"StartDate,omitempty"`
	EndDate time.Time `json:"EndDate,omitempty"`
	RecordAnyTime bool `json:"RecordAnyTime,omitempty"`
	KeepUpTo int32 `json:"KeepUpTo,omitempty"`
	KeepUntil *LiveTvKeepUntil `json:"KeepUntil,omitempty"`
	SkipEpisodesInLibrary bool `json:"SkipEpisodesInLibrary,omitempty"`
	RecordNewOnly bool `json:"RecordNewOnly,omitempty"`
	Days []DayOfWeek `json:"Days,omitempty"`
	Priority int32 `json:"Priority,omitempty"`
	PrePaddingSeconds int32 `json:"PrePaddingSeconds,omitempty"`
	PostPaddingSeconds int32 `json:"PostPaddingSeconds,omitempty"`
	IsPrePaddingRequired bool `json:"IsPrePaddingRequired,omitempty"`
	IsPostPaddingRequired bool `json:"IsPostPaddingRequired,omitempty"`
	SeriesId string `json:"SeriesId,omitempty"`
	ProviderIds *map[string]string `json:"ProviderIds,omitempty"`
	MaxRecordingSeconds int32 `json:"MaxRecordingSeconds,omitempty"`
	Keywords []LiveTvKeywordInfo `json:"Keywords,omitempty"`
	TimerType *LiveTvTimerType `json:"TimerType,omitempty"`
}
