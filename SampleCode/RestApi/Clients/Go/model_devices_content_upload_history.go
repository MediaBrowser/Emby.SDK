/*
 * Emby Server REST API (BETA)
 *
 * Explore the Emby Server API
 *
 * API version: 4.8.0.5
 */
package embyclient-rest-go

type DevicesContentUploadHistory struct {
	DeviceId string `json:"DeviceId,omitempty"`
	FilesUploaded []DevicesLocalFileInfo `json:"FilesUploaded,omitempty"`
}
