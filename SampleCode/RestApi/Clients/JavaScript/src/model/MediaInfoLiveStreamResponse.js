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
import MediaSourceInfo from './MediaSourceInfo';

/**
* The MediaInfoLiveStreamResponse model module.
* @module model/MediaInfoLiveStreamResponse
* @version 4.8.0.26
*/
export default class MediaInfoLiveStreamResponse {
    /**
    * Constructs a new <code>MediaInfoLiveStreamResponse</code>.
    * @alias module:model/MediaInfoLiveStreamResponse
    * @class
    */

    constructor() {
        
        
        
    }

    /**
    * Constructs a <code>MediaInfoLiveStreamResponse</code> from a plain JavaScript object, optionally creating a new instance.
    * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
    * @param {Object} data The plain JavaScript object bearing properties of interest.
    * @param {module:model/MediaInfoLiveStreamResponse} obj Optional instance to populate.
    * @return {module:model/MediaInfoLiveStreamResponse} The populated <code>MediaInfoLiveStreamResponse</code> instance.
    */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new MediaInfoLiveStreamResponse();
                        
            
            if (data.hasOwnProperty('MediaSource')) {
                obj['MediaSource'] = MediaSourceInfo.constructFromObject(data['MediaSource']);
            }
        }
        return obj;
    }

    /**
    * @member {module:model/MediaSourceInfo} MediaSource
    */
    'MediaSource' = undefined;




}
