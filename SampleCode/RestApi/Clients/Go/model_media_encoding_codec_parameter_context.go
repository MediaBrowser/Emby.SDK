/*
 * Emby Server REST API
 *
 * Explore the Emby Server API
 *
 */
package embyclient-rest-go

type MediaEncodingCodecParameterContext string

// List of MediaEncoding.CodecParameterContext
const (
	PLAYBACK_MediaEncodingCodecParameterContext MediaEncodingCodecParameterContext = "Playback"
	CONVERSION_MediaEncodingCodecParameterContext MediaEncodingCodecParameterContext = "Conversion"
)
