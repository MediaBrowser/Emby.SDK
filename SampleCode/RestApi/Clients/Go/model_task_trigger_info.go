/*
 * Emby Server REST API
 *
 * Explore the Emby Server API
 *
 */
package embyclient-rest-go

// Class TaskTriggerInfo  
type TaskTriggerInfo struct {
	// The type.
	Type_ string `json:"Type,omitempty"`
	// The time of day.
	TimeOfDayTicks int64 `json:"TimeOfDayTicks,omitempty"`
	// The interval.
	IntervalTicks int64 `json:"IntervalTicks,omitempty"`
	SystemEvent *SystemEvent `json:"SystemEvent,omitempty"`
	DayOfWeek *DayOfWeek `json:"DayOfWeek,omitempty"`
	// The maximum runtime ticks.
	MaxRuntimeTicks int64 `json:"MaxRuntimeTicks,omitempty"`
}
