//
// UsersUserAction.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation



public struct UsersUserAction: Codable {

    public var _id: String?
    public var serverId: String?
    public var userId: String?
    public var itemId: String?
    public var type: UsersUserActionType?
    public var date: Date?
    public var positionTicks: Int64?

    public init(_id: String? = nil, serverId: String? = nil, userId: String? = nil, itemId: String? = nil, type: UsersUserActionType? = nil, date: Date? = nil, positionTicks: Int64? = nil) {
        self._id = _id
        self.serverId = serverId
        self.userId = userId
        self.itemId = itemId
        self.type = type
        self.date = date
        self.positionTicks = positionTicks
    }

    public enum CodingKeys: String, CodingKey { 
        case _id = "Id"
        case serverId = "ServerId"
        case userId = "UserId"
        case itemId = "ItemId"
        case type = "Type"
        case date = "Date"
        case positionTicks = "PositionTicks"
    }

}