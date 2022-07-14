/*
 * Emby Server REST API (BETA)
 *
 * Explore the Emby Server API
 *
 * API version: 4.8.0.3
 */
package embyclient-rest-go

type LibraryMediaFolder struct {
	Name string `json:"Name,omitempty"`
	Id string `json:"Id,omitempty"`
	Guid string `json:"Guid,omitempty"`
	SubFolders []LibrarySubFolder `json:"SubFolders,omitempty"`
}
