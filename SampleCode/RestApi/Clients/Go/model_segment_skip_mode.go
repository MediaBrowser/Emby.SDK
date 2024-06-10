/*
 * Emby Server REST API (BETA)
 *
 * Explore the Emby Server API
 *
 */
package embyclient

type SegmentSkipMode string

// List of SegmentSkipMode
const (
	SHOW_BUTTON_SegmentSkipMode SegmentSkipMode = "ShowButton"
	AUTO_SKIP_SegmentSkipMode SegmentSkipMode = "AutoSkip"
	NONE_SegmentSkipMode SegmentSkipMode = "None"
)
