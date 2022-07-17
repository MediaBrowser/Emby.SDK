/*
 * Emby Server REST API (BETA)
 *
 * Explore the Emby Server API
 *
 */
package embyclient-rest-go

type LibraryMediaUpdateInfo struct {
	Path string `json:"Path,omitempty"`
	UpdateType string `json:"UpdateType,omitempty"`
}
