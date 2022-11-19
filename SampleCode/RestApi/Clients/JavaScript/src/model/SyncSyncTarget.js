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
* The SyncSyncTarget model module.
* @module model/SyncSyncTarget
* @version 4.8.0.19
*/
export default class SyncSyncTarget {
    /**
    * Constructs a new <code>SyncSyncTarget</code>.
    * @alias module:model/SyncSyncTarget
    * @class
    */

    constructor() {
        
        
        
    }

    /**
    * Constructs a <code>SyncSyncTarget</code> from a plain JavaScript object, optionally creating a new instance.
    * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
    * @param {Object} data The plain JavaScript object bearing properties of interest.
    * @param {module:model/SyncSyncTarget} obj Optional instance to populate.
    * @return {module:model/SyncSyncTarget} The populated <code>SyncSyncTarget</code> instance.
    */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new SyncSyncTarget();
                        
            
            if (data.hasOwnProperty('Name')) {
                obj['Name'] = ApiClient.convertToType(data['Name'], 'String');
            }
            if (data.hasOwnProperty('Id')) {
                obj['Id'] = ApiClient.convertToType(data['Id'], 'String');
            }
        }
        return obj;
    }

    /**
    * @member {String} Name
    */
    'Name' = undefined;
    /**
    * @member {String} Id
    */
    'Id' = undefined;




}
