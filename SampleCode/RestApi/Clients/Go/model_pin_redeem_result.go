/*
 * Emby Server REST API
 *
 * Explore the Emby Server API
 *
 */
package embyclient-rest-go

type PinRedeemResult struct {
	// A value indicating whether this `MediaBrowser.Model.Users.PinRedeemResult` is success.
	Success bool `json:"Success,omitempty"`
	// The users reset.
	UsersReset []string `json:"UsersReset,omitempty"`
}
