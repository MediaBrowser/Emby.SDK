/*
 * Emby Server REST API (BETA)
 *
 * Explore the Emby Server API
 *
 * API version: 4.8.0.3
 */
package embyclient-rest-go

type EmbyNotificationsApiNotificationResult struct {
	Notifications []EmbyNotificationsApiNotification `json:"Notifications,omitempty"`
	TotalRecordCount int32 `json:"TotalRecordCount,omitempty"`
}
