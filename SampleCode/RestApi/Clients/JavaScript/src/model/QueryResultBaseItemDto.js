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
* The QueryResultBaseItemDto model module.
* @module model/QueryResultBaseItemDto
* @version 4.8.10.0
*/
export default class QueryResultBaseItemDto {
    /**
    * Constructs a new <code>QueryResultBaseItemDto</code>.
    * @alias module:model/QueryResultBaseItemDto
    * @class
    */

    constructor() {
        
        
        
    }

    /**
    * Constructs a <code>QueryResultBaseItemDto</code> from a plain JavaScript object, optionally creating a new instance.
    * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
    * @param {Object} data The plain JavaScript object bearing properties of interest.
    * @param {module:model/QueryResultBaseItemDto} obj Optional instance to populate.
    * @return {module:model/QueryResultBaseItemDto} The populated <code>QueryResultBaseItemDto</code> instance.
    */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new QueryResultBaseItemDto();
                        
            
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
    * @member {Array.<module:model/BaseItemDto>} Items
    */
    'Items' = undefined;
    /**
    * @member {Number} TotalRecordCount
    */
    'TotalRecordCount' = undefined;




}
