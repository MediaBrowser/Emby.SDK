/*
 * Emby Server REST API
 *
 * Explore the Emby Server API
 *
 */
package embyclient-rest-go

type ExtendedVideoTypes string

// List of ExtendedVideoTypes
const (
	NONE_ExtendedVideoTypes ExtendedVideoTypes = "None"
	HDR10_ExtendedVideoTypes ExtendedVideoTypes = "Hdr10"
	HDR10_PLUS_ExtendedVideoTypes ExtendedVideoTypes = "Hdr10Plus"
	HYPER_LOG_GAMMA_ExtendedVideoTypes ExtendedVideoTypes = "HyperLogGamma"
	DOLBY_VISION_ExtendedVideoTypes ExtendedVideoTypes = "DolbyVision"
)
