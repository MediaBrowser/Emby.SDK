/*
 * Emby REST API
 *
 * Explore the Emby Server API
 *
 */
package embyclient-rest-go

type ProvidersMetadataRefreshMode string

// List of Providers.MetadataRefreshMode
const (
	VALIDATION_ONLY_ProvidersMetadataRefreshMode ProvidersMetadataRefreshMode = "ValidationOnly"
	DEFAULT__ProvidersMetadataRefreshMode ProvidersMetadataRefreshMode = "Default"
	FULL_REFRESH_ProvidersMetadataRefreshMode ProvidersMetadataRefreshMode = "FullRefresh"
)
