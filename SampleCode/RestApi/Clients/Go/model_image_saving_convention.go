/*
 * Emby Server REST API (BETA)
 *
 * Explore the Emby Server API
 *
 */
package embyclient-rest-go

type ImageSavingConvention string

// List of ImageSavingConvention
const (
	LEGACY_ImageSavingConvention ImageSavingConvention = "Legacy"
	COMPATIBLE_ImageSavingConvention ImageSavingConvention = "Compatible"
)
