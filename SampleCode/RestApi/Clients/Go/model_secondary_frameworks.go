/*
 * Emby Server REST API
 *
 * Explore the Emby Server API
 *
 */
package embyclient-rest-go
// SecondaryFrameworks : Enum defining secondary frameworks for encoding and decoding.      While most of these are hardware acceleration frameworks, this is not a necessity             (e.g. Android MediaCodec offers software codecs as well).  
type SecondaryFrameworks string

// List of SecondaryFrameworks
const (
	UNKNOWN_SecondaryFrameworks SecondaryFrameworks = "Unknown"
	NONE_SecondaryFrameworks SecondaryFrameworks = "None"
	AMD_AMF_SecondaryFrameworks SecondaryFrameworks = "AmdAmf"
	MEDIA_CODEC_SecondaryFrameworks SecondaryFrameworks = "MediaCodec"
	NV_ENC_DEC_SecondaryFrameworks SecondaryFrameworks = "NvEncDec"
	OPEN_MAX_SecondaryFrameworks SecondaryFrameworks = "OpenMax"
	QUICK_SYNC_SecondaryFrameworks SecondaryFrameworks = "QuickSync"
	VA_API_SecondaryFrameworks SecondaryFrameworks = "VaApi"
	V4_L2_SecondaryFrameworks SecondaryFrameworks = "V4L2"
	DX_VA_SecondaryFrameworks SecondaryFrameworks = "DxVa"
	D3D11VA_SecondaryFrameworks SecondaryFrameworks = "D3d11va"
	VIDEO_TOOLBOX_SecondaryFrameworks SecondaryFrameworks = "VideoToolbox"
	MMAL_SecondaryFrameworks SecondaryFrameworks = "Mmal"
)
