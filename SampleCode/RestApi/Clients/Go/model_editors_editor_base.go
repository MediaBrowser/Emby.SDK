/*
 * Emby Server REST API
 *
 * Explore the Emby Server API
 *
 */
package embyclient-rest-go

type EditorsEditorBase struct {
	EditorType *CommonEditorTypes `json:"EditorType,omitempty"`
	Name string `json:"Name,omitempty"`
	Id string `json:"Id,omitempty"`
	AllowEmpty bool `json:"AllowEmpty,omitempty"`
	IsReadOnly bool `json:"IsReadOnly,omitempty"`
	IsAdvanced bool `json:"IsAdvanced,omitempty"`
	DisplayName string `json:"DisplayName,omitempty"`
	Description string `json:"Description,omitempty"`
	FeatureRequiresPremiere bool `json:"FeatureRequiresPremiere,omitempty"`
	ParentId string `json:"ParentId,omitempty"`
}
