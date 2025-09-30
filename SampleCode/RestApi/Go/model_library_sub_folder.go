/*
 * Emby Server REST API (BETA)
 *
 * Explore the Emby Server API
 *
 */
package embyclient

type LibrarySubFolder struct {
	Name string `json:"Name,omitempty"`
	Id string `json:"Id,omitempty"`
	Path string `json:"Path,omitempty"`
	IsUserAccessConfigurable bool `json:"IsUserAccessConfigurable,omitempty"`
}
