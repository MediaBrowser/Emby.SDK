/*
 * Emby Server REST API (BETA)
 *
 * Explore the Emby Server API
 *
 * API version: 4.8.0.6
 */
package embyclient-rest-go

type LibraryUpdateMediaPath struct {
	Id string `json:"Id,omitempty"`
	PathInfo *ConfigurationMediaPathInfo `json:"PathInfo,omitempty"`
}
