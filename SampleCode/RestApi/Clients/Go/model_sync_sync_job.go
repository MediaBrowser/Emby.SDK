/*
 * Emby REST API
 *
 * Explore the Emby Server API
 *
 */
package embyclient-rest-go
import (
	"time"
)

type SyncSyncJob struct {
	Id int64 `json:"Id,omitempty"`
	TargetId string `json:"TargetId,omitempty"`
	TargetName string `json:"TargetName,omitempty"`
	Quality string `json:"Quality,omitempty"`
	Bitrate int32 `json:"Bitrate,omitempty"`
	Container string `json:"Container,omitempty"`
	VideoCodec string `json:"VideoCodec,omitempty"`
	AudioCodec string `json:"AudioCodec,omitempty"`
	Profile string `json:"Profile,omitempty"`
	Category *SyncSyncCategory `json:"Category,omitempty"`
	ParentId int64 `json:"ParentId,omitempty"`
	Progress float64 `json:"Progress,omitempty"`
	Name string `json:"Name,omitempty"`
	Status *SyncSyncJobStatus `json:"Status,omitempty"`
	UserId int64 `json:"UserId,omitempty"`
	UnwatchedOnly bool `json:"UnwatchedOnly,omitempty"`
	SyncNewContent bool `json:"SyncNewContent,omitempty"`
	ItemLimit int32 `json:"ItemLimit,omitempty"`
	RequestedItemIds []int64 `json:"RequestedItemIds,omitempty"`
	DateCreated time.Time `json:"DateCreated,omitempty"`
	DateLastModified time.Time `json:"DateLastModified,omitempty"`
	ItemCount int32 `json:"ItemCount,omitempty"`
	ParentName string `json:"ParentName,omitempty"`
	PrimaryImageItemId string `json:"PrimaryImageItemId,omitempty"`
	PrimaryImageTag string `json:"PrimaryImageTag,omitempty"`
}
