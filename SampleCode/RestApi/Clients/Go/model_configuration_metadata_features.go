/*
 * Emby Server REST API (BETA)
 *
 * Explore the Emby Server API
 *
 * API version: 4.8.0.5
 */
package embyclient-rest-go

type ConfigurationMetadataFeatures string

// List of Configuration.MetadataFeatures
const (
	COLLECTIONS_ConfigurationMetadataFeatures ConfigurationMetadataFeatures = "Collections"
	ADULT_ConfigurationMetadataFeatures ConfigurationMetadataFeatures = "Adult"
	REQUIRED_SETUP_ConfigurationMetadataFeatures ConfigurationMetadataFeatures = "RequiredSetup"
)
