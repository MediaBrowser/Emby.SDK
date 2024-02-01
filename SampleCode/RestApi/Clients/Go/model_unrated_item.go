/*
 * Emby Server REST API
 *
 * Explore the Emby Server API
 *
 */
package embyclient-rest-go

type UnratedItem string

// List of UnratedItem
const (
	MOVIE_UnratedItem UnratedItem = "Movie"
	TRAILER_UnratedItem UnratedItem = "Trailer"
	SERIES_UnratedItem UnratedItem = "Series"
	MUSIC_UnratedItem UnratedItem = "Music"
	GAME_UnratedItem UnratedItem = "Game"
	BOOK_UnratedItem UnratedItem = "Book"
	LIVE_TV_CHANNEL_UnratedItem UnratedItem = "LiveTvChannel"
	LIVE_TV_PROGRAM_UnratedItem UnratedItem = "LiveTvProgram"
	CHANNEL_CONTENT_UnratedItem UnratedItem = "ChannelContent"
	OTHER_UnratedItem UnratedItem = "Other"
)
