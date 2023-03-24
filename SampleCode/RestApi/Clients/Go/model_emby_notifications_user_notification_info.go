/*
 * Emby Server REST API (BETA)
 *
 * Explore the Emby Server API
 *
 */
package embyclient-rest-go

type EmbyNotificationsUserNotificationInfo struct {
	NotifierKey string `json:"NotifierKey,omitempty"`
	SetupModuleUrl string `json:"SetupModuleUrl,omitempty"`
	ServiceName string `json:"ServiceName,omitempty"`
	FriendlyName string `json:"FriendlyName,omitempty"`
	Id string `json:"Id,omitempty"`
	Enabled bool `json:"Enabled,omitempty"`
	UserIds []string `json:"UserIds,omitempty"`
	LibraryIds []string `json:"LibraryIds,omitempty"`
	EventIds []string `json:"EventIds,omitempty"`
	UserId string `json:"UserId,omitempty"`
	IsSelfNotification bool `json:"IsSelfNotification,omitempty"`
	Options map[string]string `json:"Options,omitempty"`
}
