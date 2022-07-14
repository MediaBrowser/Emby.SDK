/*
 * Emby Server REST API (BETA)
 *
 * Explore the Emby Server API
 *
 * API version: 4.8.0.3
 */
package embyclient-rest-go

type SortOrder string

// List of SortOrder
const (
	ASCENDING_SortOrder SortOrder = "Ascending"
	DESCENDING_SortOrder SortOrder = "Descending"
)
