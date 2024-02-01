/*
 * Emby Server REST API
 *
 * Explore the Emby Server API
 *
 */
package embyclient-rest-go
// TaskCompletionStatus : Enum TaskCompletionStatus  
type TaskCompletionStatus string

// List of TaskCompletionStatus
const (
	COMPLETED_TaskCompletionStatus TaskCompletionStatus = "Completed"
	FAILED_TaskCompletionStatus TaskCompletionStatus = "Failed"
	CANCELLED_TaskCompletionStatus TaskCompletionStatus = "Cancelled"
	ABORTED_TaskCompletionStatus TaskCompletionStatus = "Aborted"
)
