/*
 * Emby Server REST API (BETA)
 *
 * Explore the Emby Server API
 *
 * API version: 4.8.0.5
 */
package embyclient-rest-go

type SubtitleLocationType string

// List of SubtitleLocationType
const (
	INTERNAL_STREAM_SubtitleLocationType SubtitleLocationType = "InternalStream"
	VIDEO_SIDE_DATA_SubtitleLocationType SubtitleLocationType = "VideoSideData"
)
