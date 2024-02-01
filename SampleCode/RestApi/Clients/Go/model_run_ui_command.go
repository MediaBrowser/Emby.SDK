/*
 * Emby Server REST API
 *
 * Explore the Emby Server API
 *
 */
package embyclient-rest-go

type RunUiCommand struct {
	PageId string `json:"PageId,omitempty"`
	CommandId string `json:"CommandId,omitempty"`
	Data string `json:"Data,omitempty"`
	ItemId string `json:"ItemId,omitempty"`
	ClientLocale string `json:"ClientLocale,omitempty"`
}
