/*
 * Emby REST API
 *
 * Explore the Emby Server API
 *
 */
package embyclient-rest-go

type PlaybackProgressInfo struct {
	CanSeek bool `json:"CanSeek,omitempty"`
	Item *BaseItemDto `json:"Item,omitempty"`
	NowPlayingQueue []QueueItem `json:"NowPlayingQueue,omitempty"`
	PlaylistItemId string `json:"PlaylistItemId,omitempty"`
	ItemId string `json:"ItemId,omitempty"`
	SessionId string `json:"SessionId,omitempty"`
	MediaSourceId string `json:"MediaSourceId,omitempty"`
	AudioStreamIndex int32 `json:"AudioStreamIndex,omitempty"`
	SubtitleStreamIndex int32 `json:"SubtitleStreamIndex,omitempty"`
	IsPaused bool `json:"IsPaused,omitempty"`
	PlaylistIndex int32 `json:"PlaylistIndex,omitempty"`
	PlaylistLength int32 `json:"PlaylistLength,omitempty"`
	IsMuted bool `json:"IsMuted,omitempty"`
	PositionTicks int64 `json:"PositionTicks,omitempty"`
	RunTimeTicks int64 `json:"RunTimeTicks,omitempty"`
	PlaybackStartTimeTicks int64 `json:"PlaybackStartTimeTicks,omitempty"`
	VolumeLevel int32 `json:"VolumeLevel,omitempty"`
	Brightness int32 `json:"Brightness,omitempty"`
	AspectRatio string `json:"AspectRatio,omitempty"`
	EventName *ProgressEvent `json:"EventName,omitempty"`
	PlayMethod *PlayMethod `json:"PlayMethod,omitempty"`
	LiveStreamId string `json:"LiveStreamId,omitempty"`
	PlaySessionId string `json:"PlaySessionId,omitempty"`
	RepeatMode *RepeatMode `json:"RepeatMode,omitempty"`
	SubtitleOffset int32 `json:"SubtitleOffset,omitempty"`
	PlaybackRate float64 `json:"PlaybackRate,omitempty"`
	PlaylistItemIds []string `json:"PlaylistItemIds,omitempty"`
}
