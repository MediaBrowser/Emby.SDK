/*
 * Emby Server REST API (BETA)
 *
 * Explore the Emby Server API
 *
 */
package embyclient

type LiveTvKeywordInfo struct {
	KeywordType *LiveTvKeywordType `json:"KeywordType,omitempty"`
	Keyword string `json:"Keyword,omitempty"`
}
