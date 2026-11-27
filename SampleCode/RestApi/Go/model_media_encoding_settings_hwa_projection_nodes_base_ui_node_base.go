/*
 * Emby Server REST API (BETA)
 *
 * Explore the Emby Server API
 *
 */
package embyclient

type MediaEncodingSettingsHwaProjectionNodesBaseUiNodeBase struct {
	Id string `json:"Id,omitempty"`
	NodeType *MediaEncodingSettingsHwaProjectionEnumsUiNodeType `json:"NodeType,omitempty"`
	DisplayId string `json:"DisplayId,omitempty"`
	PrimaryText string `json:"PrimaryText,omitempty"`
	SecondaryText string `json:"SecondaryText,omitempty"`
	Icon *ElementsIconNames `json:"Icon,omitempty"`
	State *MediaEncodingSettingsHwaProjectionEnumsUiNodeState `json:"State,omitempty"`
	IsFocusable bool `json:"IsFocusable,omitempty"`
	StateReason string `json:"StateReason,omitempty"`
	CanMove *MediaEncodingSettingsHwaProjectionNodesUiNodeMoveTargets `json:"CanMove,omitempty"`
	InsertAt string `json:"InsertAt,omitempty"`
	Commands []MediaEncodingSettingsHwaProjectionNodesUiNodeCommand `json:"Commands,omitempty"`
}
