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
import SyncModelSyncJobItemStatus from './SyncModelSyncJobItemStatus';

/**
* The SyncModelSyncedItemProgress model module.
* @module model/SyncModelSyncedItemProgress
* @version 4.8.0.6
*/
export default class SyncModelSyncedItemProgress {
    /**
    * Constructs a new <code>SyncModelSyncedItemProgress</code>.
    * @alias module:model/SyncModelSyncedItemProgress
    * @class
    */

    constructor() {
        
        
        
    }

    /**
    * Constructs a <code>SyncModelSyncedItemProgress</code> from a plain JavaScript object, optionally creating a new instance.
    * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
    * @param {Object} data The plain JavaScript object bearing properties of interest.
    * @param {module:model/SyncModelSyncedItemProgress} obj Optional instance to populate.
    * @return {module:model/SyncModelSyncedItemProgress} The populated <code>SyncModelSyncedItemProgress</code> instance.
    */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new SyncModelSyncedItemProgress();
                        
            
            if (data.hasOwnProperty('Progress')) {
                obj['Progress'] = ApiClient.convertToType(data['Progress'], 'Number');
            }
            if (data.hasOwnProperty('Status')) {
                obj['Status'] = SyncModelSyncJobItemStatus.constructFromObject(data['Status']);
            }
        }
        return obj;
    }

    /**
    * @member {Number} Progress
    */
    'Progress' = undefined;
    /**
    * @member {module:model/SyncModelSyncJobItemStatus} Status
    */
    'Status' = undefined;




}
