/*
 * Emby Server REST API (BETA)
 *
 * Explore the Emby Server API
 *
 */
package embyclient

type ConnectUserLinkType string

// List of Connect.UserLinkType
const (
	LINKED_USER_ConnectUserLinkType ConnectUserLinkType = "LinkedUser"
	GUEST_ConnectUserLinkType ConnectUserLinkType = "Guest"
)
