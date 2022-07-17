/*
 * Emby Server REST API (BETA)
 *
 * Explore the Emby Server API
 *
 */
package embyclient-rest-go

type ConfigurationAccessSchedule struct {
	DayOfWeek *ConfigurationDynamicDayOfWeek `json:"DayOfWeek,omitempty"`
	StartHour float64 `json:"StartHour,omitempty"`
	EndHour float64 `json:"EndHour,omitempty"`
}
