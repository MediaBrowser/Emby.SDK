/*
 * Emby Server REST API
 *
 * Explore the Emby Server API
 *
 */
package embyclient-rest-go

type MarkerType string

// List of MarkerType
const (
	CHAPTER_MarkerType MarkerType = "Chapter"
	INTRO_START_MarkerType MarkerType = "IntroStart"
	INTRO_END_MarkerType MarkerType = "IntroEnd"
	CREDITS_START_MarkerType MarkerType = "CreditsStart"
)
