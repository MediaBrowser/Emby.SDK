/*
 * Emby Server REST API (BETA)
 *
 * Explore the Emby Server API
 *
 */
package embyclient

type AuthenticateUserByName struct {
	Username string `json:"Username,omitempty"`
	Pw string `json:"Pw,omitempty"`
}
