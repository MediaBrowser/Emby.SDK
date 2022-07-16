/*
 * Emby Server REST API (BETA)
 *
 * Explore the Emby Server API
 *
 * API version: 4.8.0.5
 */
package embyclient-rest-go

type LiveTvKeywordInfo struct {
	KeywordType *LiveTvKeywordType `json:"KeywordType,omitempty"`
	Keyword string `json:"Keyword,omitempty"`
}
