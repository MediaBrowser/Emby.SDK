/*
 * Emby Server REST API (BETA)
 *
 * Explore the Emby Server API
 *
 * API version: 4.8.0.6
 */
package embyclient-rest-go

type UpdateUserPassword struct {
	Id string `json:"Id,omitempty"`
	CurrentPw string `json:"CurrentPw,omitempty"`
	NewPw string `json:"NewPw,omitempty"`
	ResetPassword bool `json:"ResetPassword,omitempty"`
}
