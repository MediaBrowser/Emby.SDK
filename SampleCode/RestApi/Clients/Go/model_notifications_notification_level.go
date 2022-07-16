/*
 * Emby Server REST API (BETA)
 *
 * Explore the Emby Server API
 *
 * API version: 4.8.0.6
 */
package embyclient-rest-go

type NotificationsNotificationLevel string

// List of Notifications.NotificationLevel
const (
	NORMAL_NotificationsNotificationLevel NotificationsNotificationLevel = "Normal"
	WARNING_NotificationsNotificationLevel NotificationsNotificationLevel = "Warning"
	ERROR__NotificationsNotificationLevel NotificationsNotificationLevel = "Error"
)
