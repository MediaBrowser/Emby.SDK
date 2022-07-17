/*
 * Emby REST API
 *
 * Explore the Emby Server API
 *
 */
package embyclient-rest-go

type GameSystemSummary struct {
	Name string `json:"Name,omitempty"`
	DisplayName string `json:"DisplayName,omitempty"`
	GameCount int32 `json:"GameCount,omitempty"`
	GameFileExtensions []string `json:"GameFileExtensions,omitempty"`
	ClientInstalledGameCount int32 `json:"ClientInstalledGameCount,omitempty"`
}
