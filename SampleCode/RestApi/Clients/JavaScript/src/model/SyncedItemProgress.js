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
import SyncJobItemStatus from './SyncJobItemStatus';

/**
* The SyncedItemProgress model module.
* @module model/SyncedItemProgress
* @version 4.8.10.0
*/
export default class SyncedItemProgress {
    /**
    * Constructs a new <code>SyncedItemProgress</code>.
    * @alias module:model/SyncedItemProgress
    * @class
    */

    constructor() {
        
        
        
    }

    /**
    * Constructs a <code>SyncedItemProgress</code> from a plain JavaScript object, optionally creating a new instance.
    * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
    * @param {Object} data The plain JavaScript object bearing properties of interest.
    * @param {module:model/SyncedItemProgress} obj Optional instance to populate.
    * @return {module:model/SyncedItemProgress} The populated <code>SyncedItemProgress</code> instance.
    */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new SyncedItemProgress();
                        
            
            if (data.hasOwnProperty('Progress')) {
                obj['Progress'] = ApiClient.convertToType(data['Progress'], 'Number');
            }
            if (data.hasOwnProperty('Status')) {
                obj['Status'] = SyncJobItemStatus.constructFromObject(data['Status']);
            }
        }
        return obj;
    }

    /**
    * @member {Number} Progress
    */
    'Progress' = undefined;
    /**
    * @member {module:model/SyncJobItemStatus} Status
    */
    'Status' = undefined;




}
