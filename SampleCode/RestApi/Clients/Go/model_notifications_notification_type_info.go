/*
 * Emby REST API
 *
 * Explore the Emby Server API
 *
 */
package embyclient-rest-go

type NotificationsNotificationTypeInfo struct {
	Type_ string `json:"Type,omitempty"`
	Name string `json:"Name,omitempty"`
	Enabled bool `json:"Enabled,omitempty"`
	Category string `json:"Category,omitempty"`
	IsBasedOnUserEvent bool `json:"IsBasedOnUserEvent,omitempty"`
}
