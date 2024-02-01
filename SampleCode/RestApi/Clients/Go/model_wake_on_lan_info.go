/*
 * Emby Server REST API
 *
 * Explore the Emby Server API
 *
 */
package embyclient-rest-go

type WakeOnLanInfo struct {
	MacAddress string `json:"MacAddress,omitempty"`
	BroadcastAddress string `json:"BroadcastAddress,omitempty"`
	Port int32 `json:"Port,omitempty"`
}
