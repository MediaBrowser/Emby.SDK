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
import DlnaProfileType from './DlnaProfileType';

/**
* The DirectPlayProfile model module.
* @module model/DirectPlayProfile
* @version 4.8.10.0
*/
export default class DirectPlayProfile {
    /**
    * Constructs a new <code>DirectPlayProfile</code>.
    * @alias module:model/DirectPlayProfile
    * @class
    */

    constructor() {
        
        
        
    }

    /**
    * Constructs a <code>DirectPlayProfile</code> from a plain JavaScript object, optionally creating a new instance.
    * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
    * @param {Object} data The plain JavaScript object bearing properties of interest.
    * @param {module:model/DirectPlayProfile} obj Optional instance to populate.
    * @return {module:model/DirectPlayProfile} The populated <code>DirectPlayProfile</code> instance.
    */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new DirectPlayProfile();
                        
            
            if (data.hasOwnProperty('Container')) {
                obj['Container'] = ApiClient.convertToType(data['Container'], 'String');
            }
            if (data.hasOwnProperty('AudioCodec')) {
                obj['AudioCodec'] = ApiClient.convertToType(data['AudioCodec'], 'String');
            }
            if (data.hasOwnProperty('VideoCodec')) {
                obj['VideoCodec'] = ApiClient.convertToType(data['VideoCodec'], 'String');
            }
            if (data.hasOwnProperty('Type')) {
                obj['Type'] = DlnaProfileType.constructFromObject(data['Type']);
            }
        }
        return obj;
    }

    /**
    * @member {String} Container
    */
    'Container' = undefined;
    /**
    * @member {String} AudioCodec
    */
    'AudioCodec' = undefined;
    /**
    * @member {String} VideoCodec
    */
    'VideoCodec' = undefined;
    /**
    * @member {module:model/DlnaProfileType} Type
    */
    'Type' = undefined;




}
