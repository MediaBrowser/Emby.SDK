/*
 * Emby Server REST API (BETA)
 *
 * Explore the Emby Server API
 *
 * API version: 4.8.0.5
 */
package embyclient-rest-go

type UpdatesPackageVersionClass string

// List of Updates.PackageVersionClass
const (
	RELEASE_UpdatesPackageVersionClass UpdatesPackageVersionClass = "Release"
	BETA_UpdatesPackageVersionClass UpdatesPackageVersionClass = "Beta"
	DEV_UpdatesPackageVersionClass UpdatesPackageVersionClass = "Dev"
)
