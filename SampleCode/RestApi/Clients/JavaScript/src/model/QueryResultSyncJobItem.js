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
import SyncJobItem from './SyncJobItem';

/**
* The QueryResultSyncJobItem model module.
* @module model/QueryResultSyncJobItem
* @version 4.8.10.0
*/
export default class QueryResultSyncJobItem {
    /**
    * Constructs a new <code>QueryResultSyncJobItem</code>.
    * @alias module:model/QueryResultSyncJobItem
    * @class
    */

    constructor() {
        
        
        
    }

    /**
    * Constructs a <code>QueryResultSyncJobItem</code> from a plain JavaScript object, optionally creating a new instance.
    * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
    * @param {Object} data The plain JavaScript object bearing properties of interest.
    * @param {module:model/QueryResultSyncJobItem} obj Optional instance to populate.
    * @return {module:model/QueryResultSyncJobItem} The populated <code>QueryResultSyncJobItem</code> instance.
    */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new QueryResultSyncJobItem();
                        
            
            if (data.hasOwnProperty('Items')) {
                obj['Items'] = ApiClient.convertToType(data['Items'], [SyncJobItem]);
            }
            if (data.hasOwnProperty('TotalRecordCount')) {
                obj['TotalRecordCount'] = ApiClient.convertToType(data['TotalRecordCount'], 'Number');
            }
        }
        return obj;
    }

    /**
    * @member {Array.<module:model/SyncJobItem>} Items
    */
    'Items' = undefined;
    /**
    * @member {Number} TotalRecordCount
    */
    'TotalRecordCount' = undefined;




}
