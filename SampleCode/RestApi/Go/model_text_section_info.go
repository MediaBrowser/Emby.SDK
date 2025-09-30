/*
 * Emby Server REST API (BETA)
 *
 * Explore the Emby Server API
 *
 */
package embyclient

type TextSectionInfo struct {
	Text string `json:"Text,omitempty"`
	Name string `json:"Name,omitempty"`
	Id string `json:"Id,omitempty"`
	Level *NotificationsNotificationLevel `json:"Level,omitempty"`
}
