/*
 * Emby REST API
 *
 * Explore the Emby Server API
 *
 */
package embyclient-rest-go

type EmbyMediaModelTypesProfileLevelInformation struct {
	Profile *EmbyMediaModelTypesProfileInformation `json:"Profile,omitempty"`
	Level *EmbyMediaModelTypesLevelInformation `json:"Level,omitempty"`
}
