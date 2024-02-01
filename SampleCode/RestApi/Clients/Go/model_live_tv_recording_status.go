/*
 * Emby Server REST API
 *
 * Explore the Emby Server API
 *
 */
package embyclient-rest-go

type LiveTvRecordingStatus string

// List of LiveTv.RecordingStatus
const (
	NEW_LiveTvRecordingStatus LiveTvRecordingStatus = "New"
	IN_PROGRESS_LiveTvRecordingStatus LiveTvRecordingStatus = "InProgress"
	COMPLETED_LiveTvRecordingStatus LiveTvRecordingStatus = "Completed"
	CANCELLED_LiveTvRecordingStatus LiveTvRecordingStatus = "Cancelled"
	CONFLICTED_OK_LiveTvRecordingStatus LiveTvRecordingStatus = "ConflictedOk"
	CONFLICTED_NOT_OK_LiveTvRecordingStatus LiveTvRecordingStatus = "ConflictedNotOk"
	ERROR__LiveTvRecordingStatus LiveTvRecordingStatus = "Error"
)
