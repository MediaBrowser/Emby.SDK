/*
 * Emby Server REST API
 *
 * Explore the Emby Server API
 *
 */
package embyclient-rest-go
import (
	"time"
)

// Class TaskExecutionInfo  
type TaskResult struct {
	// The start time UTC.
	StartTimeUtc time.Time `json:"StartTimeUtc,omitempty"`
	// The end time UTC.
	EndTimeUtc time.Time `json:"EndTimeUtc,omitempty"`
	Status *TaskCompletionStatus `json:"Status,omitempty"`
	// The name.
	Name string `json:"Name,omitempty"`
	// The key.
	Key string `json:"Key,omitempty"`
	// The id.
	Id string `json:"Id,omitempty"`
	// The error message.
	ErrorMessage string `json:"ErrorMessage,omitempty"`
	// The long error message.
	LongErrorMessage string `json:"LongErrorMessage,omitempty"`
}
