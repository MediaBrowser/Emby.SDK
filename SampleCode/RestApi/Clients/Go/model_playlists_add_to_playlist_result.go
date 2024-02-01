/*
 * Emby Server REST API
 *
 * Explore the Emby Server API
 *
 */
package embyclient-rest-go

type PlaylistsAddToPlaylistResult struct {
	Id string `json:"Id,omitempty"`
	ItemAddedCount int32 `json:"ItemAddedCount,omitempty"`
}
