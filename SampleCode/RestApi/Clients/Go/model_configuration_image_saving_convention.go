/*
 * Emby Server REST API (BETA)
 *
 * Explore the Emby Server API
 *
 */
package embyclient-rest-go

type ConfigurationImageSavingConvention string

// List of Configuration.ImageSavingConvention
const (
	LEGACY_ConfigurationImageSavingConvention ConfigurationImageSavingConvention = "Legacy"
	COMPATIBLE_ConfigurationImageSavingConvention ConfigurationImageSavingConvention = "Compatible"
)
