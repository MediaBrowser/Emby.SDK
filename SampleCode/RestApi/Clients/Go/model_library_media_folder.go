/*
 * Emby Server REST API
 *
 * Explore the Emby Server API
 *
 */
package embyclient-rest-go

type LibraryMediaFolder struct {
	Name string `json:"Name,omitempty"`
	Id string `json:"Id,omitempty"`
	Guid string `json:"Guid,omitempty"`
	SubFolders []LibrarySubFolder `json:"SubFolders,omitempty"`
	IsUserAccessConfigurable bool `json:"IsUserAccessConfigurable,omitempty"`
}
