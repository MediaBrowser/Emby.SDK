/*
 * Emby Server REST API
 *
 * Explore the Emby Server API
 *
 */
package embyclient-rest-go

type UserNotificationInfo struct {
	NotifierKey string `json:"NotifierKey,omitempty"`
	SetupModuleUrl string `json:"SetupModuleUrl,omitempty"`
	ServiceName string `json:"ServiceName,omitempty"`
	PluginId string `json:"PluginId,omitempty"`
	FriendlyName string `json:"FriendlyName,omitempty"`
	Id string `json:"Id,omitempty"`
	Enabled bool `json:"Enabled,omitempty"`
	// Limit events based on user ids, for admin notifications
	UserIds []string `json:"UserIds,omitempty"`
	DeviceIds []string `json:"DeviceIds,omitempty"`
	LibraryIds []string `json:"LibraryIds,omitempty"`
	EventIds []string `json:"EventIds,omitempty"`
	// Notification intended for a specific user
	UserId string `json:"UserId,omitempty"`
	IsSelfNotification bool `json:"IsSelfNotification,omitempty"`
	GroupItems bool `json:"GroupItems,omitempty"`
	// This is for webhooks since this will cause xml serialization to fail
	Options map[string]string `json:"Options,omitempty"`
}
