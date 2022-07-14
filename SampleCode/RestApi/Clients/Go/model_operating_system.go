/*
 * Emby Server REST API (BETA)
 *
 * Explore the Emby Server API
 *
 * API version: 4.8.0.3
 */
package embyclient-rest-go

type OperatingSystem string

// List of OperatingSystem
const (
	WINDOWS_OperatingSystem OperatingSystem = "Windows"
	LINUX_OperatingSystem OperatingSystem = "Linux"
	OSX_OperatingSystem OperatingSystem = "OSX"
	BSD_OperatingSystem OperatingSystem = "BSD"
	ANDROID_OperatingSystem OperatingSystem = "Android"
)
