/*
 * Emby Server REST API (BETA)
 *
 * Explore the Emby Server API
 *
 */
package embyclient-rest-go

type ApiEpgRow struct {
	Channel *BaseItemDto `json:"Channel,omitempty"`
	Programs []BaseItemDto `json:"Programs,omitempty"`
}
