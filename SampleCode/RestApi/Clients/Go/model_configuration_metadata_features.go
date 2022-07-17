/*
 * Emby Server REST API (BETA)
 *
 * Explore the Emby Server API
 *
 */
package embyclient-rest-go

type ConfigurationMetadataFeatures string

// List of Configuration.MetadataFeatures
const (
	COLLECTIONS_ConfigurationMetadataFeatures ConfigurationMetadataFeatures = "Collections"
	ADULT_ConfigurationMetadataFeatures ConfigurationMetadataFeatures = "Adult"
	REQUIRED_SETUP_ConfigurationMetadataFeatures ConfigurationMetadataFeatures = "RequiredSetup"
)
