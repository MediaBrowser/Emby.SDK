/*
 * Emby Server REST API (BETA)
 *
 * Explore the Emby Server API
 *
 */
package embyclient-rest-go

type DlnaTranscodeSeekInfo string

// List of Dlna.TranscodeSeekInfo
const (
	AUTO_DlnaTranscodeSeekInfo DlnaTranscodeSeekInfo = "Auto"
	BYTES_DlnaTranscodeSeekInfo DlnaTranscodeSeekInfo = "Bytes"
)
