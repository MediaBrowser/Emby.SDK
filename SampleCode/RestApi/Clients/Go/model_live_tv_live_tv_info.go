/*
 * Emby Server REST API (BETA)
 *
 * Explore the Emby Server API
 *
 */
package embyclient

type LiveTvLiveTvInfo struct {
	// A value indicating whether this instance is enabled.
	IsEnabled bool `json:"IsEnabled,omitempty"`
	// The enabled users.
	EnabledUsers []string `json:"EnabledUsers,omitempty"`
}
