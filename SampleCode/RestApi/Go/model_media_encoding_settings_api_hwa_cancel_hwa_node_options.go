/*
 * Emby Server REST API (BETA)
 *
 * Explore the Emby Server API
 *
 */
package embyclient

type MediaEncodingSettingsApiHwaCancelHwaNodeOptions struct {
	NodeId string `json:"NodeId,omitempty"`
	EditorType *MediaEncodingSettingsHwaProjectionEnumsUiNodeCommandType `json:"EditorType,omitempty"`
}
