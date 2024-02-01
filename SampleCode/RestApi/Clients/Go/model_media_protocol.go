/*
 * Emby Server REST API
 *
 * Explore the Emby Server API
 *
 */
package embyclient-rest-go

type MediaProtocol string

// List of MediaProtocol
const (
	FILE_MediaProtocol MediaProtocol = "File"
	HTTP_MediaProtocol MediaProtocol = "Http"
	RTMP_MediaProtocol MediaProtocol = "Rtmp"
	RTSP_MediaProtocol MediaProtocol = "Rtsp"
	UDP_MediaProtocol MediaProtocol = "Udp"
	RTP_MediaProtocol MediaProtocol = "Rtp"
	FTP_MediaProtocol MediaProtocol = "Ftp"
	MMS_MediaProtocol MediaProtocol = "Mms"
)
