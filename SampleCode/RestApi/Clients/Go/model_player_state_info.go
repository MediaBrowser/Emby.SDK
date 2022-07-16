/*
 * Emby Server REST API (BETA)
 *
 * Explore the Emby Server API
 *
 * API version: 4.8.0.6
 */
package embyclient-rest-go

type PlayerStateInfo struct {
	PositionTicks int64 `json:"PositionTicks,omitempty"`
	CanSeek bool `json:"CanSeek,omitempty"`
	IsPaused bool `json:"IsPaused,omitempty"`
	IsMuted bool `json:"IsMuted,omitempty"`
	VolumeLevel int32 `json:"VolumeLevel,omitempty"`
	AudioStreamIndex int32 `json:"AudioStreamIndex,omitempty"`
	SubtitleStreamIndex int32 `json:"SubtitleStreamIndex,omitempty"`
	MediaSourceId string `json:"MediaSourceId,omitempty"`
	PlayMethod *PlayMethod `json:"PlayMethod,omitempty"`
	RepeatMode *RepeatMode `json:"RepeatMode,omitempty"`
	SubtitleOffset int32 `json:"SubtitleOffset,omitempty"`
	PlaybackRate float64 `json:"PlaybackRate,omitempty"`
}
