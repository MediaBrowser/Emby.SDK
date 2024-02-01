/*
 * Emby Server REST API
 *
 * Explore the Emby Server API
 *
 */
package embyclient-rest-go

type SubtitleProfile struct {
	Format string `json:"Format,omitempty"`
	Method *SubtitleDeliveryMethod `json:"Method,omitempty"`
	DidlMode string `json:"DidlMode,omitempty"`
	Language string `json:"Language,omitempty"`
	Container string `json:"Container,omitempty"`
	Protocol string `json:"Protocol,omitempty"`
}
