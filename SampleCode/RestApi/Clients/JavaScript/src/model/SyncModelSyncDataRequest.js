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

/**
* The SyncModelSyncDataRequest model module.
* @module model/SyncModelSyncDataRequest
* @version 4.8.0.45
*/
export default class SyncModelSyncDataRequest {
    /**
    * Constructs a new <code>SyncModelSyncDataRequest</code>.
    * @alias module:model/SyncModelSyncDataRequest
    * @class
    */

    constructor() {
        
        
        
    }

    /**
    * Constructs a <code>SyncModelSyncDataRequest</code> from a plain JavaScript object, optionally creating a new instance.
    * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
    * @param {Object} data The plain JavaScript object bearing properties of interest.
    * @param {module:model/SyncModelSyncDataRequest} obj Optional instance to populate.
    * @return {module:model/SyncModelSyncDataRequest} The populated <code>SyncModelSyncDataRequest</code> instance.
    */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new SyncModelSyncDataRequest();
                        
            
            if (data.hasOwnProperty('LocalItemIds')) {
                obj['LocalItemIds'] = ApiClient.convertToType(data['LocalItemIds'], ['String']);
            }
            if (data.hasOwnProperty('TargetId')) {
                obj['TargetId'] = ApiClient.convertToType(data['TargetId'], 'String');
            }
        }
        return obj;
    }

    /**
    * @member {Array.<String>} LocalItemIds
    */
    'LocalItemIds' = undefined;
    /**
    * @member {String} TargetId
    */
    'TargetId' = undefined;




}
