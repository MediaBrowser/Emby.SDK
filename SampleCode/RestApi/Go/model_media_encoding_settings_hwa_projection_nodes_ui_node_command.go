/*
 * Emby Server REST API (BETA)
 *
 * Explore the Emby Server API
 *
 */
package embyclient

type MediaEncodingSettingsHwaProjectionNodesUiNodeCommand struct {
	CommandType *MediaEncodingSettingsHwaProjectionEnumsUiNodeCommandType `json:"CommandType,omitempty"`
	Caption string `json:"Caption,omitempty"`
	Icon *ElementsIconNames `json:"Icon,omitempty"`
	IsRemote bool `json:"IsRemote,omitempty"`
	CommandData string `json:"CommandData,omitempty"`
	OpensForm bool `json:"OpensForm,omitempty"`
	ConfirmationPrompt string `json:"ConfirmationPrompt,omitempty"`
}
