/*
 * Emby Server REST API (BETA)
 *
 * Explore the Emby Server API
 *
 */
package embyclient

type TranscodeSeekInfo string

// List of TranscodeSeekInfo
const (
	AUTO_TranscodeSeekInfo TranscodeSeekInfo = "Auto"
	BYTES_TranscodeSeekInfo TranscodeSeekInfo = "Bytes"
)
