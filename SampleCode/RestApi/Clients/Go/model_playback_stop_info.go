/*
 * Emby Server REST API
 *
 * Explore the Emby Server API
 *
 */
package embyclient-rest-go

// Class PlaybackStopInfo.  
type PlaybackStopInfo struct {
	NowPlayingQueue []QueueItem `json:"NowPlayingQueue,omitempty"`
	PlaylistItemId string `json:"PlaylistItemId,omitempty"`
	PlaylistIndex int32 `json:"PlaylistIndex,omitempty"`
	PlaylistLength int32 `json:"PlaylistLength,omitempty"`
	Item *BaseItemDto `json:"Item,omitempty"`
	// The item identifier.
	ItemId string `json:"ItemId,omitempty"`
	// The session id.
	SessionId string `json:"SessionId,omitempty"`
	// The media version identifier.
	MediaSourceId string `json:"MediaSourceId,omitempty"`
	// The position ticks.
	PositionTicks int64 `json:"PositionTicks,omitempty"`
	// The live stream identifier.
	LiveStreamId string `json:"LiveStreamId,omitempty"`
	// The play session identifier.
	PlaySessionId string `json:"PlaySessionId,omitempty"`
	// A value indicating whether this `MediaBrowser.Model.Session.PlaybackStopInfo` is failed.
	Failed bool `json:"Failed,omitempty"`
	IsAutomated bool `json:"IsAutomated,omitempty"`
	NextMediaType string `json:"NextMediaType,omitempty"`
}
