/*
 * Emby Server REST API
 *
 * Explore the Emby Server API
 *
 */
package embyclient-rest-go

type CodecConfiguration struct {
	// A value indicating whether the codec is enabled.
	IsEnabled bool `json:"IsEnabled,omitempty"`
	// The selection priority for the codec.    Higher values mean higher priority.
	Priority int32 `json:"Priority,omitempty"`
	// The codec identifier.
	CodecId string `json:"CodecId,omitempty"`
}
