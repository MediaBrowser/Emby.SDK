/*
 * Emby Server REST API (BETA)
 *
 * Explore the Emby Server API
 *
 * API version: 4.8.0.5
 */
package embyclient-rest-go

type MediaInfoMediaProtocol string

// List of MediaInfo.MediaProtocol
const (
	FILE_MediaInfoMediaProtocol MediaInfoMediaProtocol = "File"
	HTTP_MediaInfoMediaProtocol MediaInfoMediaProtocol = "Http"
	RTMP_MediaInfoMediaProtocol MediaInfoMediaProtocol = "Rtmp"
	RTSP_MediaInfoMediaProtocol MediaInfoMediaProtocol = "Rtsp"
	UDP_MediaInfoMediaProtocol MediaInfoMediaProtocol = "Udp"
	RTP_MediaInfoMediaProtocol MediaInfoMediaProtocol = "Rtp"
	FTP_MediaInfoMediaProtocol MediaInfoMediaProtocol = "Ftp"
	MMS_MediaInfoMediaProtocol MediaInfoMediaProtocol = "Mms"
)
