/*
 * Emby Server REST API (BETA)
 *
 * Explore the Emby Server API
 *
 * API version: 4.8.0.6
 */
package embyclient-rest-go

type ConfigurationImageOption struct {
	Type_ *ImageType `json:"Type,omitempty"`
	Limit int32 `json:"Limit,omitempty"`
	MinWidth int32 `json:"MinWidth,omitempty"`
}
