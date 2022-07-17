/*
 * Emby Server REST API (BETA)
 *
 * Explore the Emby Server API
 *
 */
package embyclient-rest-go

type LiveTvLiveTvInfo struct {
	IsEnabled bool `json:"IsEnabled,omitempty"`
	EnabledUsers []string `json:"EnabledUsers,omitempty"`
}
