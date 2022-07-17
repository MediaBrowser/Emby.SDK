/**
 * Emby REST API
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
* The SyncModelSyncDataResponse model module.
* @module model/SyncModelSyncDataResponse
* @version 4.7.5.0
*/
export default class SyncModelSyncDataResponse {
    /**
    * Constructs a new <code>SyncModelSyncDataResponse</code>.
    * @alias module:model/SyncModelSyncDataResponse
    * @class
    */

    constructor() {
        
        
        
    }

    /**
    * Constructs a <code>SyncModelSyncDataResponse</code> from a plain JavaScript object, optionally creating a new instance.
    * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
    * @param {Object} data The plain JavaScript object bearing properties of interest.
    * @param {module:model/SyncModelSyncDataResponse} obj Optional instance to populate.
    * @return {module:model/SyncModelSyncDataResponse} The populated <code>SyncModelSyncDataResponse</code> instance.
    */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new SyncModelSyncDataResponse();
                        
            
            if (data.hasOwnProperty('ItemIdsToRemove')) {
                obj['ItemIdsToRemove'] = ApiClient.convertToType(data['ItemIdsToRemove'], ['String']);
            }
        }
        return obj;
    }

    /**
    * @member {Array.<String>} ItemIdsToRemove
    */
    'ItemIdsToRemove' = undefined;




}
