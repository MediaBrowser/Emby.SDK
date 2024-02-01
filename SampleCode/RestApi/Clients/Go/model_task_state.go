/*
 * Emby Server REST API
 *
 * Explore the Emby Server API
 *
 */
package embyclient-rest-go
// TaskState : Enum TaskState  
type TaskState string

// List of TaskState
const (
	IDLE_TaskState TaskState = "Idle"
	CANCELLING_TaskState TaskState = "Cancelling"
	RUNNING_TaskState TaskState = "Running"
)
