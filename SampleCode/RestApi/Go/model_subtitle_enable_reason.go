/*
 * Emby Server REST API (BETA)
 *
 * Explore the Emby Server API
 *
 */
package embyclient

type SubtitleEnableReason string

// List of SubtitleEnableReason
const (
	USER_ENABLED_SubtitleEnableReason SubtitleEnableReason = "UserEnabled"
	SKIP_BACK_SubtitleEnableReason SubtitleEnableReason = "SkipBack"
	LOW_VOLUME_SubtitleEnableReason SubtitleEnableReason = "LowVolume"
)
