/*
 * Emby Server REST API
 *
 * Explore the Emby Server API
 *
 */
package embyclient-rest-go

type LiveStreamRequest struct {
	OpenToken string `json:"OpenToken,omitempty"`
	UserId string `json:"UserId,omitempty"`
	PlaySessionId string `json:"PlaySessionId,omitempty"`
	MaxStreamingBitrate int64 `json:"MaxStreamingBitrate,omitempty"`
	StartTimeTicks int64 `json:"StartTimeTicks,omitempty"`
	AudioStreamIndex int32 `json:"AudioStreamIndex,omitempty"`
	SubtitleStreamIndex int32 `json:"SubtitleStreamIndex,omitempty"`
	MaxAudioChannels int32 `json:"MaxAudioChannels,omitempty"`
	ItemId int64 `json:"ItemId,omitempty"`
	DeviceProfile *DeviceProfile `json:"DeviceProfile,omitempty"`
	EnableDirectPlay bool `json:"EnableDirectPlay,omitempty"`
	EnableDirectStream bool `json:"EnableDirectStream,omitempty"`
	EnableTranscoding bool `json:"EnableTranscoding,omitempty"`
	AllowVideoStreamCopy bool `json:"AllowVideoStreamCopy,omitempty"`
	AllowInterlacedVideoStreamCopy bool `json:"AllowInterlacedVideoStreamCopy,omitempty"`
	AllowAudioStreamCopy bool `json:"AllowAudioStreamCopy,omitempty"`
	DirectPlayProtocols []MediaProtocol `json:"DirectPlayProtocols,omitempty"`
}
