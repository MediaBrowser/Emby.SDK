/*
 * Emby Server REST API
 *
 * Explore the Emby Server API
 *
 */
package embyclient-rest-go
// SystemEvent : Enum SystemEvent  
type SystemEvent string

// List of SystemEvent
const (
	WAKE_FROM_SLEEP_SystemEvent SystemEvent = "WakeFromSleep"
	DISPLAY_CONFIGURATION_CHANGE_SystemEvent SystemEvent = "DisplayConfigurationChange"
	NETWORK_CHANGE_SystemEvent SystemEvent = "NetworkChange"
)
