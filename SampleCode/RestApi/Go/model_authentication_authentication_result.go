/*
 * Emby Server REST API (BETA)
 *
 * Explore the Emby Server API
 *
 */
package embyclient

type AuthenticationAuthenticationResult struct {
	User *UserDto `json:"User,omitempty"`
	SessionInfo *SessionSessionInfo `json:"SessionInfo,omitempty"`
	// The authentication token.
	AccessToken string `json:"AccessToken,omitempty"`
	// The server identifier.
	ServerId string `json:"ServerId,omitempty"`
}
