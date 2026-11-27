/*
 * Emby Server REST API (BETA)
 *
 * Explore the Emby Server API
 *
 */
package embyclient

type MediaEncodingHwaConditionsConfigOperationConditions struct {
	// Offline conversions which are not related to an active playback session
	Conversions bool `json:"Conversions,omitempty"`
	// Transcoding of Live TV
	LiveTV bool `json:"LiveTV,omitempty"`
	// Transcoding for an active playback session
	Playback bool `json:"Playback,omitempty"`
	// HLS Transcoding for an active playback session
	HlsPlayback bool `json:"HlsPlayback,omitempty"`
	// Transcoding of a live stream for an active playback session
	LiveStream bool `json:"LiveStream,omitempty"`
}
