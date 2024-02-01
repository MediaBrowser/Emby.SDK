/*
 * Emby Server REST API
 *
 * Explore the Emby Server API
 *
 */
package embyclient-rest-go

type ProxyHeaderMode string

// List of ProxyHeaderMode
const (
	NONE_ProxyHeaderMode ProxyHeaderMode = "None"
	LAN_ADDRESSES_ONLY_ProxyHeaderMode ProxyHeaderMode = "LanAddressesOnly"
	REMOTE_ADDRESSES_ONLY_ProxyHeaderMode ProxyHeaderMode = "RemoteAddressesOnly"
	ALL_ADDRESSES_ProxyHeaderMode ProxyHeaderMode = "AllAddresses"
)
