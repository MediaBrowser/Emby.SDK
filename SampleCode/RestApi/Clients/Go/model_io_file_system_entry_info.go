/*
 * Emby REST API
 *
 * Explore the Emby Server API
 *
 */
package embyclient-rest-go

type IoFileSystemEntryInfo struct {
	Name string `json:"Name,omitempty"`
	Path string `json:"Path,omitempty"`
	Type_ *IoFileSystemEntryType `json:"Type,omitempty"`
}
