/*
 * Emby Server REST API (BETA)
 *
 * Explore the Emby Server API
 *
 * API version: 4.8.0.6
 */
package embyclient-rest-go

type LibrarySubFolder struct {
	Name string `json:"Name,omitempty"`
	Id string `json:"Id,omitempty"`
	Path string `json:"Path,omitempty"`
}