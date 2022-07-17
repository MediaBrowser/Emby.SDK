/*
 * Emby Server REST API (BETA)
 *
 * Explore the Emby Server API
 *
 */
package embyclient-rest-go

type TasksTaskState string

// List of Tasks.TaskState
const (
	IDLE_TasksTaskState TasksTaskState = "Idle"
	CANCELLING_TasksTaskState TasksTaskState = "Cancelling"
	RUNNING_TasksTaskState TasksTaskState = "Running"
)
