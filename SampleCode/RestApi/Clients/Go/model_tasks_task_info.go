/*
 * Emby Server REST API (BETA)
 *
 * Explore the Emby Server API
 *
 * API version: 4.8.0.3
 */
package embyclient-rest-go

type TasksTaskInfo struct {
	Name string `json:"Name,omitempty"`
	State *TasksTaskState `json:"State,omitempty"`
	CurrentProgressPercentage float64 `json:"CurrentProgressPercentage,omitempty"`
	Id string `json:"Id,omitempty"`
	LastExecutionResult *TasksTaskResult `json:"LastExecutionResult,omitempty"`
	Triggers []TasksTaskTriggerInfo `json:"Triggers,omitempty"`
	Description string `json:"Description,omitempty"`
	Category string `json:"Category,omitempty"`
	IsHidden bool `json:"IsHidden,omitempty"`
	Key string `json:"Key,omitempty"`
}
