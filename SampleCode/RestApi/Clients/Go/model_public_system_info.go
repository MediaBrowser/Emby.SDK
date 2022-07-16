/*
 * Emby Server REST API (BETA)
 *
 * Explore the Emby Server API
 *
 * API version: 4.8.0.5
 */
package embyclient-rest-go

type PublicSystemInfo struct {
	LocalAddress string `json:"LocalAddress,omitempty"`
	LocalAddresses []string `json:"LocalAddresses,omitempty"`
	WanAddress string `json:"WanAddress,omitempty"`
	RemoteAddresses []string `json:"RemoteAddresses,omitempty"`
	ServerName string `json:"ServerName,omitempty"`
	Version string `json:"Version,omitempty"`
	Id string `json:"Id,omitempty"`
}
