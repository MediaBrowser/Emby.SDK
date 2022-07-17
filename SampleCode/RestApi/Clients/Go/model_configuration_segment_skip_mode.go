/*
 * Emby Server REST API (BETA)
 *
 * Explore the Emby Server API
 *
 */
package embyclient-rest-go

type ConfigurationSegmentSkipMode string

// List of Configuration.SegmentSkipMode
const (
	SHOW_BUTTON_ConfigurationSegmentSkipMode ConfigurationSegmentSkipMode = "ShowButton"
	AUTO_SKIP_ConfigurationSegmentSkipMode ConfigurationSegmentSkipMode = "AutoSkip"
	NONE_ConfigurationSegmentSkipMode ConfigurationSegmentSkipMode = "None"
)
