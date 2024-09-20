/*
 * Emby Server REST API
 *
 * Explore the Emby Server API
 *
 */
package embyclient-rest-go
import (
	"time"
)

type RemoteSearchResult struct {
	// The name.
	Name string `json:"Name,omitempty"`
	OriginalTitle string `json:"OriginalTitle,omitempty"`
	ProviderIds *map[string]string `json:"ProviderIds,omitempty"`
	// The year.
	ProductionYear int32 `json:"ProductionYear,omitempty"`
	IndexNumber int32 `json:"IndexNumber,omitempty"`
	IndexNumberEnd int32 `json:"IndexNumberEnd,omitempty"`
	ParentIndexNumber int32 `json:"ParentIndexNumber,omitempty"`
	SortIndexNumber int32 `json:"SortIndexNumber,omitempty"`
	SortParentIndexNumber int32 `json:"SortParentIndexNumber,omitempty"`
	PremiereDate time.Time `json:"PremiereDate,omitempty"`
	ImageUrl string `json:"ImageUrl,omitempty"`
	SearchProviderName string `json:"SearchProviderName,omitempty"`
	GameSystem string `json:"GameSystem,omitempty"`
	Overview string `json:"Overview,omitempty"`
	DisambiguationComment string `json:"DisambiguationComment,omitempty"`
	AlbumArtist *RemoteSearchResult `json:"AlbumArtist,omitempty"`
	Artists []RemoteSearchResult `json:"Artists,omitempty"`
}
