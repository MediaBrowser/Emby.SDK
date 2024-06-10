/*
 * Emby Server REST API (BETA)
 *
 * Explore the Emby Server API
 *
 */
package embyclient

type FeatureInfo struct {
	Name string `json:"Name,omitempty"`
	Id string `json:"Id,omitempty"`
	FeatureType *FeatureType `json:"FeatureType,omitempty"`
}
