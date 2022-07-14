/*
 * Emby Server REST API (BETA)
 *
 * Explore the Emby Server API
 *
 * API version: 4.8.0.3
 */
package embyclient-rest-go

type ConfigurationUnratedItem string

// List of Configuration.UnratedItem
const (
	MOVIE_ConfigurationUnratedItem ConfigurationUnratedItem = "Movie"
	TRAILER_ConfigurationUnratedItem ConfigurationUnratedItem = "Trailer"
	SERIES_ConfigurationUnratedItem ConfigurationUnratedItem = "Series"
	MUSIC_ConfigurationUnratedItem ConfigurationUnratedItem = "Music"
	GAME_ConfigurationUnratedItem ConfigurationUnratedItem = "Game"
	BOOK_ConfigurationUnratedItem ConfigurationUnratedItem = "Book"
	LIVE_TV_CHANNEL_ConfigurationUnratedItem ConfigurationUnratedItem = "LiveTvChannel"
	LIVE_TV_PROGRAM_ConfigurationUnratedItem ConfigurationUnratedItem = "LiveTvProgram"
	CHANNEL_CONTENT_ConfigurationUnratedItem ConfigurationUnratedItem = "ChannelContent"
	OTHER_ConfigurationUnratedItem ConfigurationUnratedItem = "Other"
)
