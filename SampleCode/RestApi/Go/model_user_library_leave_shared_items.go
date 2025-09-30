/*
 * Emby Server REST API (BETA)
 *
 * Explore the Emby Server API
 *
 */
package embyclient

type UserLibraryLeaveSharedItems struct {
	ItemIds []string `json:"ItemIds,omitempty"`
	UserId string `json:"UserId,omitempty"`
}
