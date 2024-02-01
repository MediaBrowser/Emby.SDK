/*
 * Emby Server REST API
 *
 * Explore the Emby Server API
 *
 */
package embyclient-rest-go

// Class TaskInfo  
type TaskInfo struct {
	// The name.
	Name string `json:"Name,omitempty"`
	State *TaskState `json:"State,omitempty"`
	// The progress.
	CurrentProgressPercentage float64 `json:"CurrentProgressPercentage,omitempty"`
	// The id.
	Id string `json:"Id,omitempty"`
	LastExecutionResult *TaskResult `json:"LastExecutionResult,omitempty"`
	// The triggers.
	Triggers []TaskTriggerInfo `json:"Triggers,omitempty"`
	// The description.
	Description string `json:"Description,omitempty"`
	// The category.
	Category string `json:"Category,omitempty"`
	// A value indicating whether this instance is hidden.
	IsHidden bool `json:"IsHidden,omitempty"`
	// The key.
	Key string `json:"Key,omitempty"`
}
