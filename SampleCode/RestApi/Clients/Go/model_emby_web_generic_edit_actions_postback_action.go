/*
 * Emby Server REST API (BETA)
 *
 * Explore the Emby Server API
 *
 * API version: 4.8.0.5
 */
package embyclient-rest-go

type EmbyWebGenericEditActionsPostbackAction struct {
	TargetEditorId string `json:"TargetEditorId,omitempty"`
	PostbackCommandId string `json:"PostbackCommandId,omitempty"`
	CommandParameterPropertyId string `json:"CommandParameterPropertyId,omitempty"`
}
