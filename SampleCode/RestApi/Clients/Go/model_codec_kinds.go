/*
 * Emby Server REST API
 *
 * Explore the Emby Server API
 *
 */
package embyclient-rest-go
// CodecKinds : Enum defining the kind of media a codec is processing.  
type CodecKinds string

// List of CodecKinds
const (
	AUDIO_CodecKinds CodecKinds = "Audio"
	VIDEO_CodecKinds CodecKinds = "Video"
	SUB_TITLES_CodecKinds CodecKinds = "SubTitles"
)
