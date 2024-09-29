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
import SyncJobItem from './SyncJobItem';

/**
* The SyncJobCreationResult model module.
* @module model/SyncJobCreationResult
* @version 4.8.10.0
*/
export default class SyncJobCreationResult {
    /**
    * Constructs a new <code>SyncJobCreationResult</code>.
    * @alias module:model/SyncJobCreationResult
    * @class
    */

    constructor() {
        
        
        
    }

    /**
    * Constructs a <code>SyncJobCreationResult</code> from a plain JavaScript object, optionally creating a new instance.
    * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
    * @param {Object} data The plain JavaScript object bearing properties of interest.
    * @param {module:model/SyncJobCreationResult} obj Optional instance to populate.
    * @return {module:model/SyncJobCreationResult} The populated <code>SyncJobCreationResult</code> instance.
    */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new SyncJobCreationResult();
                        
            
            if (data.hasOwnProperty('Job')) {
                obj['Job'] = SyncJob.constructFromObject(data['Job']);
            }
            if (data.hasOwnProperty('JobItems')) {
                obj['JobItems'] = ApiClient.convertToType(data['JobItems'], [SyncJobItem]);
            }
        }
        return obj;
    }

    /**
    * @member {module:model/SyncJob} Job
    */
    'Job' = undefined;
    /**
    * @member {Array.<module:model/SyncJobItem>} JobItems
    */
    'JobItems' = undefined;




}
