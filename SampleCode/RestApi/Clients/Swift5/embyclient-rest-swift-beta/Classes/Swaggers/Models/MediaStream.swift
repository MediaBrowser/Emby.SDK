//
// MediaStream.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation



public struct MediaStream: Codable {

    public var codec: String?
    public var codecTag: String?
    public var language: String?
    public var colorTransfer: String?
    public var colorPrimaries: String?
    public var colorSpace: String?
    public var comment: String?
    public var streamStartTimeTicks: Int64?
    public var timeBase: String?
    public var title: String?
    public var extradata: String?
    public var videoRange: String?
    public var displayTitle: String?
    public var displayLanguage: String?
    public var nalLengthSize: String?
    public var isInterlaced: Bool?
    public var isAVC: Bool?
    public var channelLayout: String?
    public var bitRate: Int?
    public var bitDepth: Int?
    public var refFrames: Int?
    public var rotation: Int?
    public var channels: Int?
    public var sampleRate: Int?
    public var isDefault: Bool?
    public var isForced: Bool?
    public var height: Int?
    public var width: Int?
    public var averageFrameRate: Float?
    public var realFrameRate: Float?
    public var profile: String?
    public var type: MediaStreamType?
    public var aspectRatio: String?
    public var index: Int?
    public var isExternal: Bool?
    public var deliveryMethod: DlnaSubtitleDeliveryMethod?
    public var deliveryUrl: String?
    public var isExternalUrl: Bool?
    public var isTextSubtitleStream: Bool?
    public var supportsExternalStream: Bool?
    public var path: String?
    public var _protocol: MediaInfoMediaProtocol?
    public var pixelFormat: String?
    public var level: Double?
    public var isAnamorphic: Bool?
    public var extendedVideoType: ExtendedVideoTypes?
    public var extendedVideoSubtype: ExtendedVideoSubTypes?
    public var itemId: String?
    public var serverId: String?
    public var attachmentSize: Int?
    public var mimeType: String?
    public var subtitleLocationType: SubtitleLocationType?

    public init(codec: String? = nil, codecTag: String? = nil, language: String? = nil, colorTransfer: String? = nil, colorPrimaries: String? = nil, colorSpace: String? = nil, comment: String? = nil, streamStartTimeTicks: Int64? = nil, timeBase: String? = nil, title: String? = nil, extradata: String? = nil, videoRange: String? = nil, displayTitle: String? = nil, displayLanguage: String? = nil, nalLengthSize: String? = nil, isInterlaced: Bool? = nil, isAVC: Bool? = nil, channelLayout: String? = nil, bitRate: Int? = nil, bitDepth: Int? = nil, refFrames: Int? = nil, rotation: Int? = nil, channels: Int? = nil, sampleRate: Int? = nil, isDefault: Bool? = nil, isForced: Bool? = nil, height: Int? = nil, width: Int? = nil, averageFrameRate: Float? = nil, realFrameRate: Float? = nil, profile: String? = nil, type: MediaStreamType? = nil, aspectRatio: String? = nil, index: Int? = nil, isExternal: Bool? = nil, deliveryMethod: DlnaSubtitleDeliveryMethod? = nil, deliveryUrl: String? = nil, isExternalUrl: Bool? = nil, isTextSubtitleStream: Bool? = nil, supportsExternalStream: Bool? = nil, path: String? = nil, _protocol: MediaInfoMediaProtocol? = nil, pixelFormat: String? = nil, level: Double? = nil, isAnamorphic: Bool? = nil, extendedVideoType: ExtendedVideoTypes? = nil, extendedVideoSubtype: ExtendedVideoSubTypes? = nil, itemId: String? = nil, serverId: String? = nil, attachmentSize: Int? = nil, mimeType: String? = nil, subtitleLocationType: SubtitleLocationType? = nil) {
        self.codec = codec
        self.codecTag = codecTag
        self.language = language
        self.colorTransfer = colorTransfer
        self.colorPrimaries = colorPrimaries
        self.colorSpace = colorSpace
        self.comment = comment
        self.streamStartTimeTicks = streamStartTimeTicks
        self.timeBase = timeBase
        self.title = title
        self.extradata = extradata
        self.videoRange = videoRange
        self.displayTitle = displayTitle
        self.displayLanguage = displayLanguage
        self.nalLengthSize = nalLengthSize
        self.isInterlaced = isInterlaced
        self.isAVC = isAVC
        self.channelLayout = channelLayout
        self.bitRate = bitRate
        self.bitDepth = bitDepth
        self.refFrames = refFrames
        self.rotation = rotation
        self.channels = channels
        self.sampleRate = sampleRate
        self.isDefault = isDefault
        self.isForced = isForced
        self.height = height
        self.width = width
        self.averageFrameRate = averageFrameRate
        self.realFrameRate = realFrameRate
        self.profile = profile
        self.type = type
        self.aspectRatio = aspectRatio
        self.index = index
        self.isExternal = isExternal
        self.deliveryMethod = deliveryMethod
        self.deliveryUrl = deliveryUrl
        self.isExternalUrl = isExternalUrl
        self.isTextSubtitleStream = isTextSubtitleStream
        self.supportsExternalStream = supportsExternalStream
        self.path = path
        self._protocol = _protocol
        self.pixelFormat = pixelFormat
        self.level = level
        self.isAnamorphic = isAnamorphic
        self.extendedVideoType = extendedVideoType
        self.extendedVideoSubtype = extendedVideoSubtype
        self.itemId = itemId
        self.serverId = serverId
        self.attachmentSize = attachmentSize
        self.mimeType = mimeType
        self.subtitleLocationType = subtitleLocationType
    }

    public enum CodingKeys: String, CodingKey { 
        case codec = "Codec"
        case codecTag = "CodecTag"
        case language = "Language"
        case colorTransfer = "ColorTransfer"
        case colorPrimaries = "ColorPrimaries"
        case colorSpace = "ColorSpace"
        case comment = "Comment"
        case streamStartTimeTicks = "StreamStartTimeTicks"
        case timeBase = "TimeBase"
        case title = "Title"
        case extradata = "Extradata"
        case videoRange = "VideoRange"
        case displayTitle = "DisplayTitle"
        case displayLanguage = "DisplayLanguage"
        case nalLengthSize = "NalLengthSize"
        case isInterlaced = "IsInterlaced"
        case isAVC = "IsAVC"
        case channelLayout = "ChannelLayout"
        case bitRate = "BitRate"
        case bitDepth = "BitDepth"
        case refFrames = "RefFrames"
        case rotation = "Rotation"
        case channels = "Channels"
        case sampleRate = "SampleRate"
        case isDefault = "IsDefault"
        case isForced = "IsForced"
        case height = "Height"
        case width = "Width"
        case averageFrameRate = "AverageFrameRate"
        case realFrameRate = "RealFrameRate"
        case profile = "Profile"
        case type = "Type"
        case aspectRatio = "AspectRatio"
        case index = "Index"
        case isExternal = "IsExternal"
        case deliveryMethod = "DeliveryMethod"
        case deliveryUrl = "DeliveryUrl"
        case isExternalUrl = "IsExternalUrl"
        case isTextSubtitleStream = "IsTextSubtitleStream"
        case supportsExternalStream = "SupportsExternalStream"
        case path = "Path"
        case _protocol = "Protocol"
        case pixelFormat = "PixelFormat"
        case level = "Level"
        case isAnamorphic = "IsAnamorphic"
        case extendedVideoType = "ExtendedVideoType"
        case extendedVideoSubtype = "ExtendedVideoSubtype"
        case itemId = "ItemId"
        case serverId = "ServerId"
        case attachmentSize = "AttachmentSize"
        case mimeType = "MimeType"
        case subtitleLocationType = "SubtitleLocationType"
    }

}