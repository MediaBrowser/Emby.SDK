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

type MediaSourceInfo struct {
	Protocol *MediaProtocol `json:"Protocol,omitempty"`
	Id string `json:"Id,omitempty"`
	Path string `json:"Path,omitempty"`
	EncoderPath string `json:"EncoderPath,omitempty"`
	EncoderProtocol *MediaProtocol `json:"EncoderProtocol,omitempty"`
	Type_ *MediaSourceType `json:"Type,omitempty"`
	ProbePath string `json:"ProbePath,omitempty"`
	ProbeProtocol *MediaProtocol `json:"ProbeProtocol,omitempty"`
	Container string `json:"Container,omitempty"`
	Size int64 `json:"Size,omitempty"`
	Name string `json:"Name,omitempty"`
	SortName string `json:"SortName,omitempty"`
	// Differentiate internet url vs local network
	IsRemote bool `json:"IsRemote,omitempty"`
	HasMixedProtocols bool `json:"HasMixedProtocols,omitempty"`
	RunTimeTicks int64 `json:"RunTimeTicks,omitempty"`
	ContainerStartTimeTicks int64 `json:"ContainerStartTimeTicks,omitempty"`
	SupportsTranscoding bool `json:"SupportsTranscoding,omitempty"`
	TrancodeLiveStartIndex int32 `json:"TrancodeLiveStartIndex,omitempty"`
	WallClockStart time.Time `json:"WallClockStart,omitempty"`
	SupportsDirectStream bool `json:"SupportsDirectStream,omitempty"`
	SupportsDirectPlay bool `json:"SupportsDirectPlay,omitempty"`
	IsInfiniteStream bool `json:"IsInfiniteStream,omitempty"`
	RequiresOpening bool `json:"RequiresOpening,omitempty"`
	OpenToken string `json:"OpenToken,omitempty"`
	RequiresClosing bool `json:"RequiresClosing,omitempty"`
	LiveStreamId string `json:"LiveStreamId,omitempty"`
	BufferMs int32 `json:"BufferMs,omitempty"`
	RequiresLooping bool `json:"RequiresLooping,omitempty"`
	SupportsProbing bool `json:"SupportsProbing,omitempty"`
	Video3DFormat *Video3DFormat `json:"Video3DFormat,omitempty"`
	MediaStreams []MediaStream `json:"MediaStreams,omitempty"`
	Formats []string `json:"Formats,omitempty"`
	Bitrate int32 `json:"Bitrate,omitempty"`
	Timestamp *TransportStreamTimestamp `json:"Timestamp,omitempty"`
	RequiredHttpHeaders map[string]string `json:"RequiredHttpHeaders,omitempty"`
	DirectStreamUrl string `json:"DirectStreamUrl,omitempty"`
	AddApiKeyToDirectStreamUrl bool `json:"AddApiKeyToDirectStreamUrl,omitempty"`
	TranscodingUrl string `json:"TranscodingUrl,omitempty"`
	TranscodingSubProtocol string `json:"TranscodingSubProtocol,omitempty"`
	TranscodingContainer string `json:"TranscodingContainer,omitempty"`
	AnalyzeDurationMs int32 `json:"AnalyzeDurationMs,omitempty"`
	ReadAtNativeFramerate bool `json:"ReadAtNativeFramerate,omitempty"`
	DefaultAudioStreamIndex int32 `json:"DefaultAudioStreamIndex,omitempty"`
	DefaultSubtitleStreamIndex int32 `json:"DefaultSubtitleStreamIndex,omitempty"`
	// Used only by our Windows app. Not used by Emby Server. The id of the item that this mediasource belongs to, if there is one Also used by Emby for Kodi
	ItemId string `json:"ItemId,omitempty"`
	// Used only by our Windows app. Not used by Emby Server.
	ServerId string `json:"ServerId,omitempty"`
}
