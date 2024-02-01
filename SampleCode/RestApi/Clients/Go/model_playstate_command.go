/*
 * Emby Server REST API
 *
 * Explore the Emby Server API
 *
 */
package embyclient-rest-go
// PlaystateCommand : Enum PlaystateCommand  
type PlaystateCommand string

// List of PlaystateCommand
const (
	STOP_PlaystateCommand PlaystateCommand = "Stop"
	PAUSE_PlaystateCommand PlaystateCommand = "Pause"
	UNPAUSE_PlaystateCommand PlaystateCommand = "Unpause"
	NEXT_TRACK_PlaystateCommand PlaystateCommand = "NextTrack"
	PREVIOUS_TRACK_PlaystateCommand PlaystateCommand = "PreviousTrack"
	SEEK_PlaystateCommand PlaystateCommand = "Seek"
	REWIND_PlaystateCommand PlaystateCommand = "Rewind"
	FAST_FORWARD_PlaystateCommand PlaystateCommand = "FastForward"
	PLAY_PAUSE_PlaystateCommand PlaystateCommand = "PlayPause"
	SEEK_RELATIVE_PlaystateCommand PlaystateCommand = "SeekRelative"
)
