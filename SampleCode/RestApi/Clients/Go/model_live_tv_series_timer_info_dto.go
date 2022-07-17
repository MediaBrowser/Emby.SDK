/*
 * Emby REST API
 *
 * Explore the Emby Server API
 *
 */
package embyclient-rest-go
import (
	"time"
)

type LiveTvSeriesTimerInfoDto struct {
	RecordAnyTime bool `json:"RecordAnyTime,omitempty"`
	SkipEpisodesInLibrary bool `json:"SkipEpisodesInLibrary,omitempty"`
	RecordAnyChannel bool `json:"RecordAnyChannel,omitempty"`
	KeepUpTo int32 `json:"KeepUpTo,omitempty"`
	MaxRecordingSeconds int32 `json:"MaxRecordingSeconds,omitempty"`
	RecordNewOnly bool `json:"RecordNewOnly,omitempty"`
	ChannelIds []string `json:"ChannelIds,omitempty"`
	Days []DayOfWeek `json:"Days,omitempty"`
	ImageTags map[string]string `json:"ImageTags,omitempty"`
	ParentThumbItemId string `json:"ParentThumbItemId,omitempty"`
	ParentThumbImageTag string `json:"ParentThumbImageTag,omitempty"`
	ParentPrimaryImageItemId string `json:"ParentPrimaryImageItemId,omitempty"`
	ParentPrimaryImageTag string `json:"ParentPrimaryImageTag,omitempty"`
	SeriesId string `json:"SeriesId,omitempty"`
	Keywords []LiveTvKeywordInfo `json:"Keywords,omitempty"`
	TimerType *LiveTvTimerType `json:"TimerType,omitempty"`
	Id string `json:"Id,omitempty"`
	Type_ string `json:"Type,omitempty"`
	ServerId string `json:"ServerId,omitempty"`
	ChannelId string `json:"ChannelId,omitempty"`
	ChannelName string `json:"ChannelName,omitempty"`
	ChannelPrimaryImageTag string `json:"ChannelPrimaryImageTag,omitempty"`
	ProgramId string `json:"ProgramId,omitempty"`
	Name string `json:"Name,omitempty"`
	Overview string `json:"Overview,omitempty"`
	StartDate time.Time `json:"StartDate,omitempty"`
	EndDate time.Time `json:"EndDate,omitempty"`
	Priority int32 `json:"Priority,omitempty"`
	PrePaddingSeconds int32 `json:"PrePaddingSeconds,omitempty"`
	PostPaddingSeconds int32 `json:"PostPaddingSeconds,omitempty"`
	IsPrePaddingRequired bool `json:"IsPrePaddingRequired,omitempty"`
	ParentBackdropItemId string `json:"ParentBackdropItemId,omitempty"`
	ParentBackdropImageTags []string `json:"ParentBackdropImageTags,omitempty"`
	IsPostPaddingRequired bool `json:"IsPostPaddingRequired,omitempty"`
	KeepUntil *LiveTvKeepUntil `json:"KeepUntil,omitempty"`
}
