/*
 * Emby Server REST API (BETA)
 *
 * Explore the Emby Server API
 *
 * API version: 4.8.0.6
 */
package embyclient-rest-go
import (
	"time"
)

type UsersForgotPasswordResult struct {
	Action *UsersForgotPasswordAction `json:"Action,omitempty"`
	PinFile string `json:"PinFile,omitempty"`
	PinExpirationDate time.Time `json:"PinExpirationDate,omitempty"`
}
