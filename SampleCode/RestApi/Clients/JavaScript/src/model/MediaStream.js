/**
 * Emby Server REST API (BETA)
 * Explore the Emby Server API
 *
 * 
 *
 * NOTE: This class is auto generated.
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';
import DlnaSubtitleDeliveryMethod from './DlnaSubtitleDeliveryMethod';
import ExtendedVideoSubTypes from './ExtendedVideoSubTypes';
import ExtendedVideoTypes from './ExtendedVideoTypes';
import MediaInfoMediaProtocol from './MediaInfoMediaProtocol';
import MediaStreamType from './MediaStreamType';
import SubtitleLocationType from './SubtitleLocationType';

/**
* The MediaStream model module.
* @module model/MediaStream
* @version 4.8.0.47
*/
export default class MediaStream {
    /**
    * Constructs a new <code>MediaStream</code>.
    * @alias module:model/MediaStream
    * @class
    */

    constructor() {
        
        
        
    }

    /**
    * Constructs a <code>MediaStream</code> from a plain JavaScript object, optionally creating a new instance.
    * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
    * @param {Object} data The plain JavaScript object bearing properties of interest.
    * @param {module:model/MediaStream} obj Optional instance to populate.
    * @return {module:model/MediaStream} The populated <code>MediaStream</code> instance.
    */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new MediaStream();
                        
            
            if (data.hasOwnProperty('Codec')) {
                obj['Codec'] = ApiClient.convertToType(data['Codec'], 'String');
            }
            if (data.hasOwnProperty('CodecTag')) {
                obj['CodecTag'] = ApiClient.convertToType(data['CodecTag'], 'String');
            }
            if (data.hasOwnProperty('Language')) {
                obj['Language'] = ApiClient.convertToType(data['Language'], 'String');
            }
            if (data.hasOwnProperty('ColorTransfer')) {
                obj['ColorTransfer'] = ApiClient.convertToType(data['ColorTransfer'], 'String');
            }
            if (data.hasOwnProperty('ColorPrimaries')) {
                obj['ColorPrimaries'] = ApiClient.convertToType(data['ColorPrimaries'], 'String');
            }
            if (data.hasOwnProperty('ColorSpace')) {
                obj['ColorSpace'] = ApiClient.convertToType(data['ColorSpace'], 'String');
            }
            if (data.hasOwnProperty('Comment')) {
                obj['Comment'] = ApiClient.convertToType(data['Comment'], 'String');
            }
            if (data.hasOwnProperty('StreamStartTimeTicks')) {
                obj['StreamStartTimeTicks'] = ApiClient.convertToType(data['StreamStartTimeTicks'], 'Number');
            }
            if (data.hasOwnProperty('TimeBase')) {
                obj['TimeBase'] = ApiClient.convertToType(data['TimeBase'], 'String');
            }
            if (data.hasOwnProperty('Title')) {
                obj['Title'] = ApiClient.convertToType(data['Title'], 'String');
            }
            if (data.hasOwnProperty('Extradata')) {
                obj['Extradata'] = ApiClient.convertToType(data['Extradata'], 'String');
            }
            if (data.hasOwnProperty('VideoRange')) {
                obj['VideoRange'] = ApiClient.convertToType(data['VideoRange'], 'String');
            }
            if (data.hasOwnProperty('DisplayTitle')) {
                obj['DisplayTitle'] = ApiClient.convertToType(data['DisplayTitle'], 'String');
            }
            if (data.hasOwnProperty('DisplayLanguage')) {
                obj['DisplayLanguage'] = ApiClient.convertToType(data['DisplayLanguage'], 'String');
            }
            if (data.hasOwnProperty('NalLengthSize')) {
                obj['NalLengthSize'] = ApiClient.convertToType(data['NalLengthSize'], 'String');
            }
            if (data.hasOwnProperty('IsInterlaced')) {
                obj['IsInterlaced'] = ApiClient.convertToType(data['IsInterlaced'], 'Boolean');
            }
            if (data.hasOwnProperty('IsAVC')) {
                obj['IsAVC'] = ApiClient.convertToType(data['IsAVC'], 'Boolean');
            }
            if (data.hasOwnProperty('ChannelLayout')) {
                obj['ChannelLayout'] = ApiClient.convertToType(data['ChannelLayout'], 'String');
            }
            if (data.hasOwnProperty('BitRate')) {
                obj['BitRate'] = ApiClient.convertToType(data['BitRate'], 'Number');
            }
            if (data.hasOwnProperty('BitDepth')) {
                obj['BitDepth'] = ApiClient.convertToType(data['BitDepth'], 'Number');
            }
            if (data.hasOwnProperty('RefFrames')) {
                obj['RefFrames'] = ApiClient.convertToType(data['RefFrames'], 'Number');
            }
            if (data.hasOwnProperty('Rotation')) {
                obj['Rotation'] = ApiClient.convertToType(data['Rotation'], 'Number');
            }
            if (data.hasOwnProperty('Channels')) {
                obj['Channels'] = ApiClient.convertToType(data['Channels'], 'Number');
            }
            if (data.hasOwnProperty('SampleRate')) {
                obj['SampleRate'] = ApiClient.convertToType(data['SampleRate'], 'Number');
            }
            if (data.hasOwnProperty('IsDefault')) {
                obj['IsDefault'] = ApiClient.convertToType(data['IsDefault'], 'Boolean');
            }
            if (data.hasOwnProperty('IsForced')) {
                obj['IsForced'] = ApiClient.convertToType(data['IsForced'], 'Boolean');
            }
            if (data.hasOwnProperty('Height')) {
                obj['Height'] = ApiClient.convertToType(data['Height'], 'Number');
            }
            if (data.hasOwnProperty('Width')) {
                obj['Width'] = ApiClient.convertToType(data['Width'], 'Number');
            }
            if (data.hasOwnProperty('AverageFrameRate')) {
                obj['AverageFrameRate'] = ApiClient.convertToType(data['AverageFrameRate'], 'Number');
            }
            if (data.hasOwnProperty('RealFrameRate')) {
                obj['RealFrameRate'] = ApiClient.convertToType(data['RealFrameRate'], 'Number');
            }
            if (data.hasOwnProperty('Profile')) {
                obj['Profile'] = ApiClient.convertToType(data['Profile'], 'String');
            }
            if (data.hasOwnProperty('Type')) {
                obj['Type'] = MediaStreamType.constructFromObject(data['Type']);
            }
            if (data.hasOwnProperty('AspectRatio')) {
                obj['AspectRatio'] = ApiClient.convertToType(data['AspectRatio'], 'String');
            }
            if (data.hasOwnProperty('Index')) {
                obj['Index'] = ApiClient.convertToType(data['Index'], 'Number');
            }
            if (data.hasOwnProperty('IsExternal')) {
                obj['IsExternal'] = ApiClient.convertToType(data['IsExternal'], 'Boolean');
            }
            if (data.hasOwnProperty('DeliveryMethod')) {
                obj['DeliveryMethod'] = DlnaSubtitleDeliveryMethod.constructFromObject(data['DeliveryMethod']);
            }
            if (data.hasOwnProperty('DeliveryUrl')) {
                obj['DeliveryUrl'] = ApiClient.convertToType(data['DeliveryUrl'], 'String');
            }
            if (data.hasOwnProperty('IsExternalUrl')) {
                obj['IsExternalUrl'] = ApiClient.convertToType(data['IsExternalUrl'], 'Boolean');
            }
            if (data.hasOwnProperty('IsTextSubtitleStream')) {
                obj['IsTextSubtitleStream'] = ApiClient.convertToType(data['IsTextSubtitleStream'], 'Boolean');
            }
            if (data.hasOwnProperty('SupportsExternalStream')) {
                obj['SupportsExternalStream'] = ApiClient.convertToType(data['SupportsExternalStream'], 'Boolean');
            }
            if (data.hasOwnProperty('Path')) {
                obj['Path'] = ApiClient.convertToType(data['Path'], 'String');
            }
            if (data.hasOwnProperty('Protocol')) {
                obj['Protocol'] = MediaInfoMediaProtocol.constructFromObject(data['Protocol']);
            }
            if (data.hasOwnProperty('PixelFormat')) {
                obj['PixelFormat'] = ApiClient.convertToType(data['PixelFormat'], 'String');
            }
            if (data.hasOwnProperty('Level')) {
                obj['Level'] = ApiClient.convertToType(data['Level'], 'Number');
            }
            if (data.hasOwnProperty('IsAnamorphic')) {
                obj['IsAnamorphic'] = ApiClient.convertToType(data['IsAnamorphic'], 'Boolean');
            }
            if (data.hasOwnProperty('ExtendedVideoType')) {
                obj['ExtendedVideoType'] = ExtendedVideoTypes.constructFromObject(data['ExtendedVideoType']);
            }
            if (data.hasOwnProperty('ExtendedVideoSubType')) {
                obj['ExtendedVideoSubType'] = ExtendedVideoSubTypes.constructFromObject(data['ExtendedVideoSubType']);
            }
            if (data.hasOwnProperty('ExtendedVideoSubTypeDescription')) {
                obj['ExtendedVideoSubTypeDescription'] = ApiClient.convertToType(data['ExtendedVideoSubTypeDescription'], 'String');
            }
            if (data.hasOwnProperty('ItemId')) {
                obj['ItemId'] = ApiClient.convertToType(data['ItemId'], 'String');
            }
            if (data.hasOwnProperty('ServerId')) {
                obj['ServerId'] = ApiClient.convertToType(data['ServerId'], 'String');
            }
            if (data.hasOwnProperty('AttachmentSize')) {
                obj['AttachmentSize'] = ApiClient.convertToType(data['AttachmentSize'], 'Number');
            }
            if (data.hasOwnProperty('MimeType')) {
                obj['MimeType'] = ApiClient.convertToType(data['MimeType'], 'String');
            }
            if (data.hasOwnProperty('SubtitleLocationType')) {
                obj['SubtitleLocationType'] = SubtitleLocationType.constructFromObject(data['SubtitleLocationType']);
            }
        }
        return obj;
    }

    /**
    * @member {String} Codec
    */
    'Codec' = undefined;
    /**
    * @member {String} CodecTag
    */
    'CodecTag' = undefined;
    /**
    * @member {String} Language
    */
    'Language' = undefined;
    /**
    * @member {String} ColorTransfer
    */
    'ColorTransfer' = undefined;
    /**
    * @member {String} ColorPrimaries
    */
    'ColorPrimaries' = undefined;
    /**
    * @member {String} ColorSpace
    */
    'ColorSpace' = undefined;
    /**
    * @member {String} Comment
    */
    'Comment' = undefined;
    /**
    * @member {Number} StreamStartTimeTicks
    */
    'StreamStartTimeTicks' = undefined;
    /**
    * @member {String} TimeBase
    */
    'TimeBase' = undefined;
    /**
    * @member {String} Title
    */
    'Title' = undefined;
    /**
    * @member {String} Extradata
    */
    'Extradata' = undefined;
    /**
    * @member {String} VideoRange
    */
    'VideoRange' = undefined;
    /**
    * @member {String} DisplayTitle
    */
    'DisplayTitle' = undefined;
    /**
    * @member {String} DisplayLanguage
    */
    'DisplayLanguage' = undefined;
    /**
    * @member {String} NalLengthSize
    */
    'NalLengthSize' = undefined;
    /**
    * @member {Boolean} IsInterlaced
    */
    'IsInterlaced' = undefined;
    /**
    * @member {Boolean} IsAVC
    */
    'IsAVC' = undefined;
    /**
    * @member {String} ChannelLayout
    */
    'ChannelLayout' = undefined;
    /**
    * @member {Number} BitRate
    */
    'BitRate' = undefined;
    /**
    * @member {Number} BitDepth
    */
    'BitDepth' = undefined;
    /**
    * @member {Number} RefFrames
    */
    'RefFrames' = undefined;
    /**
    * @member {Number} Rotation
    */
    'Rotation' = undefined;
    /**
    * @member {Number} Channels
    */
    'Channels' = undefined;
    /**
    * @member {Number} SampleRate
    */
    'SampleRate' = undefined;
    /**
    * @member {Boolean} IsDefault
    */
    'IsDefault' = undefined;
    /**
    * @member {Boolean} IsForced
    */
    'IsForced' = undefined;
    /**
    * @member {Number} Height
    */
    'Height' = undefined;
    /**
    * @member {Number} Width
    */
    'Width' = undefined;
    /**
    * @member {Number} AverageFrameRate
    */
    'AverageFrameRate' = undefined;
    /**
    * @member {Number} RealFrameRate
    */
    'RealFrameRate' = undefined;
    /**
    * @member {String} Profile
    */
    'Profile' = undefined;
    /**
    * @member {module:model/MediaStreamType} Type
    */
    'Type' = undefined;
    /**
    * @member {String} AspectRatio
    */
    'AspectRatio' = undefined;
    /**
    * @member {Number} Index
    */
    'Index' = undefined;
    /**
    * @member {Boolean} IsExternal
    */
    'IsExternal' = undefined;
    /**
    * @member {module:model/DlnaSubtitleDeliveryMethod} DeliveryMethod
    */
    'DeliveryMethod' = undefined;
    /**
    * @member {String} DeliveryUrl
    */
    'DeliveryUrl' = undefined;
    /**
    * @member {Boolean} IsExternalUrl
    */
    'IsExternalUrl' = undefined;
    /**
    * @member {Boolean} IsTextSubtitleStream
    */
    'IsTextSubtitleStream' = undefined;
    /**
    * @member {Boolean} SupportsExternalStream
    */
    'SupportsExternalStream' = undefined;
    /**
    * @member {String} Path
    */
    'Path' = undefined;
    /**
    * @member {module:model/MediaInfoMediaProtocol} Protocol
    */
    'Protocol' = undefined;
    /**
    * @member {String} PixelFormat
    */
    'PixelFormat' = undefined;
    /**
    * @member {Number} Level
    */
    'Level' = undefined;
    /**
    * @member {Boolean} IsAnamorphic
    */
    'IsAnamorphic' = undefined;
    /**
    * @member {module:model/ExtendedVideoTypes} ExtendedVideoType
    */
    'ExtendedVideoType' = undefined;
    /**
    * @member {module:model/ExtendedVideoSubTypes} ExtendedVideoSubType
    */
    'ExtendedVideoSubType' = undefined;
    /**
    * @member {String} ExtendedVideoSubTypeDescription
    */
    'ExtendedVideoSubTypeDescription' = undefined;
    /**
    * @member {String} ItemId
    */
    'ItemId' = undefined;
    /**
    * @member {String} ServerId
    */
    'ServerId' = undefined;
    /**
    * @member {Number} AttachmentSize
    */
    'AttachmentSize' = undefined;
    /**
    * @member {String} MimeType
    */
    'MimeType' = undefined;
    /**
    * @member {module:model/SubtitleLocationType} SubtitleLocationType
    */
    'SubtitleLocationType' = undefined;




}
