/*
 * Emby Server REST API (BETA)
 *
 * Explore the Emby Server API
 *
 */
package embyclient

type SessionPartyInfo struct {
	Id string `json:"Id,omitempty"`
	Name string `json:"Name,omitempty"`
	Sessions []SessionSessionInfo `json:"Sessions,omitempty"`
	Users []EntitiesUser `json:"Users,omitempty"`
}
