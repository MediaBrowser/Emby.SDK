//
// LibraryUpdateLibraryOptions.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation



public struct LibraryUpdateLibraryOptions: Codable {

    public var _id: String?
    public var libraryOptions: ConfigurationLibraryOptions?

    public init(_id: String? = nil, libraryOptions: ConfigurationLibraryOptions? = nil) {
        self._id = _id
        self.libraryOptions = libraryOptions
    }

    public enum CodingKeys: String, CodingKey { 
        case _id = "Id"
        case libraryOptions = "LibraryOptions"
    }

}