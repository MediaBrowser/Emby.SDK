/*
 * Emby Server REST API (BETA)
 *
 * Explore the Emby Server API
 *
 * API version: 4.8.0.6
 */
package embyclient-rest-go

type RatingType string

// List of RatingType
const (
	SCORE_RatingType RatingType = "Score"
	LIKES_RatingType RatingType = "Likes"
)