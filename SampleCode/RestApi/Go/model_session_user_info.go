/*
 * Emby Server REST API (BETA)
 *
 * Explore the Emby Server API
 *
 */
package embyclient

// Class SessionUserInfo.  
type SessionUserInfo struct {
	// The user identifier.
	UserId string `json:"UserId,omitempty"`
	// The name of the user.
	UserName string `json:"UserName,omitempty"`
	UserInternalId int64 `json:"UserInternalId,omitempty"`
}
