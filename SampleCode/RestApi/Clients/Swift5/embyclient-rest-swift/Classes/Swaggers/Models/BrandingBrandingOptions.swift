//
// BrandingBrandingOptions.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation



public struct BrandingBrandingOptions: Codable {

    public var loginDisclaimer: String?
    public var customCss: String?

    public init(loginDisclaimer: String? = nil, customCss: String? = nil) {
        self.loginDisclaimer = loginDisclaimer
        self.customCss = customCss
    }

    public enum CodingKeys: String, CodingKey { 
        case loginDisclaimer = "LoginDisclaimer"
        case customCss = "CustomCss"
    }

}