/*
 * Emby Server REST API (BETA)
 *
 * Explore the Emby Server API
 *
 * API version: 4.8.0.3
 */
package embyclient-rest-go

type LiveTvKeywordType string

// List of LiveTv.KeywordType
const (
	NAME_LiveTvKeywordType LiveTvKeywordType = "Name"
	EPISODE_TITLE_LiveTvKeywordType LiveTvKeywordType = "EpisodeTitle"
	OVERVIEW_LiveTvKeywordType LiveTvKeywordType = "Overview"
	ACTOR_LiveTvKeywordType LiveTvKeywordType = "Actor"
	DIRECTOR_LiveTvKeywordType LiveTvKeywordType = "Director"
)
