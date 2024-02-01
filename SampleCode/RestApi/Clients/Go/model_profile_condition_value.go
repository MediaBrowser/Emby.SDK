/*
 * Emby Server REST API
 *
 * Explore the Emby Server API
 *
 */
package embyclient-rest-go

type ProfileConditionValue string

// List of ProfileConditionValue
const (
	AUDIO_CHANNELS_ProfileConditionValue ProfileConditionValue = "AudioChannels"
	AUDIO_BITRATE_ProfileConditionValue ProfileConditionValue = "AudioBitrate"
	AUDIO_PROFILE_ProfileConditionValue ProfileConditionValue = "AudioProfile"
	WIDTH_ProfileConditionValue ProfileConditionValue = "Width"
	HEIGHT_ProfileConditionValue ProfileConditionValue = "Height"
	HAS64_BIT_OFFSETS_ProfileConditionValue ProfileConditionValue = "Has64BitOffsets"
	PACKET_LENGTH_ProfileConditionValue ProfileConditionValue = "PacketLength"
	VIDEO_BIT_DEPTH_ProfileConditionValue ProfileConditionValue = "VideoBitDepth"
	VIDEO_BITRATE_ProfileConditionValue ProfileConditionValue = "VideoBitrate"
	VIDEO_FRAMERATE_ProfileConditionValue ProfileConditionValue = "VideoFramerate"
	VIDEO_LEVEL_ProfileConditionValue ProfileConditionValue = "VideoLevel"
	VIDEO_PROFILE_ProfileConditionValue ProfileConditionValue = "VideoProfile"
	VIDEO_TIMESTAMP_ProfileConditionValue ProfileConditionValue = "VideoTimestamp"
	IS_ANAMORPHIC_ProfileConditionValue ProfileConditionValue = "IsAnamorphic"
	REF_FRAMES_ProfileConditionValue ProfileConditionValue = "RefFrames"
	NUM_AUDIO_STREAMS_ProfileConditionValue ProfileConditionValue = "NumAudioStreams"
	NUM_VIDEO_STREAMS_ProfileConditionValue ProfileConditionValue = "NumVideoStreams"
	IS_SECONDARY_AUDIO_ProfileConditionValue ProfileConditionValue = "IsSecondaryAudio"
	VIDEO_CODEC_TAG_ProfileConditionValue ProfileConditionValue = "VideoCodecTag"
	IS_AVC_ProfileConditionValue ProfileConditionValue = "IsAvc"
	IS_INTERLACED_ProfileConditionValue ProfileConditionValue = "IsInterlaced"
	AUDIO_SAMPLE_RATE_ProfileConditionValue ProfileConditionValue = "AudioSampleRate"
	AUDIO_BIT_DEPTH_ProfileConditionValue ProfileConditionValue = "AudioBitDepth"
	VIDEO_RANGE_ProfileConditionValue ProfileConditionValue = "VideoRange"
	VIDEO_ROTATION_ProfileConditionValue ProfileConditionValue = "VideoRotation"
)
