/*
 * Emby Server REST API
 *
 * Explore the Emby Server API
 *
 */
package embyclient-rest-go

type MediaSourceType string

// List of MediaSourceType
const (
	DEFAULT__MediaSourceType MediaSourceType = "Default"
	GROUPING_MediaSourceType MediaSourceType = "Grouping"
	PLACEHOLDER_MediaSourceType MediaSourceType = "Placeholder"
)
