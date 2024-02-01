/*
 * Emby Server REST API
 *
 * Explore the Emby Server API
 *
 */
package embyclient-rest-go

type LibrarySubFolder struct {
	Name string `json:"Name,omitempty"`
	Id string `json:"Id,omitempty"`
	Path string `json:"Path,omitempty"`
	IsUserAccessConfigurable bool `json:"IsUserAccessConfigurable,omitempty"`
}
