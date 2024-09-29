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

/**
* The PlayRequest model module.
* @module model/PlayRequest
* @version 4.8.10.0
*/
export default class PlayRequest {
    /**
    * Constructs a new <code>PlayRequest</code>.
    * Class PlayRequest  
    * @alias module:model/PlayRequest
    * @class
    */

    constructor() {
        
        
        
    }

    /**
    * Constructs a <code>PlayRequest</code> from a plain JavaScript object, optionally creating a new instance.
    * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
    * @param {Object} data The plain JavaScript object bearing properties of interest.
    * @param {module:model/PlayRequest} obj Optional instance to populate.
    * @return {module:model/PlayRequest} The populated <code>PlayRequest</code> instance.
    */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new PlayRequest();
                        
            
            if (data.hasOwnProperty('ControllingUserId')) {
                obj['ControllingUserId'] = ApiClient.convertToType(data['ControllingUserId'], 'String');
            }
            if (data.hasOwnProperty('SubtitleStreamIndex')) {
                obj['SubtitleStreamIndex'] = ApiClient.convertToType(data['SubtitleStreamIndex'], 'Number');
            }
            if (data.hasOwnProperty('AudioStreamIndex')) {
                obj['AudioStreamIndex'] = ApiClient.convertToType(data['AudioStreamIndex'], 'Number');
            }
            if (data.hasOwnProperty('MediaSourceId')) {
                obj['MediaSourceId'] = ApiClient.convertToType(data['MediaSourceId'], 'String');
            }
            if (data.hasOwnProperty('StartIndex')) {
                obj['StartIndex'] = ApiClient.convertToType(data['StartIndex'], 'Number');
            }
        }
        return obj;
    }

    /**
    * The controlling user identifier.
    * @member {String} ControllingUserId
    */
    'ControllingUserId' = undefined;
    /**
    * @member {Number} SubtitleStreamIndex
    */
    'SubtitleStreamIndex' = undefined;
    /**
    * @member {Number} AudioStreamIndex
    */
    'AudioStreamIndex' = undefined;
    /**
    * @member {String} MediaSourceId
    */
    'MediaSourceId' = undefined;
    /**
    * @member {Number} StartIndex
    */
    'StartIndex' = undefined;




}
