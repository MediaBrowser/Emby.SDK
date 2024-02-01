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

// Class UserItemDataDto  
type UserItemDataDto struct {
	// The rating.
	Rating float64 `json:"Rating,omitempty"`
	// The played percentage.
	PlayedPercentage float64 `json:"PlayedPercentage,omitempty"`
	// The unplayed item count.
	UnplayedItemCount int32 `json:"UnplayedItemCount,omitempty"`
	// The playback position ticks.
	PlaybackPositionTicks int64 `json:"PlaybackPositionTicks,omitempty"`
	// The play count.
	PlayCount int32 `json:"PlayCount,omitempty"`
	// A value indicating whether this instance is favorite.
	IsFavorite bool `json:"IsFavorite,omitempty"`
	// The last played date.
	LastPlayedDate time.Time `json:"LastPlayedDate,omitempty"`
	// A value indicating whether this `MediaBrowser.Model.Dto.UserItemDataDto` is played.
	Played bool `json:"Played,omitempty"`
	// The key.
	Key string `json:"Key,omitempty"`
	// The item identifier.
	ItemId string `json:"ItemId,omitempty"`
	// Used only by our Windows app. Not used by Emby Server.
	ServerId string `json:"ServerId,omitempty"`
}
