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
import DlnaDeviceProfile from './DlnaDeviceProfile';
import MediaInfoMediaProtocol from './MediaInfoMediaProtocol';

/**
* The MediaInfoLiveStreamRequest model module.
* @module model/MediaInfoLiveStreamRequest
* @version 4.8.0.6
*/
export default class MediaInfoLiveStreamRequest {
    /**
    * Constructs a new <code>MediaInfoLiveStreamRequest</code>.
    * @alias module:model/MediaInfoLiveStreamRequest
    * @class
    */

    constructor() {
        
        
        
    }

    /**
    * Constructs a <code>MediaInfoLiveStreamRequest</code> from a plain JavaScript object, optionally creating a new instance.
    * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
    * @param {Object} data The plain JavaScript object bearing properties of interest.
    * @param {module:model/MediaInfoLiveStreamRequest} obj Optional instance to populate.
    * @return {module:model/MediaInfoLiveStreamRequest} The populated <code>MediaInfoLiveStreamRequest</code> instance.
    */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new MediaInfoLiveStreamRequest();
                        
            
            if (data.hasOwnProperty('OpenToken')) {
                obj['OpenToken'] = ApiClient.convertToType(data['OpenToken'], 'String');
            }
            if (data.hasOwnProperty('UserId')) {
                obj['UserId'] = ApiClient.convertToType(data['UserId'], 'String');
            }
            if (data.hasOwnProperty('PlaySessionId')) {
                obj['PlaySessionId'] = ApiClient.convertToType(data['PlaySessionId'], 'String');
            }
            if (data.hasOwnProperty('MaxStreamingBitrate')) {
                obj['MaxStreamingBitrate'] = ApiClient.convertToType(data['MaxStreamingBitrate'], 'Number');
            }
            if (data.hasOwnProperty('StartTimeTicks')) {
                obj['StartTimeTicks'] = ApiClient.convertToType(data['StartTimeTicks'], 'Number');
            }
            if (data.hasOwnProperty('AudioStreamIndex')) {
                obj['AudioStreamIndex'] = ApiClient.convertToType(data['AudioStreamIndex'], 'Number');
            }
            if (data.hasOwnProperty('SubtitleStreamIndex')) {
                obj['SubtitleStreamIndex'] = ApiClient.convertToType(data['SubtitleStreamIndex'], 'Number');
            }
            if (data.hasOwnProperty('MaxAudioChannels')) {
                obj['MaxAudioChannels'] = ApiClient.convertToType(data['MaxAudioChannels'], 'Number');
            }
            if (data.hasOwnProperty('ItemId')) {
                obj['ItemId'] = ApiClient.convertToType(data['ItemId'], 'Number');
            }
            if (data.hasOwnProperty('DeviceProfile')) {
                obj['DeviceProfile'] = DlnaDeviceProfile.constructFromObject(data['DeviceProfile']);
            }
            if (data.hasOwnProperty('EnableDirectPlay')) {
                obj['EnableDirectPlay'] = ApiClient.convertToType(data['EnableDirectPlay'], 'Boolean');
            }
            if (data.hasOwnProperty('EnableDirectStream')) {
                obj['EnableDirectStream'] = ApiClient.convertToType(data['EnableDirectStream'], 'Boolean');
            }
            if (data.hasOwnProperty('EnableTranscoding')) {
                obj['EnableTranscoding'] = ApiClient.convertToType(data['EnableTranscoding'], 'Boolean');
            }
            if (data.hasOwnProperty('AllowVideoStreamCopy')) {
                obj['AllowVideoStreamCopy'] = ApiClient.convertToType(data['AllowVideoStreamCopy'], 'Boolean');
            }
            if (data.hasOwnProperty('AllowInterlacedVideoStreamCopy')) {
                obj['AllowInterlacedVideoStreamCopy'] = ApiClient.convertToType(data['AllowInterlacedVideoStreamCopy'], 'Boolean');
            }
            if (data.hasOwnProperty('AllowAudioStreamCopy')) {
                obj['AllowAudioStreamCopy'] = ApiClient.convertToType(data['AllowAudioStreamCopy'], 'Boolean');
            }
            if (data.hasOwnProperty('DirectPlayProtocols')) {
                obj['DirectPlayProtocols'] = ApiClient.convertToType(data['DirectPlayProtocols'], [MediaInfoMediaProtocol]);
            }
        }
        return obj;
    }

    /**
    * @member {String} OpenToken
    */
    'OpenToken' = undefined;
    /**
    * @member {String} UserId
    */
    'UserId' = undefined;
    /**
    * @member {String} PlaySessionId
    */
    'PlaySessionId' = undefined;
    /**
    * @member {Number} MaxStreamingBitrate
    */
    'MaxStreamingBitrate' = undefined;
    /**
    * @member {Number} StartTimeTicks
    */
    'StartTimeTicks' = undefined;
    /**
    * @member {Number} AudioStreamIndex
    */
    'AudioStreamIndex' = undefined;
    /**
    * @member {Number} SubtitleStreamIndex
    */
    'SubtitleStreamIndex' = undefined;
    /**
    * @member {Number} MaxAudioChannels
    */
    'MaxAudioChannels' = undefined;
    /**
    * @member {Number} ItemId
    */
    'ItemId' = undefined;
    /**
    * @member {module:model/DlnaDeviceProfile} DeviceProfile
    */
    'DeviceProfile' = undefined;
    /**
    * @member {Boolean} EnableDirectPlay
    */
    'EnableDirectPlay' = undefined;
    /**
    * @member {Boolean} EnableDirectStream
    */
    'EnableDirectStream' = undefined;
    /**
    * @member {Boolean} EnableTranscoding
    */
    'EnableTranscoding' = undefined;
    /**
    * @member {Boolean} AllowVideoStreamCopy
    */
    'AllowVideoStreamCopy' = undefined;
    /**
    * @member {Boolean} AllowInterlacedVideoStreamCopy
    */
    'AllowInterlacedVideoStreamCopy' = undefined;
    /**
    * @member {Boolean} AllowAudioStreamCopy
    */
    'AllowAudioStreamCopy' = undefined;
    /**
    * @member {Array.<module:model/MediaInfoMediaProtocol>} DirectPlayProtocols
    */
    'DirectPlayProtocols' = undefined;




}
