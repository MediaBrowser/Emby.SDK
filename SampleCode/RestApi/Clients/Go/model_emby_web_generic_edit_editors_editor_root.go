/*
 * Emby REST API
 *
 * Explore the Emby Server API
 *
 */
package embyclient-rest-go

type EmbyWebGenericEditEditorsEditorRoot struct {
	PropertyConditions []EmbyWebGenericEditConditionsPropertyCondition `json:"PropertyConditions,omitempty"`
	PostbackActions []EmbyWebGenericEditActionsPostbackAction `json:"PostbackActions,omitempty"`
	TitleButton *EmbyWebGenericEditEditorsEditorButtonItem `json:"TitleButton,omitempty"`
	EditorItems []EmbyWebGenericEditEditorsEditorBase `json:"EditorItems,omitempty"`
	EditorType *EmbyWebGenericEditCommonEditorTypes `json:"EditorType,omitempty"`
	Name string `json:"Name,omitempty"`
	Id string `json:"Id,omitempty"`
	AllowEmpty bool `json:"AllowEmpty,omitempty"`
	IsReadOnly bool `json:"IsReadOnly,omitempty"`
	IsAdvanced bool `json:"IsAdvanced,omitempty"`
	DisplayName string `json:"DisplayName,omitempty"`
	Description string `json:"Description,omitempty"`
	ParentId string `json:"ParentId,omitempty"`
}
