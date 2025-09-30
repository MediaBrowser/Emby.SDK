/*
 * Emby Server REST API (BETA)
 *
 * Explore the Emby Server API
 *
 */
package embyclient

type ConnectConnectAuthenticationExchangeResult struct {
	LocalUserId string `json:"LocalUserId,omitempty"`
	AccessToken string `json:"AccessToken,omitempty"`
}
