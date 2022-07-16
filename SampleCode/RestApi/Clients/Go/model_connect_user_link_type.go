/*
 * Emby Server REST API (BETA)
 *
 * Explore the Emby Server API
 *
 * API version: 4.8.0.6
 */
package embyclient-rest-go

type ConnectUserLinkType string

// List of Connect.UserLinkType
const (
	LINKED_USER_ConnectUserLinkType ConnectUserLinkType = "LinkedUser"
	GUEST_ConnectUserLinkType ConnectUserLinkType = "Guest"
)
