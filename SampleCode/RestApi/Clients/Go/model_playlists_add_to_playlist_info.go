/*
 * Emby Server REST API (BETA)
 *
 * Explore the Emby Server API
 *
 */
package embyclient

type PlaylistsAddToPlaylistInfo struct {
	ItemCount int32 `json:"ItemCount,omitempty"`
	ContainsDuplicates bool `json:"ContainsDuplicates,omitempty"`
}
