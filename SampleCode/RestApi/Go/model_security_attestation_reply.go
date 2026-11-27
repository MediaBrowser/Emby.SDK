/*
 * Emby Server REST API (BETA)
 *
 * Explore the Emby Server API
 *
 */
package embyclient

type SecurityAttestationReply struct {
	Type_ string `json:"type,omitempty"`
	RequestId string `json:"requestId,omitempty"`
	AppAttestation string `json:"appAttestation,omitempty"`
}
