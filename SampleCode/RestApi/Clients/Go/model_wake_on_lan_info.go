/*
 * Emby Server REST API (BETA)
 *
 * Explore the Emby Server API
 *
 * API version: 4.8.0.5
 */
package embyclient-rest-go

type WakeOnLanInfo struct {
	MacAddress string `json:"MacAddress,omitempty"`
	BroadcastAddress string `json:"BroadcastAddress,omitempty"`
	Port int32 `json:"Port,omitempty"`
}
