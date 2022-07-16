/*
 * Emby Server REST API (BETA)
 *
 * Explore the Emby Server API
 *
 * API version: 4.8.0.6
 */
package embyclient-rest-go

type EmbyMediaModelTypesLevelInformation struct {
	ShortName string `json:"ShortName,omitempty"`
	Description string `json:"Description,omitempty"`
	Ordinal int32 `json:"Ordinal,omitempty"`
	MaxBitRate *EmbyMediaModelTypesBitRate `json:"MaxBitRate,omitempty"`
	MaxBitRateDisplay string `json:"MaxBitRateDisplay,omitempty"`
	Id string `json:"Id,omitempty"`
	ResolutionRates []EmbyMediaModelTypesResolutionWithRate `json:"ResolutionRates,omitempty"`
	ResolutionRateStrings []string `json:"ResolutionRateStrings,omitempty"`
	ResolutionRatesDisplay string `json:"ResolutionRatesDisplay,omitempty"`
}
