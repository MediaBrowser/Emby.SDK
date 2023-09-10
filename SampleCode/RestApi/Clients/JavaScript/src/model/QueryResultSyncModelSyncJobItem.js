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
import SyncModelSyncJobItem from './SyncModelSyncJobItem';

/**
* The QueryResultSyncModelSyncJobItem model module.
* @module model/QueryResultSyncModelSyncJobItem
* @version 4.8.0.46
*/
export default class QueryResultSyncModelSyncJobItem {
    /**
    * Constructs a new <code>QueryResultSyncModelSyncJobItem</code>.
    * @alias module:model/QueryResultSyncModelSyncJobItem
    * @class
    */

    constructor() {
        
        
        
    }

    /**
    * Constructs a <code>QueryResultSyncModelSyncJobItem</code> from a plain JavaScript object, optionally creating a new instance.
    * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
    * @param {Object} data The plain JavaScript object bearing properties of interest.
    * @param {module:model/QueryResultSyncModelSyncJobItem} obj Optional instance to populate.
    * @return {module:model/QueryResultSyncModelSyncJobItem} The populated <code>QueryResultSyncModelSyncJobItem</code> instance.
    */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new QueryResultSyncModelSyncJobItem();
                        
            
            if (data.hasOwnProperty('Items')) {
                obj['Items'] = ApiClient.convertToType(data['Items'], [SyncModelSyncJobItem]);
            }
            if (data.hasOwnProperty('TotalRecordCount')) {
                obj['TotalRecordCount'] = ApiClient.convertToType(data['TotalRecordCount'], 'Number');
            }
        }
        return obj;
    }

    /**
    * @member {Array.<module:model/SyncModelSyncJobItem>} Items
    */
    'Items' = undefined;
    /**
    * @member {Number} TotalRecordCount
    */
    'TotalRecordCount' = undefined;




}
