/*
 * Emby Server REST API (BETA)
 *
 * Explore the Emby Server API
 *
 */
package embyclient

type DirectPlayProfile struct {
	Container string `json:"Container,omitempty"`
	AudioCodec string `json:"AudioCodec,omitempty"`
	VideoCodec string `json:"VideoCodec,omitempty"`
	Type_ *DlnaProfileType `json:"Type,omitempty"`
}
