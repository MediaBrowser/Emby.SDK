/*
 * Emby Server REST API
 *
 * Explore the Emby Server API
 *
 */
package embyclient-rest-go

type LibraryUserCopyOptions string

// List of Library.UserCopyOptions
const (
	USER_POLICY_LibraryUserCopyOptions LibraryUserCopyOptions = "UserPolicy"
	USER_CONFIGURATION_LibraryUserCopyOptions LibraryUserCopyOptions = "UserConfiguration"
)
