/*
 * Emby Server REST API
 *
 * Explore the Emby Server API
 *
 */
package embyclient-rest-go

type TranscodingInfo struct {
	AudioCodec string `json:"AudioCodec,omitempty"`
	VideoCodec string `json:"VideoCodec,omitempty"`
	SubProtocol string `json:"SubProtocol,omitempty"`
	Container string `json:"Container,omitempty"`
	IsVideoDirect bool `json:"IsVideoDirect,omitempty"`
	IsAudioDirect bool `json:"IsAudioDirect,omitempty"`
	Bitrate int32 `json:"Bitrate,omitempty"`
	AudioBitrate int32 `json:"AudioBitrate,omitempty"`
	VideoBitrate int32 `json:"VideoBitrate,omitempty"`
	Framerate float32 `json:"Framerate,omitempty"`
	CompletionPercentage float64 `json:"CompletionPercentage,omitempty"`
	TranscodingPositionTicks float64 `json:"TranscodingPositionTicks,omitempty"`
	TranscodingStartPositionTicks float64 `json:"TranscodingStartPositionTicks,omitempty"`
	Width int32 `json:"Width,omitempty"`
	Height int32 `json:"Height,omitempty"`
	AudioChannels int32 `json:"AudioChannels,omitempty"`
	TranscodeReasons []TranscodeReason `json:"TranscodeReasons,omitempty"`
	// Deprecated, please use ProcessStatistics instead
	CurrentCpuUsage float64 `json:"CurrentCpuUsage,omitempty"`
	// Deprecated, please use ProcessStatistics instead
	AverageCpuUsage float64 `json:"AverageCpuUsage,omitempty"`
	// Deprecated, please use ProcessStatistics instead
	CpuHistory []TupleDoubleDouble `json:"CpuHistory,omitempty"`
	ProcessStatistics *ProcessRunMetricsProcessStatistics `json:"ProcessStatistics,omitempty"`
	CurrentThrottle int32 `json:"CurrentThrottle,omitempty"`
	VideoDecoder string `json:"VideoDecoder,omitempty"`
	VideoDecoderIsHardware bool `json:"VideoDecoderIsHardware,omitempty"`
	VideoDecoderMediaType string `json:"VideoDecoderMediaType,omitempty"`
	VideoDecoderHwAccel string `json:"VideoDecoderHwAccel,omitempty"`
	VideoEncoder string `json:"VideoEncoder,omitempty"`
	VideoEncoderIsHardware bool `json:"VideoEncoderIsHardware,omitempty"`
	VideoEncoderMediaType string `json:"VideoEncoderMediaType,omitempty"`
	VideoEncoderHwAccel string `json:"VideoEncoderHwAccel,omitempty"`
	VideoPipelineInfo []TranscodingVpStepInfo `json:"VideoPipelineInfo,omitempty"`
	SubtitlePipelineInfos [][]TranscodingVpStepInfo `json:"SubtitlePipelineInfos,omitempty"`
}
