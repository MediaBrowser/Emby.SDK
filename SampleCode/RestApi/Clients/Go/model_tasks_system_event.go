/*
 * Emby REST API
 *
 * Explore the Emby Server API
 *
 */
package embyclient-rest-go

type TasksSystemEvent string

// List of Tasks.SystemEvent
const (
	WAKE_FROM_SLEEP_TasksSystemEvent TasksSystemEvent = "WakeFromSleep"
	DISPLAY_CONFIGURATION_CHANGE_TasksSystemEvent TasksSystemEvent = "DisplayConfigurationChange"
	NETWORK_CHANGE_TasksSystemEvent TasksSystemEvent = "NetworkChange"
)
