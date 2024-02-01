/*
 * Emby Server REST API
 *
 * Explore the Emby Server API
 *
 */
package embyclient-rest-go
// LoggingLogSeverity : Enum LogSeverity  
type LoggingLogSeverity string

// List of Logging.LogSeverity
const (
	INFO_LoggingLogSeverity LoggingLogSeverity = "Info"
	DEBUG_LoggingLogSeverity LoggingLogSeverity = "Debug"
	WARN_LoggingLogSeverity LoggingLogSeverity = "Warn"
	ERROR__LoggingLogSeverity LoggingLogSeverity = "Error"
	FATAL_LoggingLogSeverity LoggingLogSeverity = "Fatal"
)
