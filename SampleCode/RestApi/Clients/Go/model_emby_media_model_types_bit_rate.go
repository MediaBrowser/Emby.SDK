/*
 * Emby REST API
 *
 * Explore the Emby Server API
 *
 */
package embyclient-rest-go

type EmbyMediaModelTypesBitRate struct {
	Bps int64 `json:"bps,omitempty"`
	Kbps float64 `json:"kbps,omitempty"`
	Mbps float64 `json:"Mbps,omitempty"`
}
