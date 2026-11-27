/*
 * Emby Server REST API (BETA)
 *
 * Explore the Emby Server API
 *
 */
package embyclient

type MediaEncodingSettingsHwaEditingNodeOptionsForm struct {
	IsSeparateForm bool `json:"IsSeparateForm,omitempty"`
	ShowResetToDefaults bool `json:"ShowResetToDefaults,omitempty"`
	Caption string `json:"Caption,omitempty"`
	HelpUrl string `json:"HelpUrl,omitempty"`
	Form *GenericEditIEditObjectContainer `json:"Form,omitempty"`
}
