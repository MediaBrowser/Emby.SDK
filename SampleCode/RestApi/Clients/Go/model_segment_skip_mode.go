/*
 * Emby Server REST API
 *
 * Explore the Emby Server API
 *
 */
package embyclient-rest-go

type SegmentSkipMode string

// List of SegmentSkipMode
const (
	SHOW_BUTTON_SegmentSkipMode SegmentSkipMode = "ShowButton"
	AUTO_SKIP_SegmentSkipMode SegmentSkipMode = "AutoSkip"
	NONE_SegmentSkipMode SegmentSkipMode = "None"
)
