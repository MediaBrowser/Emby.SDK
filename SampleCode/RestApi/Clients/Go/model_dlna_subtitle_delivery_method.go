/*
 * Emby Server REST API (BETA)
 *
 * Explore the Emby Server API
 *
 * API version: 4.8.0.5
 */
package embyclient-rest-go

type DlnaSubtitleDeliveryMethod string

// List of Dlna.SubtitleDeliveryMethod
const (
	ENCODE_DlnaSubtitleDeliveryMethod DlnaSubtitleDeliveryMethod = "Encode"
	EMBED_DlnaSubtitleDeliveryMethod DlnaSubtitleDeliveryMethod = "Embed"
	EXTERNAL_DlnaSubtitleDeliveryMethod DlnaSubtitleDeliveryMethod = "External"
	HLS_DlnaSubtitleDeliveryMethod DlnaSubtitleDeliveryMethod = "Hls"
	VIDEO_SIDE_DATA_DlnaSubtitleDeliveryMethod DlnaSubtitleDeliveryMethod = "VideoSideData"
)
