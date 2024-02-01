/*
 * Emby Server REST API
 *
 * Explore the Emby Server API
 *
 */
package embyclient-rest-go

type TransportStreamTimestamp string

// List of TransportStreamTimestamp
const (
	NONE_TransportStreamTimestamp TransportStreamTimestamp = "None"
	ZERO_TransportStreamTimestamp TransportStreamTimestamp = "Zero"
	VALID_TransportStreamTimestamp TransportStreamTimestamp = "Valid"
)
