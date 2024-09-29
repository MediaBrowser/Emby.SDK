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
import ActivityLogEntry from './ActivityLogEntry';

/**
* The QueryResultActivityLogEntry model module.
* @module model/QueryResultActivityLogEntry
* @version 4.8.10.0
*/
export default class QueryResultActivityLogEntry {
    /**
    * Constructs a new <code>QueryResultActivityLogEntry</code>.
    * @alias module:model/QueryResultActivityLogEntry
    * @class
    */

    constructor() {
        
        
        
    }

    /**
    * Constructs a <code>QueryResultActivityLogEntry</code> from a plain JavaScript object, optionally creating a new instance.
    * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
    * @param {Object} data The plain JavaScript object bearing properties of interest.
    * @param {module:model/QueryResultActivityLogEntry} obj Optional instance to populate.
    * @return {module:model/QueryResultActivityLogEntry} The populated <code>QueryResultActivityLogEntry</code> instance.
    */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new QueryResultActivityLogEntry();
                        
            
            if (data.hasOwnProperty('Items')) {
                obj['Items'] = ApiClient.convertToType(data['Items'], [ActivityLogEntry]);
            }
            if (data.hasOwnProperty('TotalRecordCount')) {
                obj['TotalRecordCount'] = ApiClient.convertToType(data['TotalRecordCount'], 'Number');
            }
        }
        return obj;
    }

    /**
    * @member {Array.<module:model/ActivityLogEntry>} Items
    */
    'Items' = undefined;
    /**
    * @member {Number} TotalRecordCount
    */
    'TotalRecordCount' = undefined;




}
