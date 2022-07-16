/*
 * Emby Server REST API (BETA)
 *
 * Explore the Emby Server API
 *
 * API version: 4.8.0.5
 */
package embyclient-rest-go

type DlnaEncodingContext string

// List of Dlna.EncodingContext
const (
	STREAMING_DlnaEncodingContext DlnaEncodingContext = "Streaming"
	STATIC_DlnaEncodingContext DlnaEncodingContext = "Static"
)
