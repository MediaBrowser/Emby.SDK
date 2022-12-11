/*
 * Emby Server REST API (BETA)
 *
 * Explore the Emby Server API
 *
 */
package embyclient-rest-go

type EmbyWebGenericUiModelUiCommand struct {
	CommandType *EmbyWebGenericUiModelEnumsUiCommandType `json:"CommandType,omitempty"`
	CommandId string `json:"CommandId,omitempty"`
	IsVisible bool `json:"IsVisible,omitempty"`
	IsEnabled bool `json:"IsEnabled,omitempty"`
	Caption string `json:"Caption,omitempty"`
	SetFocus bool `json:"SetFocus,omitempty"`
	ConfirmationPrompt string `json:"ConfirmationPrompt,omitempty"`
}
