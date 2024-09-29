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
* The SyncDataResponse model module.
* @module model/SyncDataResponse
* @version 4.8.10.0
*/
export default class SyncDataResponse {
    /**
    * Constructs a new <code>SyncDataResponse</code>.
    * @alias module:model/SyncDataResponse
    * @class
    */

    constructor() {
        
        
        
    }

    /**
    * Constructs a <code>SyncDataResponse</code> from a plain JavaScript object, optionally creating a new instance.
    * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
    * @param {Object} data The plain JavaScript object bearing properties of interest.
    * @param {module:model/SyncDataResponse} obj Optional instance to populate.
    * @return {module:model/SyncDataResponse} The populated <code>SyncDataResponse</code> instance.
    */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new SyncDataResponse();
                        
            
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
