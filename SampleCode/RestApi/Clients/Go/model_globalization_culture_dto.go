/*
 * Emby Server REST API (BETA)
 *
 * Explore the Emby Server API
 *
 */
package embyclient-rest-go

type GlobalizationCultureDto struct {
	Name string `json:"Name,omitempty"`
	DisplayName string `json:"DisplayName,omitempty"`
	TwoLetterISOLanguageName string `json:"TwoLetterISOLanguageName,omitempty"`
	ThreeLetterISOLanguageName string `json:"ThreeLetterISOLanguageName,omitempty"`
	ThreeLetterISOLanguageNames []string `json:"ThreeLetterISOLanguageNames,omitempty"`
	TwoLetterISOLanguageNames []string `json:"TwoLetterISOLanguageNames,omitempty"`
}
