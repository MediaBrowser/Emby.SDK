//
// EmbyWebGenericUIApiEndpointsRunUICommand.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation



public struct EmbyWebGenericUIApiEndpointsRunUICommand: Codable {

    public var pageId: String?
    public var commandId: String?
    public var data: String?
    public var itemId: String?
    public var clientLocale: String?

    public init(pageId: String? = nil, commandId: String? = nil, data: String? = nil, itemId: String? = nil, clientLocale: String? = nil) {
        self.pageId = pageId
        self.commandId = commandId
        self.data = data
        self.itemId = itemId
        self.clientLocale = clientLocale
    }

    public enum CodingKeys: String, CodingKey { 
        case pageId = "PageId"
        case commandId = "CommandId"
        case data = "Data"
        case itemId = "ItemId"
        case clientLocale = "ClientLocale"
    }

}