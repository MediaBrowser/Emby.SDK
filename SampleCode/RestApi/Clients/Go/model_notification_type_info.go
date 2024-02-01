/*
 * Emby Server REST API
 *
 * Explore the Emby Server API
 *
 */
package embyclient-rest-go

type NotificationTypeInfo struct {
	Name string `json:"Name,omitempty"`
	Id string `json:"Id,omitempty"`
	CategoryName string `json:"CategoryName,omitempty"`
	CategoryId string `json:"CategoryId,omitempty"`
}
