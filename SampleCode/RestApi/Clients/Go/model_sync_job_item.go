/*
 * Emby Server REST API
 *
 * Explore the Emby Server API
 *
 */
package embyclient-rest-go
import (
	"time"
)

type SyncJobItem struct {
	Id int64 `json:"Id,omitempty"`
	JobId int64 `json:"JobId,omitempty"`
	ItemId int64 `json:"ItemId,omitempty"`
	ItemName string `json:"ItemName,omitempty"`
	MediaSourceId string `json:"MediaSourceId,omitempty"`
	MediaSource *MediaSourceInfo `json:"MediaSource,omitempty"`
	TargetId string `json:"TargetId,omitempty"`
	InternalTargetId int64 `json:"InternalTargetId,omitempty"`
	OutputPath string `json:"OutputPath,omitempty"`
	Status *SyncJobItemStatus `json:"Status,omitempty"`
	Progress float64 `json:"Progress,omitempty"`
	DateCreated time.Time `json:"DateCreated,omitempty"`
	PrimaryImageItemId string `json:"PrimaryImageItemId,omitempty"`
	PrimaryImageTag string `json:"PrimaryImageTag,omitempty"`
	TemporaryPath string `json:"TemporaryPath,omitempty"`
	AdditionalFiles []ItemFileInfo `json:"AdditionalFiles,omitempty"`
}
