/*
 * Emby Server REST API (BETA)
 *
 * Explore the Emby Server API
 *
 * API version: 4.8.0.6
 */
package embyclient-rest-go

type MetadataEditorInfo struct {
	ParentalRatingOptions []ParentalRating `json:"ParentalRatingOptions,omitempty"`
	Countries []GlobalizationCountryInfo `json:"Countries,omitempty"`
	Cultures []GlobalizationCultureDto `json:"Cultures,omitempty"`
	ExternalIdInfos []ExternalIdInfo `json:"ExternalIdInfos,omitempty"`
}
