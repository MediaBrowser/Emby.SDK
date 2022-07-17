/*
 * Emby Server REST API (BETA)
 *
 * Explore the Emby Server API
 *
 */
package embyclient-rest-go

type LocationType string

// List of LocationType
const (
	FILE_SYSTEM_LocationType LocationType = "FileSystem"
	VIRTUAL_LocationType LocationType = "Virtual"
)
