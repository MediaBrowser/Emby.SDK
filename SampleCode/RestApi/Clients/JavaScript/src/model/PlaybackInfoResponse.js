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
import MediaSourceInfo from './MediaSourceInfo';
import PlaybackErrorCode from './PlaybackErrorCode';

/**
* The PlaybackInfoResponse model module.
* @module model/PlaybackInfoResponse
* @version 4.8.10.0
*/
export default class PlaybackInfoResponse {
    /**
    * Constructs a new <code>PlaybackInfoResponse</code>.
    * @alias module:model/PlaybackInfoResponse
    * @class
    */

    constructor() {
        
        
        
    }

    /**
    * Constructs a <code>PlaybackInfoResponse</code> from a plain JavaScript object, optionally creating a new instance.
    * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
    * @param {Object} data The plain JavaScript object bearing properties of interest.
    * @param {module:model/PlaybackInfoResponse} obj Optional instance to populate.
    * @return {module:model/PlaybackInfoResponse} The populated <code>PlaybackInfoResponse</code> instance.
    */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new PlaybackInfoResponse();
                        
            
            if (data.hasOwnProperty('MediaSources')) {
                obj['MediaSources'] = ApiClient.convertToType(data['MediaSources'], [MediaSourceInfo]);
            }
            if (data.hasOwnProperty('PlaySessionId')) {
                obj['PlaySessionId'] = ApiClient.convertToType(data['PlaySessionId'], 'String');
            }
            if (data.hasOwnProperty('ErrorCode')) {
                obj['ErrorCode'] = PlaybackErrorCode.constructFromObject(data['ErrorCode']);
            }
        }
        return obj;
    }

    /**
    * The media sources.
    * @member {Array.<module:model/MediaSourceInfo>} MediaSources
    */
    'MediaSources' = undefined;
    /**
    * The play session identifier.
    * @member {String} PlaySessionId
    */
    'PlaySessionId' = undefined;
    /**
    * @member {module:model/PlaybackErrorCode} ErrorCode
    */
    'ErrorCode' = undefined;




}
