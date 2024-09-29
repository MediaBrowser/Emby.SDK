/**
 * Emby Server REST API
 * Explore the Emby Server API
 *
 * 
 *
 * NOTE: This class is auto generated.
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';
import MediaProtocol from './MediaProtocol';
import MediaSourceType from './MediaSourceType';
import MediaStream from './MediaStream';
import TransportStreamTimestamp from './TransportStreamTimestamp';
import Video3DFormat from './Video3DFormat';

/**
* The MediaSourceInfo model module.
* @module model/MediaSourceInfo
* @version 4.8.10.0
*/
export default class MediaSourceInfo {
    /**
    * Constructs a new <code>MediaSourceInfo</code>.
    * @alias module:model/MediaSourceInfo
    * @class
    */

    constructor() {
        
        
        
    }

    /**
    * Constructs a <code>MediaSourceInfo</code> from a plain JavaScript object, optionally creating a new instance.
    * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
    * @param {Object} data The plain JavaScript object bearing properties of interest.
    * @param {module:model/MediaSourceInfo} obj Optional instance to populate.
    * @return {module:model/MediaSourceInfo} The populated <code>MediaSourceInfo</code> instance.
    */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new MediaSourceInfo();
                        
            
            if (data.hasOwnProperty('Protocol')) {
                obj['Protocol'] = MediaProtocol.constructFromObject(data['Protocol']);
            }
            if (data.hasOwnProperty('Id')) {
                obj['Id'] = ApiClient.convertToType(data['Id'], 'String');
            }
            if (data.hasOwnProperty('Path')) {
                obj['Path'] = ApiClient.convertToType(data['Path'], 'String');
            }
            if (data.hasOwnProperty('EncoderPath')) {
                obj['EncoderPath'] = ApiClient.convertToType(data['EncoderPath'], 'String');
            }
            if (data.hasOwnProperty('EncoderProtocol')) {
                obj['EncoderProtocol'] = MediaProtocol.constructFromObject(data['EncoderProtocol']);
            }
            if (data.hasOwnProperty('Type')) {
                obj['Type'] = MediaSourceType.constructFromObject(data['Type']);
            }
            if (data.hasOwnProperty('ProbePath')) {
                obj['ProbePath'] = ApiClient.convertToType(data['ProbePath'], 'String');
            }
            if (data.hasOwnProperty('ProbeProtocol')) {
                obj['ProbeProtocol'] = MediaProtocol.constructFromObject(data['ProbeProtocol']);
            }
            if (data.hasOwnProperty('Container')) {
                obj['Container'] = ApiClient.convertToType(data['Container'], 'String');
            }
            if (data.hasOwnProperty('Size')) {
                obj['Size'] = ApiClient.convertToType(data['Size'], 'Number');
            }
            if (data.hasOwnProperty('Name')) {
                obj['Name'] = ApiClient.convertToType(data['Name'], 'String');
            }
            if (data.hasOwnProperty('SortName')) {
                obj['SortName'] = ApiClient.convertToType(data['SortName'], 'String');
            }
            if (data.hasOwnProperty('IsRemote')) {
                obj['IsRemote'] = ApiClient.convertToType(data['IsRemote'], 'Boolean');
            }
            if (data.hasOwnProperty('HasMixedProtocols')) {
                obj['HasMixedProtocols'] = ApiClient.convertToType(data['HasMixedProtocols'], 'Boolean');
            }
            if (data.hasOwnProperty('RunTimeTicks')) {
                obj['RunTimeTicks'] = ApiClient.convertToType(data['RunTimeTicks'], 'Number');
            }
            if (data.hasOwnProperty('ContainerStartTimeTicks')) {
                obj['ContainerStartTimeTicks'] = ApiClient.convertToType(data['ContainerStartTimeTicks'], 'Number');
            }
            if (data.hasOwnProperty('SupportsTranscoding')) {
                obj['SupportsTranscoding'] = ApiClient.convertToType(data['SupportsTranscoding'], 'Boolean');
            }
            if (data.hasOwnProperty('TrancodeLiveStartIndex')) {
                obj['TrancodeLiveStartIndex'] = ApiClient.convertToType(data['TrancodeLiveStartIndex'], 'Number');
            }
            if (data.hasOwnProperty('WallClockStart')) {
                obj['WallClockStart'] = ApiClient.convertToType(data['WallClockStart'], 'Date');
            }
            if (data.hasOwnProperty('SupportsDirectStream')) {
                obj['SupportsDirectStream'] = ApiClient.convertToType(data['SupportsDirectStream'], 'Boolean');
            }
            if (data.hasOwnProperty('SupportsDirectPlay')) {
                obj['SupportsDirectPlay'] = ApiClient.convertToType(data['SupportsDirectPlay'], 'Boolean');
            }
            if (data.hasOwnProperty('IsInfiniteStream')) {
                obj['IsInfiniteStream'] = ApiClient.convertToType(data['IsInfiniteStream'], 'Boolean');
            }
            if (data.hasOwnProperty('RequiresOpening')) {
                obj['RequiresOpening'] = ApiClient.convertToType(data['RequiresOpening'], 'Boolean');
            }
            if (data.hasOwnProperty('OpenToken')) {
                obj['OpenToken'] = ApiClient.convertToType(data['OpenToken'], 'String');
            }
            if (data.hasOwnProperty('RequiresClosing')) {
                obj['RequiresClosing'] = ApiClient.convertToType(data['RequiresClosing'], 'Boolean');
            }
            if (data.hasOwnProperty('LiveStreamId')) {
                obj['LiveStreamId'] = ApiClient.convertToType(data['LiveStreamId'], 'String');
            }
            if (data.hasOwnProperty('BufferMs')) {
                obj['BufferMs'] = ApiClient.convertToType(data['BufferMs'], 'Number');
            }
            if (data.hasOwnProperty('RequiresLooping')) {
                obj['RequiresLooping'] = ApiClient.convertToType(data['RequiresLooping'], 'Boolean');
            }
            if (data.hasOwnProperty('SupportsProbing')) {
                obj['SupportsProbing'] = ApiClient.convertToType(data['SupportsProbing'], 'Boolean');
            }
            if (data.hasOwnProperty('Video3DFormat')) {
                obj['Video3DFormat'] = Video3DFormat.constructFromObject(data['Video3DFormat']);
            }
            if (data.hasOwnProperty('MediaStreams')) {
                obj['MediaStreams'] = ApiClient.convertToType(data['MediaStreams'], [MediaStream]);
            }
            if (data.hasOwnProperty('Formats')) {
                obj['Formats'] = ApiClient.convertToType(data['Formats'], ['String']);
            }
            if (data.hasOwnProperty('Bitrate')) {
                obj['Bitrate'] = ApiClient.convertToType(data['Bitrate'], 'Number');
            }
            if (data.hasOwnProperty('Timestamp')) {
                obj['Timestamp'] = TransportStreamTimestamp.constructFromObject(data['Timestamp']);
            }
            if (data.hasOwnProperty('RequiredHttpHeaders')) {
                obj['RequiredHttpHeaders'] = ApiClient.convertToType(data['RequiredHttpHeaders'], {'String': 'String'});
            }
            if (data.hasOwnProperty('DirectStreamUrl')) {
                obj['DirectStreamUrl'] = ApiClient.convertToType(data['DirectStreamUrl'], 'String');
            }
            if (data.hasOwnProperty('AddApiKeyToDirectStreamUrl')) {
                obj['AddApiKeyToDirectStreamUrl'] = ApiClient.convertToType(data['AddApiKeyToDirectStreamUrl'], 'Boolean');
            }
            if (data.hasOwnProperty('TranscodingUrl')) {
                obj['TranscodingUrl'] = ApiClient.convertToType(data['TranscodingUrl'], 'String');
            }
            if (data.hasOwnProperty('TranscodingSubProtocol')) {
                obj['TranscodingSubProtocol'] = ApiClient.convertToType(data['TranscodingSubProtocol'], 'String');
            }
            if (data.hasOwnProperty('TranscodingContainer')) {
                obj['TranscodingContainer'] = ApiClient.convertToType(data['TranscodingContainer'], 'String');
            }
            if (data.hasOwnProperty('AnalyzeDurationMs')) {
                obj['AnalyzeDurationMs'] = ApiClient.convertToType(data['AnalyzeDurationMs'], 'Number');
            }
            if (data.hasOwnProperty('ReadAtNativeFramerate')) {
                obj['ReadAtNativeFramerate'] = ApiClient.convertToType(data['ReadAtNativeFramerate'], 'Boolean');
            }
            if (data.hasOwnProperty('DefaultAudioStreamIndex')) {
                obj['DefaultAudioStreamIndex'] = ApiClient.convertToType(data['DefaultAudioStreamIndex'], 'Number');
            }
            if (data.hasOwnProperty('DefaultSubtitleStreamIndex')) {
                obj['DefaultSubtitleStreamIndex'] = ApiClient.convertToType(data['DefaultSubtitleStreamIndex'], 'Number');
            }
            if (data.hasOwnProperty('ItemId')) {
                obj['ItemId'] = ApiClient.convertToType(data['ItemId'], 'String');
            }
            if (data.hasOwnProperty('ServerId')) {
                obj['ServerId'] = ApiClient.convertToType(data['ServerId'], 'String');
            }
        }
        return obj;
    }

    /**
    * @member {module:model/MediaProtocol} Protocol
    */
    'Protocol' = undefined;
    /**
    * @member {String} Id
    */
    'Id' = undefined;
    /**
    * @member {String} Path
    */
    'Path' = undefined;
    /**
    * @member {String} EncoderPath
    */
    'EncoderPath' = undefined;
    /**
    * @member {module:model/MediaProtocol} EncoderProtocol
    */
    'EncoderProtocol' = undefined;
    /**
    * @member {module:model/MediaSourceType} Type
    */
    'Type' = undefined;
    /**
    * @member {String} ProbePath
    */
    'ProbePath' = undefined;
    /**
    * @member {module:model/MediaProtocol} ProbeProtocol
    */
    'ProbeProtocol' = undefined;
    /**
    * @member {String} Container
    */
    'Container' = undefined;
    /**
    * @member {Number} Size
    */
    'Size' = undefined;
    /**
    * @member {String} Name
    */
    'Name' = undefined;
    /**
    * @member {String} SortName
    */
    'SortName' = undefined;
    /**
    * Differentiate internet url vs local network
    * @member {Boolean} IsRemote
    */
    'IsRemote' = undefined;
    /**
    * @member {Boolean} HasMixedProtocols
    */
    'HasMixedProtocols' = undefined;
    /**
    * @member {Number} RunTimeTicks
    */
    'RunTimeTicks' = undefined;
    /**
    * @member {Number} ContainerStartTimeTicks
    */
    'ContainerStartTimeTicks' = undefined;
    /**
    * @member {Boolean} SupportsTranscoding
    */
    'SupportsTranscoding' = undefined;
    /**
    * @member {Number} TrancodeLiveStartIndex
    */
    'TrancodeLiveStartIndex' = undefined;
    /**
    * @member {Date} WallClockStart
    */
    'WallClockStart' = undefined;
    /**
    * @member {Boolean} SupportsDirectStream
    */
    'SupportsDirectStream' = undefined;
    /**
    * @member {Boolean} SupportsDirectPlay
    */
    'SupportsDirectPlay' = undefined;
    /**
    * @member {Boolean} IsInfiniteStream
    */
    'IsInfiniteStream' = undefined;
    /**
    * @member {Boolean} RequiresOpening
    */
    'RequiresOpening' = undefined;
    /**
    * @member {String} OpenToken
    */
    'OpenToken' = undefined;
    /**
    * @member {Boolean} RequiresClosing
    */
    'RequiresClosing' = undefined;
    /**
    * @member {String} LiveStreamId
    */
    'LiveStreamId' = undefined;
    /**
    * @member {Number} BufferMs
    */
    'BufferMs' = undefined;
    /**
    * @member {Boolean} RequiresLooping
    */
    'RequiresLooping' = undefined;
    /**
    * @member {Boolean} SupportsProbing
    */
    'SupportsProbing' = undefined;
    /**
    * @member {module:model/Video3DFormat} Video3DFormat
    */
    'Video3DFormat' = undefined;
    /**
    * @member {Array.<module:model/MediaStream>} MediaStreams
    */
    'MediaStreams' = undefined;
    /**
    * @member {Array.<String>} Formats
    */
    'Formats' = undefined;
    /**
    * @member {Number} Bitrate
    */
    'Bitrate' = undefined;
    /**
    * @member {module:model/TransportStreamTimestamp} Timestamp
    */
    'Timestamp' = undefined;
    /**
    * @member {Object.<String, String>} RequiredHttpHeaders
    */
    'RequiredHttpHeaders' = undefined;
    /**
    * @member {String} DirectStreamUrl
    */
    'DirectStreamUrl' = undefined;
    /**
    * @member {Boolean} AddApiKeyToDirectStreamUrl
    */
    'AddApiKeyToDirectStreamUrl' = undefined;
    /**
    * @member {String} TranscodingUrl
    */
    'TranscodingUrl' = undefined;
    /**
    * @member {String} TranscodingSubProtocol
    */
    'TranscodingSubProtocol' = undefined;
    /**
    * @member {String} TranscodingContainer
    */
    'TranscodingContainer' = undefined;
    /**
    * @member {Number} AnalyzeDurationMs
    */
    'AnalyzeDurationMs' = undefined;
    /**
    * @member {Boolean} ReadAtNativeFramerate
    */
    'ReadAtNativeFramerate' = undefined;
    /**
    * @member {Number} DefaultAudioStreamIndex
    */
    'DefaultAudioStreamIndex' = undefined;
    /**
    * @member {Number} DefaultSubtitleStreamIndex
    */
    'DefaultSubtitleStreamIndex' = undefined;
    /**
    * Used only by our Windows app. Not used by Emby Server. The id of the item that this mediasource belongs to, if there is one Also used by Emby for Kodi
    * @member {String} ItemId
    */
    'ItemId' = undefined;
    /**
    * Used only by our Windows app. Not used by Emby Server.
    * @member {String} ServerId
    */
    'ServerId' = undefined;




}
