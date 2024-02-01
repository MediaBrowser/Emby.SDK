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

type ForgotPasswordResult struct {
	Action *ForgotPasswordAction `json:"Action,omitempty"`
	// The pin file.
	PinFile string `json:"PinFile,omitempty"`
	// The pin expiration date.
	PinExpirationDate time.Time `json:"PinExpirationDate,omitempty"`
}
