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
import DlnaPlaybackErrorCode from './DlnaPlaybackErrorCode';
import MediaSourceInfo from './MediaSourceInfo';

/**
* The MediaInfoPlaybackInfoResponse model module.
* @module model/MediaInfoPlaybackInfoResponse
* @version 4.8.0.20
*/
export default class MediaInfoPlaybackInfoResponse {
    /**
    * Constructs a new <code>MediaInfoPlaybackInfoResponse</code>.
    * @alias module:model/MediaInfoPlaybackInfoResponse
    * @class
    */

    constructor() {
        
        
        
    }

    /**
    * Constructs a <code>MediaInfoPlaybackInfoResponse</code> from a plain JavaScript object, optionally creating a new instance.
    * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
    * @param {Object} data The plain JavaScript object bearing properties of interest.
    * @param {module:model/MediaInfoPlaybackInfoResponse} obj Optional instance to populate.
    * @return {module:model/MediaInfoPlaybackInfoResponse} The populated <code>MediaInfoPlaybackInfoResponse</code> instance.
    */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new MediaInfoPlaybackInfoResponse();
                        
            
            if (data.hasOwnProperty('MediaSources')) {
                obj['MediaSources'] = ApiClient.convertToType(data['MediaSources'], [MediaSourceInfo]);
            }
            if (data.hasOwnProperty('PlaySessionId')) {
                obj['PlaySessionId'] = ApiClient.convertToType(data['PlaySessionId'], 'String');
            }
            if (data.hasOwnProperty('ErrorCode')) {
                obj['ErrorCode'] = DlnaPlaybackErrorCode.constructFromObject(data['ErrorCode']);
            }
        }
        return obj;
    }

    /**
    * @member {Array.<module:model/MediaSourceInfo>} MediaSources
    */
    'MediaSources' = undefined;
    /**
    * @member {String} PlaySessionId
    */
    'PlaySessionId' = undefined;
    /**
    * @member {module:model/DlnaPlaybackErrorCode} ErrorCode
    */
    'ErrorCode' = undefined;




}
