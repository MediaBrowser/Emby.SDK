/*
 * Emby Server REST API (BETA)
 *
 * Explore the Emby Server API
 *
 * API version: 4.8.0.6
 */
package embyclient-rest-go

type DlnaCodecProfile struct {
	Type_ *DlnaCodecType `json:"Type,omitempty"`
	Conditions []DlnaProfileCondition `json:"Conditions,omitempty"`
	ApplyConditions []DlnaProfileCondition `json:"ApplyConditions,omitempty"`
	Codec string `json:"Codec,omitempty"`
	Container string `json:"Container,omitempty"`
}
