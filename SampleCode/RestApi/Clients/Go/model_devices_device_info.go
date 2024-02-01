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

type DevicesDeviceInfo struct {
	Name string `json:"Name,omitempty"`
	// The identifier.
	Id string `json:"Id,omitempty"`
	InternalId int64 `json:"InternalId,omitempty"`
	ReportedDeviceId string `json:"ReportedDeviceId,omitempty"`
	// The last name of the user.
	LastUserName string `json:"LastUserName,omitempty"`
	// The name of the application.
	AppName string `json:"AppName,omitempty"`
	// The application version.
	AppVersion string `json:"AppVersion,omitempty"`
	// The last user identifier.
	LastUserId string `json:"LastUserId,omitempty"`
	DateLastActivity time.Time `json:"DateLastActivity,omitempty"`
	IconUrl string `json:"IconUrl,omitempty"`
	IpAddress string `json:"IpAddress,omitempty"`
}
