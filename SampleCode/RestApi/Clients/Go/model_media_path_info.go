/*
 * Emby Server REST API
 *
 * Explore the Emby Server API
 *
 */
package embyclient-rest-go

type MediaPathInfo struct {
	Path string `json:"Path,omitempty"`
	NetworkPath string `json:"NetworkPath,omitempty"`
	Username string `json:"Username,omitempty"`
	Password string `json:"Password,omitempty"`
}
