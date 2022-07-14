/*
 * Emby Server REST API (BETA)
 *
 * Explore the Emby Server API
 *
 * API version: 4.8.0.3
 */
package embyclient-rest-go

type MediaSourceType string

// List of MediaSourceType
const (
	DEFAULT__MediaSourceType MediaSourceType = "Default"
	GROUPING_MediaSourceType MediaSourceType = "Grouping"
	PLACEHOLDER_MediaSourceType MediaSourceType = "Placeholder"
)
