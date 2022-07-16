/*
 * Emby Server REST API (BETA)
 *
 * Explore the Emby Server API
 *
 * API version: 4.8.0.6
 */
package embyclient-rest-go

type MediaInfoTransportStreamTimestamp string

// List of MediaInfo.TransportStreamTimestamp
const (
	NONE_MediaInfoTransportStreamTimestamp MediaInfoTransportStreamTimestamp = "None"
	ZERO_MediaInfoTransportStreamTimestamp MediaInfoTransportStreamTimestamp = "Zero"
	VALID_MediaInfoTransportStreamTimestamp MediaInfoTransportStreamTimestamp = "Valid"
)
