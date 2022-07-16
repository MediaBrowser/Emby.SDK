/*
 * Emby Server REST API (BETA)
 *
 * Explore the Emby Server API
 *
 * API version: 4.8.0.6
 */
package embyclient-rest-go

type LiveTvKeepUntil string

// List of LiveTv.KeepUntil
const (
	UNTIL_DELETED_LiveTvKeepUntil LiveTvKeepUntil = "UntilDeleted"
	UNTIL_SPACE_NEEDED_LiveTvKeepUntil LiveTvKeepUntil = "UntilSpaceNeeded"
	UNTIL_WATCHED_LiveTvKeepUntil LiveTvKeepUntil = "UntilWatched"
	UNTIL_DATE_LiveTvKeepUntil LiveTvKeepUntil = "UntilDate"
)
