/*
 * Emby Server REST API (BETA)
 *
 * Explore the Emby Server API
 *
 * API version: 4.8.0.3
 */
package embyclient-rest-go

type ImageByNameInfo struct {
	Name string `json:"Name,omitempty"`
	Theme string `json:"Theme,omitempty"`
	Context string `json:"Context,omitempty"`
	FileLength int64 `json:"FileLength,omitempty"`
	Format string `json:"Format,omitempty"`
}
