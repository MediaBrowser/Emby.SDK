//
// ExternalIdInfo.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation



public struct ExternalIdInfo: Codable {

    /** The name. */
    public var name: String?
    /** The key. */
    public var key: String?
    public var website: String?
    /** The URL format string. */
    public var urlFormatString: String?
    public var isSupportedAsIdentifier: Bool?

    public init(name: String? = nil, key: String? = nil, website: String? = nil, urlFormatString: String? = nil, isSupportedAsIdentifier: Bool? = nil) {
        self.name = name
        self.key = key
        self.website = website
        self.urlFormatString = urlFormatString
        self.isSupportedAsIdentifier = isSupportedAsIdentifier
    }

    public enum CodingKeys: String, CodingKey { 
        case name = "Name"
        case key = "Key"
        case website = "Website"
        case urlFormatString = "UrlFormatString"
        case isSupportedAsIdentifier = "IsSupportedAsIdentifier"
    }

}