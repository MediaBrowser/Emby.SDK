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

type LiveTvTimerInfoDto struct {
	Status *LiveTvRecordingStatus `json:"Status,omitempty"`
	// The series timer identifier.
	SeriesTimerId string `json:"SeriesTimerId,omitempty"`
	// The run time ticks.
	RunTimeTicks int64 `json:"RunTimeTicks,omitempty"`
	ProgramInfo *BaseItemDto `json:"ProgramInfo,omitempty"`
	TimerType *LiveTvTimerType `json:"TimerType,omitempty"`
	// Id of the recording.
	Id string `json:"Id,omitempty"`
	Type_ string `json:"Type,omitempty"`
	// The server identifier.
	ServerId string `json:"ServerId,omitempty"`
	// ChannelId of the recording.
	ChannelId string `json:"ChannelId,omitempty"`
	// ChannelName of the recording.
	ChannelName string `json:"ChannelName,omitempty"`
	ChannelNumber string `json:"ChannelNumber,omitempty"`
	ChannelPrimaryImageTag string `json:"ChannelPrimaryImageTag,omitempty"`
	// The program identifier.
	ProgramId string `json:"ProgramId,omitempty"`
	// Name of the recording.
	Name string `json:"Name,omitempty"`
	// Description of the recording.
	Overview string `json:"Overview,omitempty"`
	ParentFolderId string `json:"ParentFolderId,omitempty"`
	// The start date of the recording, in UTC.
	StartDate time.Time `json:"StartDate,omitempty"`
	// The end date of the recording, in UTC.
	EndDate time.Time `json:"EndDate,omitempty"`
	// The priority.
	Priority int32 `json:"Priority,omitempty"`
	// The pre padding seconds.
	PrePaddingSeconds int32 `json:"PrePaddingSeconds,omitempty"`
	// The post padding seconds.
	PostPaddingSeconds int32 `json:"PostPaddingSeconds,omitempty"`
	// A value indicating whether this instance is pre padding required.
	IsPrePaddingRequired bool `json:"IsPrePaddingRequired,omitempty"`
	// If the item does not have any backdrops, this will hold the Id of the Parent that has one.
	ParentBackdropItemId string `json:"ParentBackdropItemId,omitempty"`
	// The parent backdrop image tags.
	ParentBackdropImageTags []string `json:"ParentBackdropImageTags,omitempty"`
	// A value indicating whether this instance is post padding required.
	IsPostPaddingRequired bool `json:"IsPostPaddingRequired,omitempty"`
	KeepUntil *LiveTvKeepUntil `json:"KeepUntil,omitempty"`
}
