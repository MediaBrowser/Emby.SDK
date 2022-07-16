/*
 * Emby Server REST API (BETA)
 *
 * Explore the Emby Server API
 *
 * API version: 4.8.0.5
 */
package embyclient-rest-go

type UsersPinRedeemResult struct {
	Success bool `json:"Success,omitempty"`
	UsersReset []string `json:"UsersReset,omitempty"`
}
