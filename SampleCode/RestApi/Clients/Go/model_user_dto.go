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

// Class UserDto  
type UserDto struct {
	// The name.
	Name string `json:"Name,omitempty"`
	// The server identifier.
	ServerId string `json:"ServerId,omitempty"`
	// The name of the server. This is not used by the server and is for client\\-side usage only.
	ServerName string `json:"ServerName,omitempty"`
	Prefix string `json:"Prefix,omitempty"`
	// The name of the connect user.
	ConnectUserName string `json:"ConnectUserName,omitempty"`
	DateCreated time.Time `json:"DateCreated,omitempty"`
	ConnectLinkType *ConnectUserLinkType `json:"ConnectLinkType,omitempty"`
	// The id.
	Id string `json:"Id,omitempty"`
	// The primary image tag.
	PrimaryImageTag string `json:"PrimaryImageTag,omitempty"`
	// A value indicating whether this instance has password.
	HasPassword bool `json:"HasPassword,omitempty"`
	// A value indicating whether this instance has configured password.
	HasConfiguredPassword bool `json:"HasConfiguredPassword,omitempty"`
	EnableAutoLogin bool `json:"EnableAutoLogin,omitempty"`
	// The last login date.
	LastLoginDate time.Time `json:"LastLoginDate,omitempty"`
	// The last activity date.
	LastActivityDate time.Time `json:"LastActivityDate,omitempty"`
	Configuration *UserConfiguration `json:"Configuration,omitempty"`
	Policy *UserPolicy `json:"Policy,omitempty"`
	// The primary image aspect ratio.
	PrimaryImageAspectRatio float64 `json:"PrimaryImageAspectRatio,omitempty"`
	HasConfiguredEasyPassword bool `json:"HasConfiguredEasyPassword,omitempty"`
	UserItemShareLevel *UserItemShareLevel `json:"UserItemShareLevel,omitempty"`
}
