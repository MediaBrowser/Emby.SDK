//
// LibraryAddVirtualFolder.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation



public struct LibraryAddVirtualFolder: Codable {

    public var name: String?
    public var collectionType: String?
    public var refreshLibrary: Bool?
    public var paths: [String]?
    public var libraryOptions: LibraryOptions?

    public init(name: String? = nil, collectionType: String? = nil, refreshLibrary: Bool? = nil, paths: [String]? = nil, libraryOptions: LibraryOptions? = nil) {
        self.name = name
        self.collectionType = collectionType
        self.refreshLibrary = refreshLibrary
        self.paths = paths
        self.libraryOptions = libraryOptions
    }

    public enum CodingKeys: String, CodingKey { 
        case name = "Name"
        case collectionType = "CollectionType"
        case refreshLibrary = "RefreshLibrary"
        case paths = "Paths"
        case libraryOptions = "LibraryOptions"
    }

}