/*
 * Emby Server REST API (BETA)
 *
 * Explore the Emby Server API
 *
 * API version: 4.8.0.3
 */
package embyclient-rest-go

type GeneralCommand struct {
	Name string `json:"Name,omitempty"`
	ControllingUserId string `json:"ControllingUserId,omitempty"`
	Arguments map[string]string `json:"Arguments,omitempty"`
}
