/*
 * Emby Server REST API (BETA)
 *
 * Explore the Emby Server API
 *
 * API version: 4.8.0.5
 */
package embyclient-rest-go

type MediaEncodingCodecParameterContext string

// List of MediaEncoding.CodecParameterContext
const (
	PLAYBACK_MediaEncodingCodecParameterContext MediaEncodingCodecParameterContext = "Playback"
	CONVERSION_MediaEncodingCodecParameterContext MediaEncodingCodecParameterContext = "Conversion"
)
