/*
 * Emby Server REST API
 *
 * Explore the Emby Server API
 *
 */
package embyclient-rest-go

type ValidatePath struct {
	ValidateWriteable bool `json:"ValidateWriteable,omitempty"`
	IsFile bool `json:"IsFile,omitempty"`
	Username string `json:"Username,omitempty"`
	Password string `json:"Password,omitempty"`
}
