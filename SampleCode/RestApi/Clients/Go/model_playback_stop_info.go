/*
 * Emby Server REST API (BETA)
 *
 * Explore the Emby Server API
 *
 * API version: 4.8.0.3
 */
package embyclient-rest-go

type PlaybackStopInfo struct {
	NowPlayingQueue []QueueItem `json:"NowPlayingQueue,omitempty"`
	PlaylistItemId string `json:"PlaylistItemId,omitempty"`
	PlaylistIndex int32 `json:"PlaylistIndex,omitempty"`
	PlaylistLength int32 `json:"PlaylistLength,omitempty"`
	Item *BaseItemDto `json:"Item,omitempty"`
	ItemId string `json:"ItemId,omitempty"`
	SessionId string `json:"SessionId,omitempty"`
	MediaSourceId string `json:"MediaSourceId,omitempty"`
	PositionTicks int64 `json:"PositionTicks,omitempty"`
	LiveStreamId string `json:"LiveStreamId,omitempty"`
	PlaySessionId string `json:"PlaySessionId,omitempty"`
	Failed bool `json:"Failed,omitempty"`
	NextMediaType string `json:"NextMediaType,omitempty"`
}
