//
// ConfigurationMediaPathInfo.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation



public struct ConfigurationMediaPathInfo: Codable {

    public var path: String?
    public var networkPath: String?
    public var username: String?
    public var password: String?

    public init(path: String? = nil, networkPath: String? = nil, username: String? = nil, password: String? = nil) {
        self.path = path
        self.networkPath = networkPath
        self.username = username
        self.password = password
    }

    public enum CodingKeys: String, CodingKey { 
        case path = "Path"
        case networkPath = "NetworkPath"
        case username = "Username"
        case password = "Password"
    }

}