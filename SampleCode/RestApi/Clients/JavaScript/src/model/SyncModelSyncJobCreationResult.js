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
import SyncSyncJob from './SyncSyncJob';

/**
* The SyncModelSyncJobCreationResult model module.
* @module model/SyncModelSyncJobCreationResult
* @version 4.8.0.15
*/
export default class SyncModelSyncJobCreationResult {
    /**
    * Constructs a new <code>SyncModelSyncJobCreationResult</code>.
    * @alias module:model/SyncModelSyncJobCreationResult
    * @class
    */

    constructor() {
        
        
        
    }

    /**
    * Constructs a <code>SyncModelSyncJobCreationResult</code> from a plain JavaScript object, optionally creating a new instance.
    * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
    * @param {Object} data The plain JavaScript object bearing properties of interest.
    * @param {module:model/SyncModelSyncJobCreationResult} obj Optional instance to populate.
    * @return {module:model/SyncModelSyncJobCreationResult} The populated <code>SyncModelSyncJobCreationResult</code> instance.
    */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new SyncModelSyncJobCreationResult();
                        
            
            if (data.hasOwnProperty('Job')) {
                obj['Job'] = SyncSyncJob.constructFromObject(data['Job']);
            }
            if (data.hasOwnProperty('JobItems')) {
                obj['JobItems'] = ApiClient.convertToType(data['JobItems'], [SyncModelSyncJobItem]);
            }
        }
        return obj;
    }

    /**
    * @member {module:model/SyncSyncJob} Job
    */
    'Job' = undefined;
    /**
    * @member {Array.<module:model/SyncModelSyncJobItem>} JobItems
    */
    'JobItems' = undefined;




}
