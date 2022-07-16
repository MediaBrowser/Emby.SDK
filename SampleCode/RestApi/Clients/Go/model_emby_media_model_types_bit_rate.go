/*
 * Emby Server REST API (BETA)
 *
 * Explore the Emby Server API
 *
 * API version: 4.8.0.5
 */
package embyclient-rest-go

type EmbyMediaModelTypesBitRate struct {
	Bps int64 `json:"bps,omitempty"`
	Kbps float64 `json:"kbps,omitempty"`
	Mbps float64 `json:"Mbps,omitempty"`
}
