/*
 * Emby Server REST API
 *
 * Explore the Emby Server API
 *
 */
package embyclient-rest-go

type LiveTvTimerType string

// List of LiveTv.TimerType
const (
	PROGRAM_LiveTvTimerType LiveTvTimerType = "Program"
	DATE_TIME_LiveTvTimerType LiveTvTimerType = "DateTime"
	KEYWORD_LiveTvTimerType LiveTvTimerType = "Keyword"
)
