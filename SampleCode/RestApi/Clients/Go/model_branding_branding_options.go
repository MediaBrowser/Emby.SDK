/*
 * Emby Server REST API
 *
 * Explore the Emby Server API
 *
 */
package embyclient-rest-go

type BrandingBrandingOptions struct {
	// The login disclaimer.
	LoginDisclaimer string `json:"LoginDisclaimer,omitempty"`
	// The custom CSS.
	CustomCss string `json:"CustomCss,omitempty"`
}
