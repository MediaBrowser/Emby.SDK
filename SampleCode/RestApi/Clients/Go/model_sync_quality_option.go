/*
 * Emby Server REST API
 *
 * Explore the Emby Server API
 *
 */
package embyclient-rest-go

type SyncQualityOption struct {
	Name string `json:"Name,omitempty"`
	Description string `json:"Description,omitempty"`
	Id string `json:"Id,omitempty"`
	IsDefault bool `json:"IsDefault,omitempty"`
	IsOriginalQuality bool `json:"IsOriginalQuality,omitempty"`
}
