/*
 * Emby Server REST API (BETA)
 *
 * Explore the Emby Server API
 *
 * API version: 4.8.0.6
 */
package embyclient-rest-go

type LibraryRenameVirtualFolder struct {
	Id string `json:"Id,omitempty"`
	NewName string `json:"NewName,omitempty"`
}
