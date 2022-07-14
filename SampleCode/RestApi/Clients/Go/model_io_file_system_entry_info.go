/*
 * Emby Server REST API (BETA)
 *
 * Explore the Emby Server API
 *
 * API version: 4.8.0.3
 */
package embyclient-rest-go

type IoFileSystemEntryInfo struct {
	Name string `json:"Name,omitempty"`
	Path string `json:"Path,omitempty"`
	Type_ *IoFileSystemEntryType `json:"Type,omitempty"`
}
