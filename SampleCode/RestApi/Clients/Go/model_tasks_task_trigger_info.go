/*
 * Emby REST API
 *
 * Explore the Emby Server API
 *
 */
package embyclient-rest-go

type TasksTaskTriggerInfo struct {
	Type_ string `json:"Type,omitempty"`
	TimeOfDayTicks int64 `json:"TimeOfDayTicks,omitempty"`
	IntervalTicks int64 `json:"IntervalTicks,omitempty"`
	SystemEvent *TasksSystemEvent `json:"SystemEvent,omitempty"`
	DayOfWeek *DayOfWeek `json:"DayOfWeek,omitempty"`
	MaxRuntimeTicks int64 `json:"MaxRuntimeTicks,omitempty"`
}
