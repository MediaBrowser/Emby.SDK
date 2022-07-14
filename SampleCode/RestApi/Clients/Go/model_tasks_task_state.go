/*
 * Emby Server REST API (BETA)
 *
 * Explore the Emby Server API
 *
 * API version: 4.8.0.3
 */
package embyclient-rest-go

type TasksTaskState string

// List of Tasks.TaskState
const (
	IDLE_TasksTaskState TasksTaskState = "Idle"
	CANCELLING_TasksTaskState TasksTaskState = "Cancelling"
	RUNNING_TasksTaskState TasksTaskState = "Running"
)
