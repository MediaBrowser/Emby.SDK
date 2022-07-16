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

type UserDto struct {
	Name string `json:"Name,omitempty"`
	ServerId string `json:"ServerId,omitempty"`
	ServerName string `json:"ServerName,omitempty"`
	Prefix string `json:"Prefix,omitempty"`
	ConnectUserName string `json:"ConnectUserName,omitempty"`
	DateCreated time.Time `json:"DateCreated,omitempty"`
	ConnectLinkType *ConnectUserLinkType `json:"ConnectLinkType,omitempty"`
	Id string `json:"Id,omitempty"`
	PrimaryImageTag string `json:"PrimaryImageTag,omitempty"`
	HasPassword bool `json:"HasPassword,omitempty"`
	HasConfiguredPassword bool `json:"HasConfiguredPassword,omitempty"`
	HasConfiguredEasyPassword bool `json:"HasConfiguredEasyPassword,omitempty"`
	EnableAutoLogin bool `json:"EnableAutoLogin,omitempty"`
	LastLoginDate time.Time `json:"LastLoginDate,omitempty"`
	LastActivityDate time.Time `json:"LastActivityDate,omitempty"`
	Configuration *ConfigurationUserConfiguration `json:"Configuration,omitempty"`
	Policy *UsersUserPolicy `json:"Policy,omitempty"`
	PrimaryImageAspectRatio float64 `json:"PrimaryImageAspectRatio,omitempty"`
}
