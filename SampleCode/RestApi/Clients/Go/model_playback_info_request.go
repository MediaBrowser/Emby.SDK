/*
 * Emby Server REST API
 *
 * Explore the Emby Server API
 *
 */
package embyclient-rest-go

type PlaybackInfoRequest struct {
	Id string `json:"Id,omitempty"`
	UserId string `json:"UserId,omitempty"`
	MaxStreamingBitrate int64 `json:"MaxStreamingBitrate,omitempty"`
	StartTimeTicks int64 `json:"StartTimeTicks,omitempty"`
	AudioStreamIndex int32 `json:"AudioStreamIndex,omitempty"`
	SubtitleStreamIndex int32 `json:"SubtitleStreamIndex,omitempty"`
	MaxAudioChannels int32 `json:"MaxAudioChannels,omitempty"`
	MediaSourceId string `json:"MediaSourceId,omitempty"`
	LiveStreamId string `json:"LiveStreamId,omitempty"`
	DeviceProfile *DeviceProfile `json:"DeviceProfile,omitempty"`
	EnableDirectPlay bool `json:"EnableDirectPlay,omitempty"`
	EnableDirectStream bool `json:"EnableDirectStream,omitempty"`
	EnableTranscoding bool `json:"EnableTranscoding,omitempty"`
	AllowInterlacedVideoStreamCopy bool `json:"AllowInterlacedVideoStreamCopy,omitempty"`
	AllowVideoStreamCopy bool `json:"AllowVideoStreamCopy,omitempty"`
	AllowAudioStreamCopy bool `json:"AllowAudioStreamCopy,omitempty"`
	IsPlayback bool `json:"IsPlayback,omitempty"`
	AutoOpenLiveStream bool `json:"AutoOpenLiveStream,omitempty"`
	DirectPlayProtocols []MediaProtocol `json:"DirectPlayProtocols,omitempty"`
	CurrentPlaySessionId string `json:"CurrentPlaySessionId,omitempty"`
}
