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
	InternalSessions []SessionSessionInfo `json:"InternalSessions,omitempty"`
	Messages []SessionPartyMessage `json:"Messages,omitempty"`
	MasterSession *SessionSessionInfo `json:"MasterSession,omitempty"`
	IsPlaying bool `json:"IsPlaying,omitempty"`
	Sessions []SessionPartySessionInfo `json:"Sessions,omitempty"`
}
