/*
 * Emby Server REST API
 *
 * Explore the Emby Server API
 *
 */
package embyclient

type CopyData struct {
	UserId string `json:"UserId,omitempty"`
	ToUserIds []string `json:"ToUserIds,omitempty"`
	CopyOptions []string `json:"CopyOptions,omitempty"`
}
