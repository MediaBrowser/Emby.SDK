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
import EmbyNotificationsNotificationTypeInfo from './EmbyNotificationsNotificationTypeInfo';

/**
* The EmbyNotificationsNotificationCategoryInfo model module.
* @module model/EmbyNotificationsNotificationCategoryInfo
* @version 4.8.0.37
*/
export default class EmbyNotificationsNotificationCategoryInfo {
    /**
    * Constructs a new <code>EmbyNotificationsNotificationCategoryInfo</code>.
    * @alias module:model/EmbyNotificationsNotificationCategoryInfo
    * @class
    */

    constructor() {
        
        
        
    }

    /**
    * Constructs a <code>EmbyNotificationsNotificationCategoryInfo</code> from a plain JavaScript object, optionally creating a new instance.
    * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
    * @param {Object} data The plain JavaScript object bearing properties of interest.
    * @param {module:model/EmbyNotificationsNotificationCategoryInfo} obj Optional instance to populate.
    * @return {module:model/EmbyNotificationsNotificationCategoryInfo} The populated <code>EmbyNotificationsNotificationCategoryInfo</code> instance.
    */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new EmbyNotificationsNotificationCategoryInfo();
                        
            
            if (data.hasOwnProperty('Name')) {
                obj['Name'] = ApiClient.convertToType(data['Name'], 'String');
            }
            if (data.hasOwnProperty('Id')) {
                obj['Id'] = ApiClient.convertToType(data['Id'], 'String');
            }
            if (data.hasOwnProperty('Events')) {
                obj['Events'] = ApiClient.convertToType(data['Events'], [EmbyNotificationsNotificationTypeInfo]);
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
    * @member {Array.<module:model/EmbyNotificationsNotificationTypeInfo>} Events
    */
    'Events' = undefined;




}
