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
import UserDto from './UserDto';

/**
* The QueryResultUserDto model module.
* @module model/QueryResultUserDto
* @version 4.8.10.0
*/
export default class QueryResultUserDto {
    /**
    * Constructs a new <code>QueryResultUserDto</code>.
    * @alias module:model/QueryResultUserDto
    * @class
    */

    constructor() {
        
        
        
    }

    /**
    * Constructs a <code>QueryResultUserDto</code> from a plain JavaScript object, optionally creating a new instance.
    * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
    * @param {Object} data The plain JavaScript object bearing properties of interest.
    * @param {module:model/QueryResultUserDto} obj Optional instance to populate.
    * @return {module:model/QueryResultUserDto} The populated <code>QueryResultUserDto</code> instance.
    */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new QueryResultUserDto();
                        
            
            if (data.hasOwnProperty('Items')) {
                obj['Items'] = ApiClient.convertToType(data['Items'], [UserDto]);
            }
            if (data.hasOwnProperty('TotalRecordCount')) {
                obj['TotalRecordCount'] = ApiClient.convertToType(data['TotalRecordCount'], 'Number');
            }
        }
        return obj;
    }

    /**
    * @member {Array.<module:model/UserDto>} Items
    */
    'Items' = undefined;
    /**
    * @member {Number} TotalRecordCount
    */
    'TotalRecordCount' = undefined;




}
