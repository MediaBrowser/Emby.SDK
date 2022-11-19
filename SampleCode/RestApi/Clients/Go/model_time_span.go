/*
 * Emby Server REST API (BETA)
 *
 * Explore the Emby Server API
 *
 */
package embyclient-rest-go

type TimeSpan struct {
	Ticks int64 `json:"Ticks,omitempty"`
	Days int32 `json:"Days,omitempty"`
	Hours int32 `json:"Hours,omitempty"`
	Milliseconds int32 `json:"Milliseconds,omitempty"`
	Minutes int32 `json:"Minutes,omitempty"`
	Seconds int32 `json:"Seconds,omitempty"`
	TotalDays float64 `json:"TotalDays,omitempty"`
	TotalHours float64 `json:"TotalHours,omitempty"`
	TotalMilliseconds float64 `json:"TotalMilliseconds,omitempty"`
	TotalMinutes float64 `json:"TotalMinutes,omitempty"`
	TotalSeconds float64 `json:"TotalSeconds,omitempty"`
}
