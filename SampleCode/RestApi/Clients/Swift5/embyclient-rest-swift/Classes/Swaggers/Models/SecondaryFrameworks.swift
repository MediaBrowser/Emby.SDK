//
// SecondaryFrameworks.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation


/** Enum defining secondary frameworks for encoding and decoding.      While most of these are hardware acceleration frameworks, this is not a necessity             (e.g. Android MediaCodec offers software codecs as well).   */
public enum SecondaryFrameworks: String, Codable {
    case unknown = "Unknown"
    case _none = "None"
    case amdAmf = "AmdAmf"
    case mediaCodec = "MediaCodec"
    case nvEncDec = "NvEncDec"
    case openMax = "OpenMax"
    case quickSync = "QuickSync"
    case vaApi = "VaApi"
    case v4L2 = "V4L2"
    case dxVa = "DxVa"
    case d3d11va = "D3d11va"
    case videoToolbox = "VideoToolbox"
    case mmal = "Mmal"
}