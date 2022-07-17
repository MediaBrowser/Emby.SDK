/*
 * Emby Server REST API (BETA)
 *
 * Explore the Emby Server API
 *
 */
package embyclient-rest-go

type LibraryPlayAccess string

// List of Library.PlayAccess
const (
	FULL_LibraryPlayAccess LibraryPlayAccess = "Full"
	NONE_LibraryPlayAccess LibraryPlayAccess = "None"
)
