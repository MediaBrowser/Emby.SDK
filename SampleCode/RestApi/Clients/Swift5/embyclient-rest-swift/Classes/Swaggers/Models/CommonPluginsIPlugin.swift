//
// CommonPluginsIPlugin.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation


/** Interface IPlugin   */

public struct CommonPluginsIPlugin: Codable {

    /** The name of the plugin */
    public var name: String?
    /** The description. */
    public var _description: String?
    /** The unique id. */
    public var _id: String?
    public var version: Version?
    /** The path to the assembly file */
    public var assemblyFilePath: String?
    /** The full path to the data folder, where the plugin can store any miscellaneous files needed */
    public var dataFolderPath: String?

    public init(name: String? = nil, _description: String? = nil, _id: String? = nil, version: Version? = nil, assemblyFilePath: String? = nil, dataFolderPath: String? = nil) {
        self.name = name
        self._description = _description
        self._id = _id
        self.version = version
        self.assemblyFilePath = assemblyFilePath
        self.dataFolderPath = dataFolderPath
    }

    public enum CodingKeys: String, CodingKey { 
        case name = "Name"
        case _description = "Description"
        case _id = "Id"
        case version = "Version"
        case assemblyFilePath = "AssemblyFilePath"
        case dataFolderPath = "DataFolderPath"
    }

}