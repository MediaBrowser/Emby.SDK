/*
 * Emby Server REST API
 *
 * Explore the Emby Server API
 *
 */
package embyclient-rest-go

type UpdateUserPassword struct {
	Id string `json:"Id,omitempty"`
	NewPw string `json:"NewPw,omitempty"`
	ResetPassword bool `json:"ResetPassword,omitempty"`
}
