//
// ApiSetChannelSortIndex.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation



public struct ApiSetChannelSortIndex: Codable {

    public var _id: String?
    public var managementId: String?
    public var newIndex: Int?

    public init(_id: String? = nil, managementId: String? = nil, newIndex: Int? = nil) {
        self._id = _id
        self.managementId = managementId
        self.newIndex = newIndex
    }

    public enum CodingKeys: String, CodingKey { 
        case _id = "Id"
        case managementId = "ManagementId"
        case newIndex = "NewIndex"
    }

}