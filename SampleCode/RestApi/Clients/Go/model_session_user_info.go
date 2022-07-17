/*
 * Emby Server REST API (BETA)
 *
 * Explore the Emby Server API
 *
 */
package embyclient-rest-go

type SessionUserInfo struct {
	UserId string `json:"UserId,omitempty"`
	UserName string `json:"UserName,omitempty"`
	UserInternalId int64 `json:"UserInternalId,omitempty"`
}
