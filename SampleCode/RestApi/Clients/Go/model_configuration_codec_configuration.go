/*
 * Emby Server REST API (BETA)
 *
 * Explore the Emby Server API
 *
 */
package embyclient-rest-go

type ConfigurationCodecConfiguration struct {
	IsEnabled bool `json:"IsEnabled,omitempty"`
	Priority int32 `json:"Priority,omitempty"`
	CodecId string `json:"CodecId,omitempty"`
}
