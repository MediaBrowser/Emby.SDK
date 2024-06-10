/*
 * Emby Server REST API (BETA)
 *
 * Explore the Emby Server API
 *
 */
package embyclient

type RepeatMode string

// List of RepeatMode
const (
	REPEAT_NONE_RepeatMode RepeatMode = "RepeatNone"
	REPEAT_ALL_RepeatMode RepeatMode = "RepeatAll"
	REPEAT_ONE_RepeatMode RepeatMode = "RepeatOne"
)
