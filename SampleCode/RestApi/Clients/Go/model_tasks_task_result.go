/*
 * Emby Server REST API (BETA)
 *
 * Explore the Emby Server API
 *
 * API version: 4.8.0.5
 */
package embyclient-rest-go
import (
	"time"
)

type TasksTaskResult struct {
	StartTimeUtc time.Time `json:"StartTimeUtc,omitempty"`
	EndTimeUtc time.Time `json:"EndTimeUtc,omitempty"`
	Status *TasksTaskCompletionStatus `json:"Status,omitempty"`
	Name string `json:"Name,omitempty"`
	Key string `json:"Key,omitempty"`
	Id string `json:"Id,omitempty"`
	ErrorMessage string `json:"ErrorMessage,omitempty"`
	LongErrorMessage string `json:"LongErrorMessage,omitempty"`
}
