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

type LogFile struct {
	// The date created.
	DateCreated time.Time `json:"DateCreated,omitempty"`
	// The date modified.
	DateModified time.Time `json:"DateModified,omitempty"`
	// The size.
	Size int64 `json:"Size,omitempty"`
	// The name.
	Name string `json:"Name,omitempty"`
}
