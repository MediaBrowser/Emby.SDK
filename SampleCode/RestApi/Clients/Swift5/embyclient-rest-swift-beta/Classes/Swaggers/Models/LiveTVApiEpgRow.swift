//
// LiveTVApiEpgRow.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation



public struct LiveTVApiEpgRow: Codable {

    public var channel: BaseItemDto?
    public var programs: [BaseItemDto]?

    public init(channel: BaseItemDto? = nil, programs: [BaseItemDto]? = nil) {
        self.channel = channel
        self.programs = programs
    }

    public enum CodingKeys: String, CodingKey { 
        case channel = "Channel"
        case programs = "Programs"
    }

}