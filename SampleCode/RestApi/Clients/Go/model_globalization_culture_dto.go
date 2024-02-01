/*
 * Emby Server REST API
 *
 * Explore the Emby Server API
 *
 */
package embyclient-rest-go

// Class CultureDto  
type GlobalizationCultureDto struct {
	// The name.
	Name string `json:"Name,omitempty"`
	// The display name.
	DisplayName string `json:"DisplayName,omitempty"`
	// The name of the two letter ISO language.
	TwoLetterISOLanguageName string `json:"TwoLetterISOLanguageName,omitempty"`
	// The name of the three letter ISO language.
	ThreeLetterISOLanguageName string `json:"ThreeLetterISOLanguageName,omitempty"`
	ThreeLetterISOLanguageNames []string `json:"ThreeLetterISOLanguageNames,omitempty"`
	TwoLetterISOLanguageNames []string `json:"TwoLetterISOLanguageNames,omitempty"`
}
