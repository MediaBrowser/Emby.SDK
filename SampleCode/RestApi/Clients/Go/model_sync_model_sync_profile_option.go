/*
 * Emby Server REST API (BETA)
 *
 * Explore the Emby Server API
 *
 * API version: 4.8.0.3
 */
package embyclient-rest-go

type SyncModelSyncProfileOption struct {
	Name string `json:"Name,omitempty"`
	Description string `json:"Description,omitempty"`
	Id string `json:"Id,omitempty"`
	IsDefault bool `json:"IsDefault,omitempty"`
	EnableQualityOptions bool `json:"EnableQualityOptions,omitempty"`
}
