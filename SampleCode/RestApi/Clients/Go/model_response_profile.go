/*
 * Emby Server REST API
 *
 * Explore the Emby Server API
 *
 */
package embyclient-rest-go

type ResponseProfile struct {
	Container string `json:"Container,omitempty"`
	AudioCodec string `json:"AudioCodec,omitempty"`
	VideoCodec string `json:"VideoCodec,omitempty"`
	Type_ *DlnaProfileType `json:"Type,omitempty"`
	OrgPn string `json:"OrgPn,omitempty"`
	MimeType string `json:"MimeType,omitempty"`
	Conditions []ProfileCondition `json:"Conditions,omitempty"`
}
