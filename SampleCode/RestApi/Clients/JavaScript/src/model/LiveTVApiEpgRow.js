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
import BaseItemDto from './BaseItemDto';

/**
* The LiveTVApiEpgRow model module.
* @module model/LiveTVApiEpgRow
* @version 4.8.0.14
*/
export default class LiveTVApiEpgRow {
    /**
    * Constructs a new <code>LiveTVApiEpgRow</code>.
    * @alias module:model/LiveTVApiEpgRow
    * @class
    */

    constructor() {
        
        
        
    }

    /**
    * Constructs a <code>LiveTVApiEpgRow</code> from a plain JavaScript object, optionally creating a new instance.
    * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
    * @param {Object} data The plain JavaScript object bearing properties of interest.
    * @param {module:model/LiveTVApiEpgRow} obj Optional instance to populate.
    * @return {module:model/LiveTVApiEpgRow} The populated <code>LiveTVApiEpgRow</code> instance.
    */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new LiveTVApiEpgRow();
                        
            
            if (data.hasOwnProperty('Channel')) {
                obj['Channel'] = BaseItemDto.constructFromObject(data['Channel']);
            }
            if (data.hasOwnProperty('Programs')) {
                obj['Programs'] = ApiClient.convertToType(data['Programs'], [BaseItemDto]);
            }
        }
        return obj;
    }

    /**
    * @member {module:model/BaseItemDto} Channel
    */
    'Channel' = undefined;
    /**
    * @member {Array.<module:model/BaseItemDto>} Programs
    */
    'Programs' = undefined;




}
