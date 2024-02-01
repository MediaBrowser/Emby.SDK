/*
 * Emby Server REST API
 *
 * Explore the Emby Server API
 *
 */
package embyclient-rest-go

type SeriesDisplayOrder string

// List of SeriesDisplayOrder
const (
	AIRED_SeriesDisplayOrder SeriesDisplayOrder = "Aired"
	DVD_SeriesDisplayOrder SeriesDisplayOrder = "Dvd"
	ABSOLUTE_SeriesDisplayOrder SeriesDisplayOrder = "Absolute"
)
