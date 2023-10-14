/*
 * Emby Server REST API (BETA)
 *
 * Explore the Emby Server API
 *
 */
package embyclient-rest-go

type FeatureInfo struct {
	Name string `json:"Name,omitempty"`
	Id string `json:"Id,omitempty"`
	FeatureType *FeatureType `json:"FeatureType,omitempty"`
}
