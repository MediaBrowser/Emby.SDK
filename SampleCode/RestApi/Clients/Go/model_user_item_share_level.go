/*
 * Emby Server REST API
 *
 * Explore the Emby Server API
 *
 */
package embyclient-rest-go

type UserItemShareLevel string

// List of UserItemShareLevel
const (
	NONE_UserItemShareLevel UserItemShareLevel = "None"
	READ_UserItemShareLevel UserItemShareLevel = "Read"
	WRITE_UserItemShareLevel UserItemShareLevel = "Write"
	MANAGE_UserItemShareLevel UserItemShareLevel = "Manage"
	MANAGE_DELETE_UserItemShareLevel UserItemShareLevel = "ManageDelete"
)
