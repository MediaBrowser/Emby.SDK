//
// EditObjectContainer.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation



public struct EditObjectContainer: Codable {

    public var object: Any?
    public var defaultObject: Any?
    public var typeName: String?
    public var editorRoot: EditorsEditorRoot?

    public init(object: Any? = nil, defaultObject: Any? = nil, typeName: String? = nil, editorRoot: EditorsEditorRoot? = nil) {
        self.object = object
        self.defaultObject = defaultObject
        self.typeName = typeName
        self.editorRoot = editorRoot
    }

    public enum CodingKeys: String, CodingKey { 
        case object = "Object"
        case defaultObject = "DefaultObject"
        case typeName = "TypeName"
        case editorRoot = "EditorRoot"
    }

}
