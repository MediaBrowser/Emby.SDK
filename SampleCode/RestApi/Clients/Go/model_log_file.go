/*
 * Emby Server REST API (BETA)
 *
 * Explore the Emby Server API
 *
 */
package embyclient-rest-go
import (
	"time"
)

type LogFile struct {
	DateCreated time.Time `json:"DateCreated,omitempty"`
	DateModified time.Time `json:"DateModified,omitempty"`
	Size int64 `json:"Size,omitempty"`
	Name string `json:"Name,omitempty"`
}
