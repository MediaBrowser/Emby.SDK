/*
 * Emby Server REST API
 *
 * Explore the Emby Server API
 *
 */
package embyclient-rest-go

type AccessSchedule struct {
	DayOfWeek *DynamicDayOfWeek `json:"DayOfWeek,omitempty"`
	// The start hour.
	StartHour float64 `json:"StartHour,omitempty"`
	// The end hour.
	EndHour float64 `json:"EndHour,omitempty"`
}
