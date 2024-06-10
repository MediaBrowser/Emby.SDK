/*
 * Emby Server REST API (BETA)
 *
 * Explore the Emby Server API
 *
 */
package embyclient

type LibraryAddMediaPath struct {
	Id string `json:"Id,omitempty"`
	Path string `json:"Path,omitempty"`
	PathInfo *MediaPathInfo `json:"PathInfo,omitempty"`
	RefreshLibrary bool `json:"RefreshLibrary,omitempty"`
}
