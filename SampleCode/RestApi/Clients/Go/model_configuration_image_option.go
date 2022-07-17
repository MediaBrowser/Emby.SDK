/*
 * Emby REST API
 *
 * Explore the Emby Server API
 *
 */
package embyclient-rest-go

type ConfigurationImageOption struct {
	Type_ *ImageType `json:"Type,omitempty"`
	Limit int32 `json:"Limit,omitempty"`
	MinWidth int32 `json:"MinWidth,omitempty"`
}
