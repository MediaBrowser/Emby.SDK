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
import NotificationTypeInfo from './NotificationTypeInfo';

/**
* The NotificationCategoryInfo model module.
* @module model/NotificationCategoryInfo
* @version 4.8.10.0
*/
export default class NotificationCategoryInfo {
    /**
    * Constructs a new <code>NotificationCategoryInfo</code>.
    * @alias module:model/NotificationCategoryInfo
    * @class
    */

    constructor() {
        
        
        
    }

    /**
    * Constructs a <code>NotificationCategoryInfo</code> from a plain JavaScript object, optionally creating a new instance.
    * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
    * @param {Object} data The plain JavaScript object bearing properties of interest.
    * @param {module:model/NotificationCategoryInfo} obj Optional instance to populate.
    * @return {module:model/NotificationCategoryInfo} The populated <code>NotificationCategoryInfo</code> instance.
    */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new NotificationCategoryInfo();
                        
            
            if (data.hasOwnProperty('Name')) {
                obj['Name'] = ApiClient.convertToType(data['Name'], 'String');
            }
            if (data.hasOwnProperty('Id')) {
                obj['Id'] = ApiClient.convertToType(data['Id'], 'String');
            }
            if (data.hasOwnProperty('Events')) {
                obj['Events'] = ApiClient.convertToType(data['Events'], [NotificationTypeInfo]);
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
    /**
    * @member {Array.<module:model/NotificationTypeInfo>} Events
    */
    'Events' = undefined;




}
