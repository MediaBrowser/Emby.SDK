/*
 * Emby Server REST API (BETA)
 *
 * Explore the Emby Server API
 *
 */
package embyclient-rest-go

type ConfigurationProxyHeaderMode string

// List of Configuration.ProxyHeaderMode
const (
	NONE_ConfigurationProxyHeaderMode ConfigurationProxyHeaderMode = "None"
	LAN_ADDRESSES_ONLY_ConfigurationProxyHeaderMode ConfigurationProxyHeaderMode = "LanAddressesOnly"
	REMOTE_ADDRESSES_ONLY_ConfigurationProxyHeaderMode ConfigurationProxyHeaderMode = "RemoteAddressesOnly"
	ALL_ADDRESSES_ConfigurationProxyHeaderMode ConfigurationProxyHeaderMode = "AllAddresses"
)
