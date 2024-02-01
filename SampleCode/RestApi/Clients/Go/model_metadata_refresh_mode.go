/*
 * Emby Server REST API
 *
 * Explore the Emby Server API
 *
 */
package embyclient-rest-go

type MetadataRefreshMode string

// List of MetadataRefreshMode
const (
	VALIDATION_ONLY_MetadataRefreshMode MetadataRefreshMode = "ValidationOnly"
	DEFAULT__MetadataRefreshMode MetadataRefreshMode = "Default"
	FULL_REFRESH_MetadataRefreshMode MetadataRefreshMode = "FullRefresh"
)
