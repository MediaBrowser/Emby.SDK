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
import SyncSyncJob from './SyncSyncJob';

/**
* The QueryResultSyncSyncJob model module.
* @module model/QueryResultSyncSyncJob
* @version 4.8.0.17
*/
export default class QueryResultSyncSyncJob {
    /**
    * Constructs a new <code>QueryResultSyncSyncJob</code>.
    * @alias module:model/QueryResultSyncSyncJob
    * @class
    */

    constructor() {
        
        
        
    }

    /**
    * Constructs a <code>QueryResultSyncSyncJob</code> from a plain JavaScript object, optionally creating a new instance.
    * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
    * @param {Object} data The plain JavaScript object bearing properties of interest.
    * @param {module:model/QueryResultSyncSyncJob} obj Optional instance to populate.
    * @return {module:model/QueryResultSyncSyncJob} The populated <code>QueryResultSyncSyncJob</code> instance.
    */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new QueryResultSyncSyncJob();
                        
            
            if (data.hasOwnProperty('Items')) {
                obj['Items'] = ApiClient.convertToType(data['Items'], [SyncSyncJob]);
            }
            if (data.hasOwnProperty('TotalRecordCount')) {
                obj['TotalRecordCount'] = ApiClient.convertToType(data['TotalRecordCount'], 'Number');
            }
        }
        return obj;
    }

    /**
    * @member {Array.<module:model/SyncSyncJob>} Items
    */
    'Items' = undefined;
    /**
    * @member {Number} TotalRecordCount
    */
    'TotalRecordCount' = undefined;




}
