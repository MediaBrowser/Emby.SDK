/*
 * Emby Server REST API
 *
 * Explore the Emby Server API
 *
 */
package embyclient-rest-go

type UserActionType string

// List of UserActionType
const (
	PLAYED_ITEM_UserActionType UserActionType = "PlayedItem"
	MARK_PLAYED_UserActionType UserActionType = "MarkPlayed"
	MARK_FAVORITE_UserActionType UserActionType = "MarkFavorite"
)
