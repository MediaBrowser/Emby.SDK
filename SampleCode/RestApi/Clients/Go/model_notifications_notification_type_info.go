/*
 * Emby Server REST API (BETA)
 *
 * Explore the Emby Server API
 *
 * API version: 4.8.0.6
 */
package embyclient-rest-go

type NotificationsNotificationTypeInfo struct {
	Type_ string `json:"Type,omitempty"`
	Name string `json:"Name,omitempty"`
	Enabled bool `json:"Enabled,omitempty"`
	Category string `json:"Category,omitempty"`
	IsBasedOnUserEvent bool `json:"IsBasedOnUserEvent,omitempty"`
}
