/*
 * Emby Server REST API (BETA)
 *
 * Explore the Emby Server API
 *
 */
package embyclient-rest-go

type DlnaTranscodingProfile struct {
	Container string `json:"Container,omitempty"`
	Type_ *DlnaDlnaProfileType `json:"Type,omitempty"`
	VideoCodec string `json:"VideoCodec,omitempty"`
	AudioCodec string `json:"AudioCodec,omitempty"`
	Protocol string `json:"Protocol,omitempty"`
	EstimateContentLength bool `json:"EstimateContentLength,omitempty"`
	EnableMpegtsM2TsMode bool `json:"EnableMpegtsM2TsMode,omitempty"`
	TranscodeSeekInfo *DlnaTranscodeSeekInfo `json:"TranscodeSeekInfo,omitempty"`
	CopyTimestamps bool `json:"CopyTimestamps,omitempty"`
	Context *DlnaEncodingContext `json:"Context,omitempty"`
	MaxAudioChannels string `json:"MaxAudioChannels,omitempty"`
	MinSegments int32 `json:"MinSegments,omitempty"`
	SegmentLength int32 `json:"SegmentLength,omitempty"`
	BreakOnNonKeyFrames bool `json:"BreakOnNonKeyFrames,omitempty"`
	AllowInterlacedVideoStreamCopy bool `json:"AllowInterlacedVideoStreamCopy,omitempty"`
	ManifestSubtitles string `json:"ManifestSubtitles,omitempty"`
	MaxManifestSubtitles int32 `json:"MaxManifestSubtitles,omitempty"`
}
