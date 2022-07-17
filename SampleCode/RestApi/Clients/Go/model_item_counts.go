/*
 * Emby Server REST API (BETA)
 *
 * Explore the Emby Server API
 *
 */
package embyclient-rest-go

type ItemCounts struct {
	MovieCount int32 `json:"MovieCount,omitempty"`
	SeriesCount int32 `json:"SeriesCount,omitempty"`
	EpisodeCount int32 `json:"EpisodeCount,omitempty"`
	GameCount int32 `json:"GameCount,omitempty"`
	ArtistCount int32 `json:"ArtistCount,omitempty"`
	ProgramCount int32 `json:"ProgramCount,omitempty"`
	GameSystemCount int32 `json:"GameSystemCount,omitempty"`
	TrailerCount int32 `json:"TrailerCount,omitempty"`
	SongCount int32 `json:"SongCount,omitempty"`
	AlbumCount int32 `json:"AlbumCount,omitempty"`
	MusicVideoCount int32 `json:"MusicVideoCount,omitempty"`
	BoxSetCount int32 `json:"BoxSetCount,omitempty"`
	BookCount int32 `json:"BookCount,omitempty"`
	ItemCount int32 `json:"ItemCount,omitempty"`
}
