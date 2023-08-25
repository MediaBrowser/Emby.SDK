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
import DlnaDlnaProfileType from './DlnaDlnaProfileType';

/**
* The DlnaDirectPlayProfile model module.
* @module model/DlnaDirectPlayProfile
* @version 4.8.0.43
*/
export default class DlnaDirectPlayProfile {
    /**
    * Constructs a new <code>DlnaDirectPlayProfile</code>.
    * @alias module:model/DlnaDirectPlayProfile
    * @class
    */

    constructor() {
        
        
        
    }

    /**
    * Constructs a <code>DlnaDirectPlayProfile</code> from a plain JavaScript object, optionally creating a new instance.
    * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
    * @param {Object} data The plain JavaScript object bearing properties of interest.
    * @param {module:model/DlnaDirectPlayProfile} obj Optional instance to populate.
    * @return {module:model/DlnaDirectPlayProfile} The populated <code>DlnaDirectPlayProfile</code> instance.
    */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new DlnaDirectPlayProfile();
                        
            
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
                obj['Type'] = DlnaDlnaProfileType.constructFromObject(data['Type']);
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
    * @member {module:model/DlnaDlnaProfileType} Type
    */
    'Type' = undefined;




}
