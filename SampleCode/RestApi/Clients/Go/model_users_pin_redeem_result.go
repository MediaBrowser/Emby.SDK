/*
 * Emby REST API
 *
 * Explore the Emby Server API
 *
 */
package embyclient-rest-go

type UsersPinRedeemResult struct {
	Success bool `json:"Success,omitempty"`
	UsersReset []string `json:"UsersReset,omitempty"`
}
