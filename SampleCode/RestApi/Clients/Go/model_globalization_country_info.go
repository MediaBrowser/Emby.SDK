/*
 * Emby Server REST API
 *
 * Explore the Emby Server API
 *
 */
package embyclient-rest-go

// Class CountryInfo  
type GlobalizationCountryInfo struct {
	// The name.
	Name string `json:"Name,omitempty"`
	// The display name.
	DisplayName string `json:"DisplayName,omitempty"`
	// The English name.
	EnglishName string `json:"EnglishName,omitempty"`
	// The name of the two letter ISO region.
	TwoLetterISORegionName string `json:"TwoLetterISORegionName,omitempty"`
	// The name of the three letter ISO region.
	ThreeLetterISORegionName string `json:"ThreeLetterISORegionName,omitempty"`
}
