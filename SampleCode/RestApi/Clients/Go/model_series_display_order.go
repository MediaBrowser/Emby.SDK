/*
 * Emby Server REST API (BETA)
 *
 * Explore the Emby Server API
 *
 * API version: 4.8.0.3
 */
package embyclient-rest-go

type SeriesDisplayOrder string

// List of SeriesDisplayOrder
const (
	AIRED_SeriesDisplayOrder SeriesDisplayOrder = "Aired"
	DVD_SeriesDisplayOrder SeriesDisplayOrder = "Dvd"
	ABSOLUTE_SeriesDisplayOrder SeriesDisplayOrder = "Absolute"
)
