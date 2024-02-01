/*
 * Emby Server REST API
 *
 * Explore the Emby Server API
 *
 */
package embyclient-rest-go

// A type for handling bit rates.      The purpose of this type is to avoid manual calculations and conversions in code,             unified handling and conversion as well as presentation through its various To\\*\\*\\*String methods.      `System.IComparable`      `System.IEquatable`1`  
type BitRate struct {
	Bps int64 `json:"bps,omitempty"`
	Kbps float64 `json:"kbps,omitempty"`
	Mbps float64 `json:"Mbps,omitempty"`
}
