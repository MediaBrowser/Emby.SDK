/*
 * Emby Server REST API (BETA)
 *
 * Explore the Emby Server API
 *
 */
package embyclient-rest-go

type DlnaContainerProfile struct {
	Type_ *DlnaDlnaProfileType `json:"Type,omitempty"`
	Conditions []DlnaProfileCondition `json:"Conditions,omitempty"`
	Container string `json:"Container,omitempty"`
}
