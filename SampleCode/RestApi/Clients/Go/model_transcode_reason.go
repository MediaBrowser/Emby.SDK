/*
 * Emby Server REST API
 *
 * Explore the Emby Server API
 *
 */
package embyclient-rest-go

type TranscodeReason string

// List of TranscodeReason
const (
	CONTAINER_NOT_SUPPORTED_TranscodeReason TranscodeReason = "ContainerNotSupported"
	VIDEO_CODEC_NOT_SUPPORTED_TranscodeReason TranscodeReason = "VideoCodecNotSupported"
	AUDIO_CODEC_NOT_SUPPORTED_TranscodeReason TranscodeReason = "AudioCodecNotSupported"
	CONTAINER_BITRATE_EXCEEDS_LIMIT_TranscodeReason TranscodeReason = "ContainerBitrateExceedsLimit"
	AUDIO_BITRATE_NOT_SUPPORTED_TranscodeReason TranscodeReason = "AudioBitrateNotSupported"
	AUDIO_CHANNELS_NOT_SUPPORTED_TranscodeReason TranscodeReason = "AudioChannelsNotSupported"
	VIDEO_RESOLUTION_NOT_SUPPORTED_TranscodeReason TranscodeReason = "VideoResolutionNotSupported"
	UNKNOWN_VIDEO_STREAM_INFO_TranscodeReason TranscodeReason = "UnknownVideoStreamInfo"
	UNKNOWN_AUDIO_STREAM_INFO_TranscodeReason TranscodeReason = "UnknownAudioStreamInfo"
	AUDIO_PROFILE_NOT_SUPPORTED_TranscodeReason TranscodeReason = "AudioProfileNotSupported"
	AUDIO_SAMPLE_RATE_NOT_SUPPORTED_TranscodeReason TranscodeReason = "AudioSampleRateNotSupported"
	ANAMORPHIC_VIDEO_NOT_SUPPORTED_TranscodeReason TranscodeReason = "AnamorphicVideoNotSupported"
	INTERLACED_VIDEO_NOT_SUPPORTED_TranscodeReason TranscodeReason = "InterlacedVideoNotSupported"
	SECONDARY_AUDIO_NOT_SUPPORTED_TranscodeReason TranscodeReason = "SecondaryAudioNotSupported"
	REF_FRAMES_NOT_SUPPORTED_TranscodeReason TranscodeReason = "RefFramesNotSupported"
	VIDEO_BIT_DEPTH_NOT_SUPPORTED_TranscodeReason TranscodeReason = "VideoBitDepthNotSupported"
	VIDEO_BITRATE_NOT_SUPPORTED_TranscodeReason TranscodeReason = "VideoBitrateNotSupported"
	VIDEO_FRAMERATE_NOT_SUPPORTED_TranscodeReason TranscodeReason = "VideoFramerateNotSupported"
	VIDEO_LEVEL_NOT_SUPPORTED_TranscodeReason TranscodeReason = "VideoLevelNotSupported"
	VIDEO_PROFILE_NOT_SUPPORTED_TranscodeReason TranscodeReason = "VideoProfileNotSupported"
	AUDIO_BIT_DEPTH_NOT_SUPPORTED_TranscodeReason TranscodeReason = "AudioBitDepthNotSupported"
	SUBTITLE_CODEC_NOT_SUPPORTED_TranscodeReason TranscodeReason = "SubtitleCodecNotSupported"
	DIRECT_PLAY_ERROR_TranscodeReason TranscodeReason = "DirectPlayError"
	VIDEO_RANGE_NOT_SUPPORTED_TranscodeReason TranscodeReason = "VideoRangeNotSupported"
	SUBTITLE_CONTENT_OPTIONS_ENABLED_TranscodeReason TranscodeReason = "SubtitleContentOptionsEnabled"
)
