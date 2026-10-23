/*
 * Emby Server REST API (BETA)
 *
 * Explore the Emby Server API
 *
 */
package embyclient

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
	// Buttons attached to this editor (via `[IsButtonFor]` on a`Emby.Web.GenericEdit.Elements.ButtonItem` property naming this editor's own property) \\- rendered             inline at the end of this editor's own control (e.g. next to a dropdown/select) instead of             as a separate, standalone button/group elsewhere in the form.
	ExtensionButtons []EditorsEditorButtonItem `json:"ExtensionButtons,omitempty"`
	// The id of a string property (attached via `[IsDescriptionFor]`            naming this editor's own property) whose live value is displayed as this editor's             description, refreshed dynamically whenever the value is re\\-pushed \\- in addition to (not             instead of) this editor's own static `Emby.Web.GenericEdit.Editors.EditorBase.Description`.
	DescriptionSourceId string `json:"DescriptionSourceId,omitempty"`
}
