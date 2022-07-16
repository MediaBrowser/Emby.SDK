/*
 * Emby Server REST API (BETA)
 *
 * Explore the Emby Server API
 *
 * API version: 4.8.0.5
 */
package embyclient-rest-go

type UpdatesPackageTargetSystem string

// List of Updates.PackageTargetSystem
const (
	SERVER_UpdatesPackageTargetSystem UpdatesPackageTargetSystem = "Server"
	MB_THEATER_UpdatesPackageTargetSystem UpdatesPackageTargetSystem = "MBTheater"
	MB_CLASSIC_UpdatesPackageTargetSystem UpdatesPackageTargetSystem = "MBClassic"
	OTHER_UpdatesPackageTargetSystem UpdatesPackageTargetSystem = "Other"
)
