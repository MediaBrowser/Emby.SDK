/*
 * Emby Server REST API (BETA)
 *
 * Explore the Emby Server API
 *
 * API version: 4.8.0.3
 */
package embyclient-rest-go

type ProvidersMetadataRefreshMode string

// List of Providers.MetadataRefreshMode
const (
	VALIDATION_ONLY_ProvidersMetadataRefreshMode ProvidersMetadataRefreshMode = "ValidationOnly"
	DEFAULT__ProvidersMetadataRefreshMode ProvidersMetadataRefreshMode = "Default"
	FULL_REFRESH_ProvidersMetadataRefreshMode ProvidersMetadataRefreshMode = "FullRefresh"
)
