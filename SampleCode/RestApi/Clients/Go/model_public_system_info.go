/*
 * Emby Server REST API
 *
 * Explore the Emby Server API
 *
 */
package embyclient-rest-go

type PublicSystemInfo struct {
	// The local address.
	LocalAddress string `json:"LocalAddress,omitempty"`
	LocalAddresses []string `json:"LocalAddresses,omitempty"`
	// The wan address.
	WanAddress string `json:"WanAddress,omitempty"`
	RemoteAddresses []string `json:"RemoteAddresses,omitempty"`
	// The name of the server.
	ServerName string `json:"ServerName,omitempty"`
	// The version.
	Version string `json:"Version,omitempty"`
	// The id.
	Id string `json:"Id,omitempty"`
}
