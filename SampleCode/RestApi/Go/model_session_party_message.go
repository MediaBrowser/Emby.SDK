/*
 * Emby Server REST API (BETA)
 *
 * Explore the Emby Server API
 *
 */
package embyclient
import (
	"time"
)

type SessionPartyMessage struct {
	UserId int64 `json:"UserId,omitempty"`
	DateTime time.Time `json:"DateTime,omitempty"`
	Message string `json:"Message,omitempty"`
}
