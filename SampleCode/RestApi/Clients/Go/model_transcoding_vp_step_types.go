/*
 * Emby Server REST API
 *
 * Explore the Emby Server API
 *
 */
package embyclient-rest-go
// TranscodingVpStepTypes : Video Processing Step Type enum.  
type TranscodingVpStepTypes string

// List of Transcoding.VpStepTypes
const (
	DECODER_TranscodingVpStepTypes TranscodingVpStepTypes = "Decoder"
	ENCODER_TranscodingVpStepTypes TranscodingVpStepTypes = "Encoder"
	SCALING_TranscodingVpStepTypes TranscodingVpStepTypes = "Scaling"
	DEINTERLACE_TranscodingVpStepTypes TranscodingVpStepTypes = "Deinterlace"
	SUBTITLE_OVERLAY_TranscodingVpStepTypes TranscodingVpStepTypes = "SubtitleOverlay"
	TONE_MAPPING_TranscodingVpStepTypes TranscodingVpStepTypes = "ToneMapping"
	COLOR_CONVERSION_TranscodingVpStepTypes TranscodingVpStepTypes = "ColorConversion"
	SPLIT_CAPTIONS_TranscodingVpStepTypes TranscodingVpStepTypes = "SplitCaptions"
	TEXT_SUB2_VIDEO_TranscodingVpStepTypes TranscodingVpStepTypes = "TextSub2Video"
	GRAPHIC_SUB2_VIDEO_TranscodingVpStepTypes TranscodingVpStepTypes = "GraphicSub2Video"
	GRAPHIC_SUB2_TEXT_TranscodingVpStepTypes TranscodingVpStepTypes = "GraphicSub2Text"
	BURN_IN_TEXT_SUBS_TranscodingVpStepTypes TranscodingVpStepTypes = "BurnInTextSubs"
	BURN_IN_GRAPHIC_SUBS_TranscodingVpStepTypes TranscodingVpStepTypes = "BurnInGraphicSubs"
	SCALE_SUBS_TranscodingVpStepTypes TranscodingVpStepTypes = "ScaleSubs"
	TEXT_MOD_TranscodingVpStepTypes TranscodingVpStepTypes = "TextMod"
	CENSOR_TranscodingVpStepTypes TranscodingVpStepTypes = "Censor"
	SHOW_SPEAKER_TranscodingVpStepTypes TranscodingVpStepTypes = "ShowSpeaker"
	STRIP_STYLES_TranscodingVpStepTypes TranscodingVpStepTypes = "StripStyles"
	CONNECT_TO_TranscodingVpStepTypes TranscodingVpStepTypes = "ConnectTo"
)
