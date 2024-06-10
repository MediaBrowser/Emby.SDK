/*
 * Emby Server REST API (BETA)
 *
 * Explore the Emby Server API
 *
 */
package embyclient

type LibraryRemoveVirtualFolder struct {
	Id string `json:"Id,omitempty"`
	RefreshLibrary bool `json:"RefreshLibrary,omitempty"`
}
