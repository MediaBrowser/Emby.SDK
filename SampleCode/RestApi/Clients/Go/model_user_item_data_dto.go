/*
 * Emby Server REST API (BETA)
 *
 * Explore the Emby Server API
 *
 */
package embyclient-rest-go
import (
	"time"
)

type UserItemDataDto struct {
	Rating float64 `json:"Rating,omitempty"`
	PlayedPercentage float64 `json:"PlayedPercentage,omitempty"`
	UnplayedItemCount int32 `json:"UnplayedItemCount,omitempty"`
	PlaybackPositionTicks int64 `json:"PlaybackPositionTicks,omitempty"`
	PlayCount int32 `json:"PlayCount,omitempty"`
	IsFavorite bool `json:"IsFavorite,omitempty"`
	LastPlayedDate time.Time `json:"LastPlayedDate,omitempty"`
	Played bool `json:"Played,omitempty"`
	Key string `json:"Key,omitempty"`
	ItemId string `json:"ItemId,omitempty"`
	ServerId string `json:"ServerId,omitempty"`
}
