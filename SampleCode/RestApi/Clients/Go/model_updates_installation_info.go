/*
 * Emby Server REST API (BETA)
 *
 * Explore the Emby Server API
 *
 * API version: 4.8.0.3
 */
package embyclient-rest-go

type UpdatesInstallationInfo struct {
	Id string `json:"Id,omitempty"`
	Name string `json:"Name,omitempty"`
	AssemblyGuid string `json:"AssemblyGuid,omitempty"`
	Version string `json:"Version,omitempty"`
	UpdateClass *UpdatesPackageVersionClass `json:"UpdateClass,omitempty"`
	PercentComplete float64 `json:"PercentComplete,omitempty"`
}
