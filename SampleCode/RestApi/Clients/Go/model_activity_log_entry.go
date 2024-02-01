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

type ActivityLogEntry struct {
	// The identifier.
	Id int64 `json:"Id,omitempty"`
	// The name.
	Name string `json:"Name,omitempty"`
	// The overview.
	Overview string `json:"Overview,omitempty"`
	// The short overview.
	ShortOverview string `json:"ShortOverview,omitempty"`
	// The type.
	Type_ string `json:"Type,omitempty"`
	// The item identifier.
	ItemId string `json:"ItemId,omitempty"`
	// The date.
	Date time.Time `json:"Date,omitempty"`
	// The user identifier.
	UserId string `json:"UserId,omitempty"`
	// The user primary image tag.
	UserPrimaryImageTag string `json:"UserPrimaryImageTag,omitempty"`
	Severity *LoggingLogSeverity `json:"Severity,omitempty"`
}
