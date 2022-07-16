/*
 * Emby Server REST API (BETA)
 *
 * Explore the Emby Server API
 *
 * API version: 4.8.0.6
 */
package embyclient-rest-go

type ConfigurationSubtitlePlaybackMode string

// List of Configuration.SubtitlePlaybackMode
const (
	DEFAULT__ConfigurationSubtitlePlaybackMode ConfigurationSubtitlePlaybackMode = "Default"
	ALWAYS_ConfigurationSubtitlePlaybackMode ConfigurationSubtitlePlaybackMode = "Always"
	ONLY_FORCED_ConfigurationSubtitlePlaybackMode ConfigurationSubtitlePlaybackMode = "OnlyForced"
	NONE_ConfigurationSubtitlePlaybackMode ConfigurationSubtitlePlaybackMode = "None"
	SMART_ConfigurationSubtitlePlaybackMode ConfigurationSubtitlePlaybackMode = "Smart"
)
