/*
 * Emby Server REST API (BETA)
 *
 * Explore the Emby Server API
 *
 * API version: 4.8.0.6
 */
package embyclient-rest-go

type QueryResultLiveTvSeriesTimerInfoDto struct {
	Items []LiveTvSeriesTimerInfoDto `json:"Items,omitempty"`
	TotalRecordCount int32 `json:"TotalRecordCount,omitempty"`
}