/*
 * Emby Server REST API (BETA)
 *
 * Explore the Emby Server API
 *
 */
package embyclient

type SessionPartySessionInfo struct {
	Id string `json:"Id,omitempty"`
	User *UserDto `json:"User,omitempty"`
	IsHost bool `json:"IsHost,omitempty"`
}
