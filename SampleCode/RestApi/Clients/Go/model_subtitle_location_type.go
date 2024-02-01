/*
 * Emby Server REST API
 *
 * Explore the Emby Server API
 *
 */
package embyclient-rest-go

type SubtitleLocationType string

// List of SubtitleLocationType
const (
	INTERNAL_STREAM_SubtitleLocationType SubtitleLocationType = "InternalStream"
	VIDEO_SIDE_DATA_SubtitleLocationType SubtitleLocationType = "VideoSideData"
)
