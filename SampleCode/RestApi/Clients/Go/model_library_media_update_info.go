/*
 * Emby Server REST API (BETA)
 *
 * Explore the Emby Server API
 *
 * API version: 4.8.0.5
 */
package embyclient-rest-go

type LibraryMediaUpdateInfo struct {
	Path string `json:"Path,omitempty"`
	UpdateType string `json:"UpdateType,omitempty"`
}
