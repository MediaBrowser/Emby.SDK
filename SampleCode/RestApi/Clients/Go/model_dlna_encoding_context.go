/*
 * Emby Server REST API (BETA)
 *
 * Explore the Emby Server API
 *
 */
package embyclient-rest-go

type DlnaEncodingContext string

// List of Dlna.EncodingContext
const (
	STREAMING_DlnaEncodingContext DlnaEncodingContext = "Streaming"
	STATIC_DlnaEncodingContext DlnaEncodingContext = "Static"
)
