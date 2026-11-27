/*
 * Emby Server REST API (BETA)
 *
 * Explore the Emby Server API
 *
 */
package embyclient

type MediaEncodingSettingsUiImageExtractionImageExtractionToneMappingForm struct {
	IsSeparateForm bool `json:"IsSeparateForm,omitempty"`
	ShowResetToDefaults bool `json:"ShowResetToDefaults,omitempty"`
	Caption string `json:"Caption,omitempty"`
	HelpUrl string `json:"HelpUrl,omitempty"`
	Selection string `json:"Selection,omitempty"`
	FilterId string `json:"FilterId,omitempty"`
	Form *GenericEditIEditObjectContainer `json:"Form,omitempty"`
}
