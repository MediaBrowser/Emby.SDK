/*
 * Emby REST API
 *
 * Explore the Emby Server API
 *
 */
package embyclient-rest-go

type ImageByNameInfo struct {
	Name string `json:"Name,omitempty"`
	Theme string `json:"Theme,omitempty"`
	Context string `json:"Context,omitempty"`
	FileLength int64 `json:"FileLength,omitempty"`
	Format string `json:"Format,omitempty"`
}
