/*
 * Emby Server REST API (BETA)
 *
 * Explore the Emby Server API
 *
 * API version: 4.8.0.5
 */
package embyclient-rest-go

type TasksTaskCompletionStatus string

// List of Tasks.TaskCompletionStatus
const (
	COMPLETED_TasksTaskCompletionStatus TasksTaskCompletionStatus = "Completed"
	FAILED_TasksTaskCompletionStatus TasksTaskCompletionStatus = "Failed"
	CANCELLED_TasksTaskCompletionStatus TasksTaskCompletionStatus = "Cancelled"
	ABORTED_TasksTaskCompletionStatus TasksTaskCompletionStatus = "Aborted"
)
