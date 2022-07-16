/*
 * Emby Server REST API (BETA)
 *
 * Explore the Emby Server API
 *
 * API version: 4.8.0.6
 */
package embyclient-rest-go

type ConnectConnectAuthenticationExchangeResult struct {
	LocalUserId string `json:"LocalUserId,omitempty"`
	AccessToken string `json:"AccessToken,omitempty"`
}
