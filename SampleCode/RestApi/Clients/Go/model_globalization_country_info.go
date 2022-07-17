/*
 * Emby REST API
 *
 * Explore the Emby Server API
 *
 */
package embyclient-rest-go

type GlobalizationCountryInfo struct {
	Name string `json:"Name,omitempty"`
	DisplayName string `json:"DisplayName,omitempty"`
	EnglishName string `json:"EnglishName,omitempty"`
	TwoLetterISORegionName string `json:"TwoLetterISORegionName,omitempty"`
	ThreeLetterISORegionName string `json:"ThreeLetterISORegionName,omitempty"`
}
