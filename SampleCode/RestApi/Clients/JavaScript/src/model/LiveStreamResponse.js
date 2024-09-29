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

/**
* The LiveStreamResponse model module.
* @module model/LiveStreamResponse
* @version 4.8.10.0
*/
export default class LiveStreamResponse {
    /**
    * Constructs a new <code>LiveStreamResponse</code>.
    * @alias module:model/LiveStreamResponse
    * @class
    */

    constructor() {
        
        
        
    }

    /**
    * Constructs a <code>LiveStreamResponse</code> from a plain JavaScript object, optionally creating a new instance.
    * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
    * @param {Object} data The plain JavaScript object bearing properties of interest.
    * @param {module:model/LiveStreamResponse} obj Optional instance to populate.
    * @return {module:model/LiveStreamResponse} The populated <code>LiveStreamResponse</code> instance.
    */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new LiveStreamResponse();
                        
            
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
