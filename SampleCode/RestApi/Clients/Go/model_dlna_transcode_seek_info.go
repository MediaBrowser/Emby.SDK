/*
 * Emby Server REST API (BETA)
 *
 * Explore the Emby Server API
 *
 * API version: 4.8.0.6
 */
package embyclient-rest-go

type DlnaTranscodeSeekInfo string

// List of Dlna.TranscodeSeekInfo
const (
	AUTO_DlnaTranscodeSeekInfo DlnaTranscodeSeekInfo = "Auto"
	BYTES_DlnaTranscodeSeekInfo DlnaTranscodeSeekInfo = "Bytes"
)
