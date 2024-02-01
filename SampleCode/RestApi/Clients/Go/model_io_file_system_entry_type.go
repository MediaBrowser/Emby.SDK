/*
 * Emby Server REST API
 *
 * Explore the Emby Server API
 *
 */
package embyclient-rest-go
// IoFileSystemEntryType : Enum FileSystemEntryType  
type IoFileSystemEntryType string

// List of IO.FileSystemEntryType
const (
	FILE_IoFileSystemEntryType IoFileSystemEntryType = "File"
	DIRECTORY_IoFileSystemEntryType IoFileSystemEntryType = "Directory"
	NETWORK_COMPUTER_IoFileSystemEntryType IoFileSystemEntryType = "NetworkComputer"
	NETWORK_SHARE_IoFileSystemEntryType IoFileSystemEntryType = "NetworkShare"
)
