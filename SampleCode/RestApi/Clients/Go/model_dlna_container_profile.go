/*
 * Emby Server REST API (BETA)
 *
 * Explore the Emby Server API
 *
 * API version: 4.8.0.3
 */
package embyclient-rest-go

type DlnaContainerProfile struct {
	Type_ *DlnaDlnaProfileType `json:"Type,omitempty"`
	Conditions []DlnaProfileCondition `json:"Conditions,omitempty"`
	Container string `json:"Container,omitempty"`
}
