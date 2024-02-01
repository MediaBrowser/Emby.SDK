/*
 * Emby Server REST API
 *
 * Explore the Emby Server API
 *
 */
package embyclient-rest-go

// Class for unified presentation of all information associated with a specific codec level.  
type LevelInformation struct {
	// The enum member name of the level.
	ShortName string `json:"ShortName,omitempty"`
	// The common name of the level.
	Description string `json:"Description,omitempty"`
	// A value indicating the level's ranking relative to other levels.
	Ordinal int32 `json:"Ordinal,omitempty"`
	MaxBitRate *BitRate `json:"MaxBitRate,omitempty"`
	// A display value of the `Emby.Media.Model.Types.LevelInformation.MaxBitRate` property.
	MaxBitRateDisplay string `json:"MaxBitRateDisplay,omitempty"`
	// A unique identifier.
	Id string `json:"Id,omitempty"`
	// Examples for the maximum supported combinations of resolution and rate for this level.
	ResolutionRates []ResolutionWithRate `json:"ResolutionRates,omitempty"`
	// Examples for the maximum supported combinations of resolution and rate for this level as string values.
	ResolutionRateStrings []string `json:"ResolutionRateStrings,omitempty"`
	// A single string from the `Emby.Media.Model.Types.LevelInformation.ResolutionRateStrings` list.
	ResolutionRatesDisplay string `json:"ResolutionRatesDisplay,omitempty"`
}
