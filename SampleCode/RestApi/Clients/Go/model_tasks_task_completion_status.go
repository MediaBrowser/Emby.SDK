/*
 * Emby REST API
 *
 * Explore the Emby Server API
 *
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
