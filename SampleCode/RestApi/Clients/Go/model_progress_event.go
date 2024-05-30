/*
 * Emby Server REST API
 *
 * Explore the Emby Server API
 *
 */
package embyclient-rest-go

type ProgressEvent string

// List of ProgressEvent
const (
	TIME_UPDATE_ProgressEvent ProgressEvent = "TimeUpdate"
	PAUSE_ProgressEvent ProgressEvent = "Pause"
	UNPAUSE_ProgressEvent ProgressEvent = "Unpause"
	VOLUME_CHANGE_ProgressEvent ProgressEvent = "VolumeChange"
	REPEAT_MODE_CHANGE_ProgressEvent ProgressEvent = "RepeatModeChange"
	AUDIO_TRACK_CHANGE_ProgressEvent ProgressEvent = "AudioTrackChange"
	SUBTITLE_TRACK_CHANGE_ProgressEvent ProgressEvent = "SubtitleTrackChange"
	PLAYLIST_ITEM_MOVE_ProgressEvent ProgressEvent = "PlaylistItemMove"
	PLAYLIST_ITEM_REMOVE_ProgressEvent ProgressEvent = "PlaylistItemRemove"
	PLAYLIST_ITEM_ADD_ProgressEvent ProgressEvent = "PlaylistItemAdd"
	QUALITY_CHANGE_ProgressEvent ProgressEvent = "QualityChange"
	STATE_CHANGE_ProgressEvent ProgressEvent = "StateChange"
	SUBTITLE_OFFSET_CHANGE_ProgressEvent ProgressEvent = "SubtitleOffsetChange"
	PLAYBACK_RATE_CHANGE_ProgressEvent ProgressEvent = "PlaybackRateChange"
	SHUFFLE_CHANGE_ProgressEvent ProgressEvent = "ShuffleChange"
)
