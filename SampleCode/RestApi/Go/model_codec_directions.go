/*
 * Emby Server REST API (BETA)
 *
 * Explore the Emby Server API
 *
 */
package embyclient
// CodecDirections : Enum for indicating the processing direction of a codec.  
type CodecDirections string

// List of CodecDirections
const (
	ENCODER_CodecDirections CodecDirections = "Encoder"
	DECODER_CodecDirections CodecDirections = "Decoder"
)
