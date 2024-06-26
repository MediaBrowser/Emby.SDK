//
// SyncDataResponse.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation



public struct SyncDataResponse: Codable {

    public var itemIdsToRemove: [String]?

    public init(itemIdsToRemove: [String]? = nil) {
        self.itemIdsToRemove = itemIdsToRemove
    }

    public enum CodingKeys: String, CodingKey { 
        case itemIdsToRemove = "ItemIdsToRemove"
    }

}
