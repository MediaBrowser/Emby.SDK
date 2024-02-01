/*
 * Emby Server REST API
 *
 * Explore the Emby Server API
 *
 */
package embyclient-rest-go

type SubtitlePlaybackMode string

// List of SubtitlePlaybackMode
const (
	DEFAULT__SubtitlePlaybackMode SubtitlePlaybackMode = "Default"
	ALWAYS_SubtitlePlaybackMode SubtitlePlaybackMode = "Always"
	ONLY_FORCED_SubtitlePlaybackMode SubtitlePlaybackMode = "OnlyForced"
	NONE_SubtitlePlaybackMode SubtitlePlaybackMode = "None"
	SMART_SubtitlePlaybackMode SubtitlePlaybackMode = "Smart"
	HEARING_IMPAIRED_SubtitlePlaybackMode SubtitlePlaybackMode = "HearingImpaired"
)
