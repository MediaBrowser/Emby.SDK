/*
 * Emby Server REST API (BETA)
 *
 * Explore the Emby Server API
 *
 */
package embyclient

type MediaEncodingSettingsApiHwaExecuteHwaConfigCommand struct {
	NodeId string `json:"NodeId,omitempty"`
	CommandType *MediaEncodingSettingsHwaProjectionEnumsUiNodeCommandType `json:"CommandType,omitempty"`
	TargetId string `json:"TargetId,omitempty"`
	Data string `json:"Data,omitempty"`
}
