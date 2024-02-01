/*
 * Emby Server REST API
 *
 * Explore the Emby Server API
 *
 */
package embyclient-rest-go

type SyncJobItemStatus string

// List of SyncJobItemStatus
const (
	QUEUED_SyncJobItemStatus SyncJobItemStatus = "Queued"
	CONVERTING_SyncJobItemStatus SyncJobItemStatus = "Converting"
	READY_TO_TRANSFER_SyncJobItemStatus SyncJobItemStatus = "ReadyToTransfer"
	TRANSFERRING_SyncJobItemStatus SyncJobItemStatus = "Transferring"
	SYNCED_SyncJobItemStatus SyncJobItemStatus = "Synced"
	FAILED_SyncJobItemStatus SyncJobItemStatus = "Failed"
)
