/*
 * Emby Server REST API (BETA)
 *
 * Explore the Emby Server API
 *
 */
package embyclient

type CopyData struct {
	UserId string `json:"UserId,omitempty"`
	ToUserIds []string `json:"ToUserIds,omitempty"`
	CopyOptions []LibraryUserCopyOptions `json:"CopyOptions,omitempty"`
}
