/*
 * Emby Server REST API (BETA)
 *
 * Explore the Emby Server API
 *
 */
package embyclient

type WakeOnLanInfo struct {
	MacAddress string `json:"MacAddress,omitempty"`
	BroadcastAddress string `json:"BroadcastAddress,omitempty"`
	Port int32 `json:"Port,omitempty"`
}
