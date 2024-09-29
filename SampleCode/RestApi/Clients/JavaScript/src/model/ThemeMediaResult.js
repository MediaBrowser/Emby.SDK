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
* The ThemeMediaResult model module.
* @module model/ThemeMediaResult
* @version 4.8.10.0
*/
export default class ThemeMediaResult {
    /**
    * Constructs a new <code>ThemeMediaResult</code>.
    * Class ThemeMediaResult  
    * @alias module:model/ThemeMediaResult
    * @class
    */

    constructor() {
        
        
        
    }

    /**
    * Constructs a <code>ThemeMediaResult</code> from a plain JavaScript object, optionally creating a new instance.
    * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
    * @param {Object} data The plain JavaScript object bearing properties of interest.
    * @param {module:model/ThemeMediaResult} obj Optional instance to populate.
    * @return {module:model/ThemeMediaResult} The populated <code>ThemeMediaResult</code> instance.
    */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new ThemeMediaResult();
                        
            
            if (data.hasOwnProperty('OwnerId')) {
                obj['OwnerId'] = ApiClient.convertToType(data['OwnerId'], 'Number');
            }
            if (data.hasOwnProperty('Items')) {
                obj['Items'] = ApiClient.convertToType(data['Items'], [BaseItemDto]);
            }
            if (data.hasOwnProperty('TotalRecordCount')) {
                obj['TotalRecordCount'] = ApiClient.convertToType(data['TotalRecordCount'], 'Number');
            }
        }
        return obj;
    }

    /**
    * The owner id.
    * @member {Number} OwnerId
    */
    'OwnerId' = undefined;
    /**
    * @member {Array.<module:model/BaseItemDto>} Items
    */
    'Items' = undefined;
    /**
    * @member {Number} TotalRecordCount
    */
    'TotalRecordCount' = undefined;




}
