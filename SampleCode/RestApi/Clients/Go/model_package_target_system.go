/*
 * Emby Server REST API
 *
 * Explore the Emby Server API
 *
 */
package embyclient-rest-go
// PackageTargetSystem : Enum PackageType  
type PackageTargetSystem string

// List of PackageTargetSystem
const (
	SERVER_PackageTargetSystem PackageTargetSystem = "Server"
	MB_THEATER_PackageTargetSystem PackageTargetSystem = "MBTheater"
	MB_CLASSIC_PackageTargetSystem PackageTargetSystem = "MBClassic"
	OTHER_PackageTargetSystem PackageTargetSystem = "Other"
)
