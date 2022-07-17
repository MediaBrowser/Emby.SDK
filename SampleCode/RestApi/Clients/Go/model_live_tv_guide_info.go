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

type LiveTvGuideInfo struct {
	StartDate time.Time `json:"StartDate,omitempty"`
	EndDate time.Time `json:"EndDate,omitempty"`
}
