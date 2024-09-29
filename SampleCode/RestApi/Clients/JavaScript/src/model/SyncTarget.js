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
* The SyncTarget model module.
* @module model/SyncTarget
* @version 4.8.10.0
*/
export default class SyncTarget {
    /**
    * Constructs a new <code>SyncTarget</code>.
    * @alias module:model/SyncTarget
    * @class
    */

    constructor() {
        
        
        
    }

    /**
    * Constructs a <code>SyncTarget</code> from a plain JavaScript object, optionally creating a new instance.
    * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
    * @param {Object} data The plain JavaScript object bearing properties of interest.
    * @param {module:model/SyncTarget} obj Optional instance to populate.
    * @return {module:model/SyncTarget} The populated <code>SyncTarget</code> instance.
    */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new SyncTarget();
                        
            
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
    * The name.
    * @member {String} Name
    */
    'Name' = undefined;
    /**
    * The identifier.
    * @member {String} Id
    */
    'Id' = undefined;




}
