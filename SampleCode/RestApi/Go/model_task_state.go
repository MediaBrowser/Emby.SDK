/*
 * Emby Server REST API (BETA)
 *
 * Explore the Emby Server API
 *
 */
package embyclient
// TaskState : Enum TaskState  
type TaskState string

// List of TaskState
const (
	IDLE_TaskState TaskState = "Idle"
	CANCELLING_TaskState TaskState = "Cancelling"
	RUNNING_TaskState TaskState = "Running"
)
