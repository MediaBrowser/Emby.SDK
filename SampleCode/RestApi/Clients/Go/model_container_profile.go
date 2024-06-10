/*
 * Emby Server REST API (BETA)
 *
 * Explore the Emby Server API
 *
 */
package embyclient

type ContainerProfile struct {
	Type_ *DlnaProfileType `json:"Type,omitempty"`
	Conditions []ProfileCondition `json:"Conditions,omitempty"`
	Container string `json:"Container,omitempty"`
}
