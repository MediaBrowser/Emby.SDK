/*
 * Emby Server REST API (BETA)
 *
 * Explore the Emby Server API
 *
 */
package embyclient

type SleepTimerMode string

// List of SleepTimerMode
const (
	NONE_SleepTimerMode SleepTimerMode = "None"
	AFTER_ITEM_SleepTimerMode SleepTimerMode = "AfterItem"
	AT_TIME_SleepTimerMode SleepTimerMode = "AtTime"
)
