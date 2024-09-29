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
import ApiEpgRow from './ApiEpgRow';

/**
* The QueryResultApiEpgRow model module.
* @module model/QueryResultApiEpgRow
* @version 4.8.10.0
*/
export default class QueryResultApiEpgRow {
    /**
    * Constructs a new <code>QueryResultApiEpgRow</code>.
    * @alias module:model/QueryResultApiEpgRow
    * @class
    */

    constructor() {
        
        
        
    }

    /**
    * Constructs a <code>QueryResultApiEpgRow</code> from a plain JavaScript object, optionally creating a new instance.
    * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
    * @param {Object} data The plain JavaScript object bearing properties of interest.
    * @param {module:model/QueryResultApiEpgRow} obj Optional instance to populate.
    * @return {module:model/QueryResultApiEpgRow} The populated <code>QueryResultApiEpgRow</code> instance.
    */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new QueryResultApiEpgRow();
                        
            
            if (data.hasOwnProperty('Items')) {
                obj['Items'] = ApiClient.convertToType(data['Items'], [ApiEpgRow]);
            }
            if (data.hasOwnProperty('TotalRecordCount')) {
                obj['TotalRecordCount'] = ApiClient.convertToType(data['TotalRecordCount'], 'Number');
            }
        }
        return obj;
    }

    /**
    * @member {Array.<module:model/ApiEpgRow>} Items
    */
    'Items' = undefined;
    /**
    * @member {Number} TotalRecordCount
    */
    'TotalRecordCount' = undefined;




}
