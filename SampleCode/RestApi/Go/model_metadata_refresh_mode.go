/*
 * Emby Server REST API (BETA)
 *
 * Explore the Emby Server API
 *
 */
package embyclient

type MetadataRefreshMode string

// List of MetadataRefreshMode
const (
	VALIDATION_ONLY_MetadataRefreshMode MetadataRefreshMode = "ValidationOnly"
	DEFAULT__MetadataRefreshMode MetadataRefreshMode = "Default"
	FULL_REFRESH_MetadataRefreshMode MetadataRefreshMode = "FullRefresh"
)
