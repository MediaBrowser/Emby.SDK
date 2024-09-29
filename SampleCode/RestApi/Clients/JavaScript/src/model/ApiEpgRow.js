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
import BaseItemDto from './BaseItemDto';

/**
* The ApiEpgRow model module.
* @module model/ApiEpgRow
* @version 4.8.10.0
*/
export default class ApiEpgRow {
    /**
    * Constructs a new <code>ApiEpgRow</code>.
    * @alias module:model/ApiEpgRow
    * @class
    */

    constructor() {
        
        
        
    }

    /**
    * Constructs a <code>ApiEpgRow</code> from a plain JavaScript object, optionally creating a new instance.
    * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
    * @param {Object} data The plain JavaScript object bearing properties of interest.
    * @param {module:model/ApiEpgRow} obj Optional instance to populate.
    * @return {module:model/ApiEpgRow} The populated <code>ApiEpgRow</code> instance.
    */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new ApiEpgRow();
                        
            
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
