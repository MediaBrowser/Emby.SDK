/*
 * Emby Server REST API
 *
 * Explore the Emby Server API
 *
 */
package embyclient-rest-go

type DlnaProfilesDeviceIdentification struct {
	FriendlyName string `json:"FriendlyName,omitempty"`
	ModelNumber string `json:"ModelNumber,omitempty"`
	SerialNumber string `json:"SerialNumber,omitempty"`
	ModelName string `json:"ModelName,omitempty"`
	ModelDescription string `json:"ModelDescription,omitempty"`
	DeviceDescription string `json:"DeviceDescription,omitempty"`
	ModelUrl string `json:"ModelUrl,omitempty"`
	Manufacturer string `json:"Manufacturer,omitempty"`
	ManufacturerUrl string `json:"ManufacturerUrl,omitempty"`
	Headers []DlnaProfilesHttpHeaderInfo `json:"Headers,omitempty"`
}
