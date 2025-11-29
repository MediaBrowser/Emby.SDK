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
* The ApiAddAdminNotification model module.
* @module model/ApiAddAdminNotification
* @version 4.9.2.7
*/
export default class ApiAddAdminNotification {
    /**
    * Constructs a new <code>ApiAddAdminNotification</code>.
    * @alias module:model/ApiAddAdminNotification
    * @class
    */

    constructor() {
        
        
        
    }

    /**
    * Constructs a <code>ApiAddAdminNotification</code> from a plain JavaScript object, optionally creating a new instance.
    * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
    * @param {Object} data The plain JavaScript object bearing properties of interest.
    * @param {module:model/ApiAddAdminNotification} obj Optional instance to populate.
    * @return {module:model/ApiAddAdminNotification} The populated <code>ApiAddAdminNotification</code> instance.
    */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new ApiAddAdminNotification();
                        
            
            if (data.hasOwnProperty('DisplayDateTime')) {
                obj['DisplayDateTime'] = ApiClient.convertToType(data['DisplayDateTime'], 'Boolean');
            }
        }
        return obj;
    }

    /**
    * @member {Boolean} DisplayDateTime
    */
    'DisplayDateTime' = undefined;




}
