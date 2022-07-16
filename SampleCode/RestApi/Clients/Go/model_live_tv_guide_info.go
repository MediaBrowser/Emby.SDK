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

type LiveTvGuideInfo struct {
	StartDate time.Time `json:"StartDate,omitempty"`
	EndDate time.Time `json:"EndDate,omitempty"`
}
