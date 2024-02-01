/*
 * Emby Server REST API
 *
 * Explore the Emby Server API
 *
 */
package embyclient-rest-go

type MetadataFeatures string

// List of MetadataFeatures
const (
	COLLECTIONS_MetadataFeatures MetadataFeatures = "Collections"
	ADULT_MetadataFeatures MetadataFeatures = "Adult"
	REQUIRED_SETUP_MetadataFeatures MetadataFeatures = "RequiredSetup"
)
