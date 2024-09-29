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

/**
* The SyncDataRequest model module.
* @module model/SyncDataRequest
* @version 4.8.10.0
*/
export default class SyncDataRequest {
    /**
    * Constructs a new <code>SyncDataRequest</code>.
    * @alias module:model/SyncDataRequest
    * @class
    */

    constructor() {
        
        
        
    }

    /**
    * Constructs a <code>SyncDataRequest</code> from a plain JavaScript object, optionally creating a new instance.
    * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
    * @param {Object} data The plain JavaScript object bearing properties of interest.
    * @param {module:model/SyncDataRequest} obj Optional instance to populate.
    * @return {module:model/SyncDataRequest} The populated <code>SyncDataRequest</code> instance.
    */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new SyncDataRequest();
                        
            
            if (data.hasOwnProperty('LocalItemIds')) {
                obj['LocalItemIds'] = ApiClient.convertToType(data['LocalItemIds'], ['String']);
            }
            if (data.hasOwnProperty('InternalTargetIds')) {
                obj['InternalTargetIds'] = ApiClient.convertToType(data['InternalTargetIds'], ['Number']);
            }
        }
        return obj;
    }

    /**
    * @member {Array.<String>} LocalItemIds
    */
    'LocalItemIds' = undefined;
    /**
    * @member {Array.<Number>} InternalTargetIds
    */
    'InternalTargetIds' = undefined;




}
