/*
 * Emby Server REST API (BETA)
 *
 * Explore the Emby Server API
 *
 * API version: 4.8.0.6
 */
package embyclient-rest-go

type DevicesLocalFileInfo struct {
	Name string `json:"Name,omitempty"`
	Id string `json:"Id,omitempty"`
	Album string `json:"Album,omitempty"`
	MimeType string `json:"MimeType,omitempty"`
}
