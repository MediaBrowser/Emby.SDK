/*
 * Emby Server REST API (BETA)
 *
 * Explore the Emby Server API
 *
 */
package embyclient-rest-go

type EncodingContext string

// List of EncodingContext
const (
	STREAMING_EncodingContext EncodingContext = "Streaming"
	STATIC_EncodingContext EncodingContext = "Static"
)