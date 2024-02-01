/*
 * Emby Server REST API
 *
 * Explore the Emby Server API
 *
 */
package embyclient-rest-go

// Class LibrarySummary  
type ItemCounts struct {
	// The movie count.
	MovieCount int32 `json:"MovieCount,omitempty"`
	// The series count.
	SeriesCount int32 `json:"SeriesCount,omitempty"`
	// The episode count.
	EpisodeCount int32 `json:"EpisodeCount,omitempty"`
	// The game count.
	GameCount int32 `json:"GameCount,omitempty"`
	ArtistCount int32 `json:"ArtistCount,omitempty"`
	ProgramCount int32 `json:"ProgramCount,omitempty"`
	// The game system count.
	GameSystemCount int32 `json:"GameSystemCount,omitempty"`
	// The trailer count.
	TrailerCount int32 `json:"TrailerCount,omitempty"`
	// The song count.
	SongCount int32 `json:"SongCount,omitempty"`
	// The album count.
	AlbumCount int32 `json:"AlbumCount,omitempty"`
	// The music video count.
	MusicVideoCount int32 `json:"MusicVideoCount,omitempty"`
	// The box set count.
	BoxSetCount int32 `json:"BoxSetCount,omitempty"`
	// The book count.
	BookCount int32 `json:"BookCount,omitempty"`
	ItemCount int32 `json:"ItemCount,omitempty"`
}
