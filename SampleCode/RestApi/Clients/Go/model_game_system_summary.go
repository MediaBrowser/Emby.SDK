/*
 * Emby Server REST API (BETA)
 *
 * Explore the Emby Server API
 *
 * API version: 4.8.0.5
 */
package embyclient-rest-go

type GameSystemSummary struct {
	Name string `json:"Name,omitempty"`
	DisplayName string `json:"DisplayName,omitempty"`
	GameCount int32 `json:"GameCount,omitempty"`
	GameFileExtensions []string `json:"GameFileExtensions,omitempty"`
	ClientInstalledGameCount int32 `json:"ClientInstalledGameCount,omitempty"`
}
