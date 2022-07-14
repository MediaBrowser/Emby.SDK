/*
 * Emby Server REST API (BETA)
 *
 * Explore the Emby Server API
 *
 * API version: 4.8.0.3
 */
package embyclient-rest-go

type SessionUserInfo struct {
	UserId string `json:"UserId,omitempty"`
	UserName string `json:"UserName,omitempty"`
	UserInternalId int64 `json:"UserInternalId,omitempty"`
}
