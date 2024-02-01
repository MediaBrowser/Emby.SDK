/*
 * Emby Server REST API
 *
 * Explore the Emby Server API
 *
 */
package embyclient-rest-go

type CodecProfile struct {
	Type_ *CodecType `json:"Type,omitempty"`
	Conditions []ProfileCondition `json:"Conditions,omitempty"`
	ApplyConditions []ProfileCondition `json:"ApplyConditions,omitempty"`
	Codec string `json:"Codec,omitempty"`
	Container string `json:"Container,omitempty"`
}
