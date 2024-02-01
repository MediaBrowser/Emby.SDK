/*
 * Emby Server REST API
 *
 * Explore the Emby Server API
 *
 */
package embyclient-rest-go

// Class FileSystemEntryInfo  
type IoFileSystemEntryInfo struct {
	// The name.
	Name string `json:"Name,omitempty"`
	// The path.
	Path string `json:"Path,omitempty"`
	Type_ *IoFileSystemEntryType `json:"Type,omitempty"`
}
