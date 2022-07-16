/*
 * Emby Server REST API (BETA)
 *
 * Explore the Emby Server API
 *
 * API version: 4.8.0.5
 */
package embyclient-rest-go

type LiveTvTimerType string

// List of LiveTv.TimerType
const (
	PROGRAM_LiveTvTimerType LiveTvTimerType = "Program"
	DATE_TIME_LiveTvTimerType LiveTvTimerType = "DateTime"
	KEYWORD_LiveTvTimerType LiveTvTimerType = "Keyword"
)
