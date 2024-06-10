/*
 * Emby Server REST API (BETA)
 *
 * Explore the Emby Server API
 *
 */
package embyclient

// Class InstallationInfo  
type InstallationInfo struct {
	// The id.
	Id string `json:"Id,omitempty"`
	// The name.
	Name string `json:"Name,omitempty"`
	// The assembly guid.
	AssemblyGuid string `json:"AssemblyGuid,omitempty"`
	// The version.
	Version string `json:"Version,omitempty"`
	UpdateClass *PackageVersionClass `json:"UpdateClass,omitempty"`
	// The percent complete.
	PercentComplete float64 `json:"PercentComplete,omitempty"`
}
