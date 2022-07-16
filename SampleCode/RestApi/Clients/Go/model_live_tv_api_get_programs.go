/*
 * Emby Server REST API (BETA)
 *
 * Explore the Emby Server API
 *
 * API version: 4.8.0.5
 */
package embyclient-rest-go

type LiveTvApiGetPrograms struct {
	IsAiring bool `json:"IsAiring,omitempty"`
	TagIds string `json:"TagIds,omitempty"`
	ExcludeItemIds string `json:"ExcludeItemIds,omitempty"`
	EnableTotalRecordCount bool `json:"EnableTotalRecordCount,omitempty"`
	SeriesTimerId string `json:"SeriesTimerId,omitempty"`
	LibrarySeriesId string `json:"LibrarySeriesId,omitempty"`
	SeriesFromProgramId string `json:"SeriesFromProgramId,omitempty"`
	ShowingsFromProgramId string `json:"ShowingsFromProgramId,omitempty"`
	GroupProgramsBySeries bool `json:"GroupProgramsBySeries,omitempty"`
}
