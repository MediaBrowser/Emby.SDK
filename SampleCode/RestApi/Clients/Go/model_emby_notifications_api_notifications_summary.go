/*
 * Emby Server REST API (BETA)
 *
 * Explore the Emby Server API
 *
 */
package embyclient-rest-go

type EmbyNotificationsApiNotificationsSummary struct {
	UnreadCount int32 `json:"UnreadCount,omitempty"`
	MaxUnreadNotificationLevel *NotificationsNotificationLevel `json:"MaxUnreadNotificationLevel,omitempty"`
}
