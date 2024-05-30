/*
 * Emby Server REST API
 *
 * Explore the Emby Server API
 *
 */
package embyclient-rest-go

type PlayerStateInfo struct {
	// The now playing position ticks.
	PositionTicks int64 `json:"PositionTicks,omitempty"`
	// A value indicating whether this instance can seek.
	CanSeek bool `json:"CanSeek,omitempty"`
	// A value indicating whether this instance is paused.
	IsPaused bool `json:"IsPaused,omitempty"`
	// A value indicating whether this instance is muted.
	IsMuted bool `json:"IsMuted,omitempty"`
	// The volume level.
	VolumeLevel int32 `json:"VolumeLevel,omitempty"`
	// The index of the now playing audio stream.
	AudioStreamIndex int32 `json:"AudioStreamIndex,omitempty"`
	// The index of the now playing subtitle stream.
	SubtitleStreamIndex int32 `json:"SubtitleStreamIndex,omitempty"`
	// The now playing media version identifier.
	MediaSourceId string `json:"MediaSourceId,omitempty"`
	PlayMethod *PlayMethod `json:"PlayMethod,omitempty"`
	RepeatMode *RepeatMode `json:"RepeatMode,omitempty"`
	SubtitleOffset int32 `json:"SubtitleOffset,omitempty"`
	Shuffle bool `json:"Shuffle,omitempty"`
	PlaybackRate float64 `json:"PlaybackRate,omitempty"`
}
