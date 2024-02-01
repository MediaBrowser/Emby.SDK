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

type UserAction struct {
	Id string `json:"Id,omitempty"`
	ServerId string `json:"ServerId,omitempty"`
	UserId string `json:"UserId,omitempty"`
	ItemId string `json:"ItemId,omitempty"`
	Type_ *UserActionType `json:"Type,omitempty"`
	Date time.Time `json:"Date,omitempty"`
	PositionTicks int64 `json:"PositionTicks,omitempty"`
	Played bool `json:"Played,omitempty"`
	IsFavorite bool `json:"IsFavorite,omitempty"`
}
