/*
 * Emby Server REST API (BETA)
 *
 * Explore the Emby Server API
 *
 * API version: 4.8.0.6
 */
package embyclient-rest-go

type AuthenticateUserByName struct {
	Username string `json:"Username,omitempty"`
	Pw string `json:"Pw,omitempty"`
}
