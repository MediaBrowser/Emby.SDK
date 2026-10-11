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
	DateTime time.Time `json:"DateTime,omitempty"`
	MessageTranslationKey string `json:"MessageTranslationKey,omitempty"`
	MessageTranslationArguments []string `json:"MessageTranslationArguments,omitempty"`
	Message string `json:"Message,omitempty"`
	UserId int64 `json:"UserId,omitempty"`
	User *UserDto `json:"User,omitempty"`
}
