/*
 * Emby Server REST API (BETA)
 *
 * Explore the Emby Server API
 *
 */
package embyclient-rest-go
import (
	"time"
)

type LiveTvTimerInfoDto struct {
	Status *LiveTvRecordingStatus `json:"Status,omitempty"`
	SeriesTimerId string `json:"SeriesTimerId,omitempty"`
	RunTimeTicks int64 `json:"RunTimeTicks,omitempty"`
	ProgramInfo *BaseItemDto `json:"ProgramInfo,omitempty"`
	TimerType *LiveTvTimerType `json:"TimerType,omitempty"`
	Id string `json:"Id,omitempty"`
	Type_ string `json:"Type,omitempty"`
	ServerId string `json:"ServerId,omitempty"`
	ChannelId string `json:"ChannelId,omitempty"`
	ChannelName string `json:"ChannelName,omitempty"`
	ChannelNumber string `json:"ChannelNumber,omitempty"`
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
