/*
 * Emby REST API
 *
 * Explore the Emby Server API
 *
 */
package embyclient-rest-go

type NotificationsNotificationLevel string

// List of Notifications.NotificationLevel
const (
	NORMAL_NotificationsNotificationLevel NotificationsNotificationLevel = "Normal"
	WARNING_NotificationsNotificationLevel NotificationsNotificationLevel = "Warning"
	ERROR__NotificationsNotificationLevel NotificationsNotificationLevel = "Error"
)
