/*
 * Emby Server REST API
 *
 * Explore the Emby Server API
 *
 */
package embyclient-rest-go

type ConnectUserLinkType string

// List of Connect.UserLinkType
const (
	LINKED_USER_ConnectUserLinkType ConnectUserLinkType = "LinkedUser"
	GUEST_ConnectUserLinkType ConnectUserLinkType = "Guest"
)
