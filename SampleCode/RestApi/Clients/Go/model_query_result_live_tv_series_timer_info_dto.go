/*
 * Emby Server REST API (BETA)
 *
 * Explore the Emby Server API
 *
 */
package embyclient

type QueryResultLiveTvSeriesTimerInfoDto struct {
	Items []LiveTvSeriesTimerInfoDto `json:"Items,omitempty"`
	TotalRecordCount int32 `json:"TotalRecordCount,omitempty"`
}
