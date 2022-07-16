/*
 * Emby Server REST API (BETA)
 *
 * Explore the Emby Server API
 *
 * API version: 4.8.0.5
 */
package embyclient-rest-go

type ConfigurationAccessSchedule struct {
	DayOfWeek *ConfigurationDynamicDayOfWeek `json:"DayOfWeek,omitempty"`
	StartHour float64 `json:"StartHour,omitempty"`
	EndHour float64 `json:"EndHour,omitempty"`
}
