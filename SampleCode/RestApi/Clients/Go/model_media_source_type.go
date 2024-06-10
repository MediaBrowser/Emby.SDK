/*
 * Emby Server REST API (BETA)
 *
 * Explore the Emby Server API
 *
 */
package embyclient

type MediaSourceType string

// List of MediaSourceType
const (
	DEFAULT__MediaSourceType MediaSourceType = "Default"
	GROUPING_MediaSourceType MediaSourceType = "Grouping"
	PLACEHOLDER_MediaSourceType MediaSourceType = "Placeholder"
)
