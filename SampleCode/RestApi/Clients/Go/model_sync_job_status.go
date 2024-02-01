/*
 * Emby Server REST API
 *
 * Explore the Emby Server API
 *
 */
package embyclient-rest-go

type SyncJobStatus string

// List of SyncJobStatus
const (
	QUEUED_SyncJobStatus SyncJobStatus = "Queued"
	CONVERTING_SyncJobStatus SyncJobStatus = "Converting"
	READY_TO_TRANSFER_SyncJobStatus SyncJobStatus = "ReadyToTransfer"
	TRANSFERRING_SyncJobStatus SyncJobStatus = "Transferring"
	COMPLETED_SyncJobStatus SyncJobStatus = "Completed"
	COMPLETED_WITH_ERROR_SyncJobStatus SyncJobStatus = "CompletedWithError"
	FAILED_SyncJobStatus SyncJobStatus = "Failed"
)
