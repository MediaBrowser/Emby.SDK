/*
 * Emby Server REST API (BETA)
 *
 * Explore the Emby Server API
 *
 * API version: 4.8.0.5
 */
package embyclient-rest-go

type LibraryUpdateMediaPath struct {
	Id string `json:"Id,omitempty"`
	PathInfo *ConfigurationMediaPathInfo `json:"PathInfo,omitempty"`
}
