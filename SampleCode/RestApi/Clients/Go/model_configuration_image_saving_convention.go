/*
 * Emby Server REST API (BETA)
 *
 * Explore the Emby Server API
 *
 * API version: 4.8.0.5
 */
package embyclient-rest-go

type ConfigurationImageSavingConvention string

// List of Configuration.ImageSavingConvention
const (
	LEGACY_ConfigurationImageSavingConvention ConfigurationImageSavingConvention = "Legacy"
	COMPATIBLE_ConfigurationImageSavingConvention ConfigurationImageSavingConvention = "Compatible"
)
