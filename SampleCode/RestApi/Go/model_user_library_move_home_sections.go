/*
 * Emby Server REST API
 *
 * Explore the Emby Server API
 *
 */
package embyclient

type UserLibraryMoveHomeSections struct {
	Ids []string `json:"Ids,omitempty"`
	NewIndex int32 `json:"NewIndex,omitempty"`
}
