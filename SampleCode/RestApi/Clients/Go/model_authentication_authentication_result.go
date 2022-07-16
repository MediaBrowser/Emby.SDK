/*
 * Emby Server REST API (BETA)
 *
 * Explore the Emby Server API
 *
 * API version: 4.8.0.5
 */
package embyclient-rest-go

type AuthenticationAuthenticationResult struct {
	User *UserDto `json:"User,omitempty"`
	SessionInfo *SessionSessionInfo `json:"SessionInfo,omitempty"`
	AccessToken string `json:"AccessToken,omitempty"`
	ServerId string `json:"ServerId,omitempty"`
}
