/*
 * Emby Server REST API (BETA)
 *
 * Explore the Emby Server API
 *
 * API version: 4.8.0.5
 */
package embyclient-rest-go

type RecommendationType string

// List of RecommendationType
const (
	SIMILAR_TO_RECENTLY_PLAYED_RecommendationType RecommendationType = "SimilarToRecentlyPlayed"
	SIMILAR_TO_LIKED_ITEM_RecommendationType RecommendationType = "SimilarToLikedItem"
	HAS_DIRECTOR_FROM_RECENTLY_PLAYED_RecommendationType RecommendationType = "HasDirectorFromRecentlyPlayed"
	HAS_ACTOR_FROM_RECENTLY_PLAYED_RecommendationType RecommendationType = "HasActorFromRecentlyPlayed"
	HAS_LIKED_DIRECTOR_RecommendationType RecommendationType = "HasLikedDirector"
	HAS_LIKED_ACTOR_RecommendationType RecommendationType = "HasLikedActor"
)
