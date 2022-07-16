/*
 * Emby Server REST API (BETA)
 *
 * Explore the Emby Server API
 *
 * API version: 4.8.0.5
 */
package embyclient-rest-go

type GlobalizationCountryInfo struct {
	Name string `json:"Name,omitempty"`
	DisplayName string `json:"DisplayName,omitempty"`
	EnglishName string `json:"EnglishName,omitempty"`
	TwoLetterISORegionName string `json:"TwoLetterISORegionName,omitempty"`
	ThreeLetterISORegionName string `json:"ThreeLetterISORegionName,omitempty"`
}
