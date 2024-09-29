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
import SyncJob from './SyncJob';

/**
* The QueryResultSyncJob model module.
* @module model/QueryResultSyncJob
* @version 4.8.10.0
*/
export default class QueryResultSyncJob {
    /**
    * Constructs a new <code>QueryResultSyncJob</code>.
    * @alias module:model/QueryResultSyncJob
    * @class
    */

    constructor() {
        
        
        
    }

    /**
    * Constructs a <code>QueryResultSyncJob</code> from a plain JavaScript object, optionally creating a new instance.
    * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
    * @param {Object} data The plain JavaScript object bearing properties of interest.
    * @param {module:model/QueryResultSyncJob} obj Optional instance to populate.
    * @return {module:model/QueryResultSyncJob} The populated <code>QueryResultSyncJob</code> instance.
    */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new QueryResultSyncJob();
                        
            
            if (data.hasOwnProperty('Items')) {
                obj['Items'] = ApiClient.convertToType(data['Items'], [SyncJob]);
            }
            if (data.hasOwnProperty('TotalRecordCount')) {
                obj['TotalRecordCount'] = ApiClient.convertToType(data['TotalRecordCount'], 'Number');
            }
        }
        return obj;
    }

    /**
    * @member {Array.<module:model/SyncJob>} Items
    */
    'Items' = undefined;
    /**
    * @member {Number} TotalRecordCount
    */
    'TotalRecordCount' = undefined;




}
