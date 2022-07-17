/*
 * Emby Server REST API (BETA)
 *
 * Explore the Emby Server API
 *
 */
package embyclient-rest-go

type MediaInfoTransportStreamTimestamp string

// List of MediaInfo.TransportStreamTimestamp
const (
	NONE_MediaInfoTransportStreamTimestamp MediaInfoTransportStreamTimestamp = "None"
	ZERO_MediaInfoTransportStreamTimestamp MediaInfoTransportStreamTimestamp = "Zero"
	VALID_MediaInfoTransportStreamTimestamp MediaInfoTransportStreamTimestamp = "Valid"
)
