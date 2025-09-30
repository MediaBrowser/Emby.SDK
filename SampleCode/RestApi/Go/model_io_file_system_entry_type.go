/*
 * Emby Server REST API (BETA)
 *
 * Explore the Emby Server API
 *
 */
package embyclient
// IoFileSystemEntryType : Enum FileSystemEntryType  
type IoFileSystemEntryType string

// List of IO.FileSystemEntryType
const (
	FILE_IoFileSystemEntryType IoFileSystemEntryType = "File"
	DIRECTORY_IoFileSystemEntryType IoFileSystemEntryType = "Directory"
	NETWORK_COMPUTER_IoFileSystemEntryType IoFileSystemEntryType = "NetworkComputer"
	NETWORK_SHARE_IoFileSystemEntryType IoFileSystemEntryType = "NetworkShare"
)
