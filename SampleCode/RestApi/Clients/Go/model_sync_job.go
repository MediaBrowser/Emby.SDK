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

type SyncJob struct {
	// The identifier.
	Id int64 `json:"Id,omitempty"`
	// The device identifier.
	TargetId string `json:"TargetId,omitempty"`
	InternalTargetId int64 `json:"InternalTargetId,omitempty"`
	// The name of the target.
	TargetName string `json:"TargetName,omitempty"`
	// The quality.
	Quality string `json:"Quality,omitempty"`
	// The bitrate.
	Bitrate int32 `json:"Bitrate,omitempty"`
	Container string `json:"Container,omitempty"`
	VideoCodec string `json:"VideoCodec,omitempty"`
	AudioCodec string `json:"AudioCodec,omitempty"`
	// The profile.
	Profile string `json:"Profile,omitempty"`
	Category *SyncCategory `json:"Category,omitempty"`
	// The parent identifier.
	ParentId int64 `json:"ParentId,omitempty"`
	// The current progress.
	Progress float64 `json:"Progress,omitempty"`
	// The name.
	Name string `json:"Name,omitempty"`
	Status *SyncJobStatus `json:"Status,omitempty"`
	// The user identifier.
	UserId int64 `json:"UserId,omitempty"`
	// A value indicating whether \\[unwatched only\\].
	UnwatchedOnly bool `json:"UnwatchedOnly,omitempty"`
	// A value indicating whether \\[synchronize new content\\].
	SyncNewContent bool `json:"SyncNewContent,omitempty"`
	// The item limit.
	ItemLimit int32 `json:"ItemLimit,omitempty"`
	// The requested item ids.
	RequestedItemIds []int64 `json:"RequestedItemIds,omitempty"`
	ItemId int64 `json:"ItemId,omitempty"`
	// The date created.
	DateCreated time.Time `json:"DateCreated,omitempty"`
	// The date last modified.
	DateLastModified time.Time `json:"DateLastModified,omitempty"`
	// The item count.
	ItemCount int32 `json:"ItemCount,omitempty"`
	ParentName string `json:"ParentName,omitempty"`
	PrimaryImageItemId string `json:"PrimaryImageItemId,omitempty"`
	PrimaryImageTag string `json:"PrimaryImageTag,omitempty"`
}
