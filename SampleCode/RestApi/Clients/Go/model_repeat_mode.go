/*
 * Emby Server REST API
 *
 * Explore the Emby Server API
 *
 */
package embyclient-rest-go

type RepeatMode string

// List of RepeatMode
const (
	REPEAT_NONE_RepeatMode RepeatMode = "RepeatNone"
	REPEAT_ALL_RepeatMode RepeatMode = "RepeatAll"
	REPEAT_ONE_RepeatMode RepeatMode = "RepeatOne"
)
