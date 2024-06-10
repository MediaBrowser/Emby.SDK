/*
 * Emby Server REST API (BETA)
 *
 * Explore the Emby Server API
 *
 */
package embyclient

type SubtitleDeliveryMethod string

// List of SubtitleDeliveryMethod
const (
	ENCODE_SubtitleDeliveryMethod SubtitleDeliveryMethod = "Encode"
	EMBED_SubtitleDeliveryMethod SubtitleDeliveryMethod = "Embed"
	EXTERNAL_SubtitleDeliveryMethod SubtitleDeliveryMethod = "External"
	HLS_SubtitleDeliveryMethod SubtitleDeliveryMethod = "Hls"
	VIDEO_SIDE_DATA_SubtitleDeliveryMethod SubtitleDeliveryMethod = "VideoSideData"
)
