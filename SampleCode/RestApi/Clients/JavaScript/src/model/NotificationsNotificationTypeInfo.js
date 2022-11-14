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
* The NotificationsNotificationTypeInfo model module.
* @module model/NotificationsNotificationTypeInfo
* @version 4.8.0.17
*/
export default class NotificationsNotificationTypeInfo {
    /**
    * Constructs a new <code>NotificationsNotificationTypeInfo</code>.
    * @alias module:model/NotificationsNotificationTypeInfo
    * @class
    */

    constructor() {
        
        
        
    }

    /**
    * Constructs a <code>NotificationsNotificationTypeInfo</code> from a plain JavaScript object, optionally creating a new instance.
    * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
    * @param {Object} data The plain JavaScript object bearing properties of interest.
    * @param {module:model/NotificationsNotificationTypeInfo} obj Optional instance to populate.
    * @return {module:model/NotificationsNotificationTypeInfo} The populated <code>NotificationsNotificationTypeInfo</code> instance.
    */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new NotificationsNotificationTypeInfo();
                        
            
            if (data.hasOwnProperty('Type')) {
                obj['Type'] = ApiClient.convertToType(data['Type'], 'String');
            }
            if (data.hasOwnProperty('Name')) {
                obj['Name'] = ApiClient.convertToType(data['Name'], 'String');
            }
            if (data.hasOwnProperty('Enabled')) {
                obj['Enabled'] = ApiClient.convertToType(data['Enabled'], 'Boolean');
            }
            if (data.hasOwnProperty('Category')) {
                obj['Category'] = ApiClient.convertToType(data['Category'], 'String');
            }
            if (data.hasOwnProperty('IsBasedOnUserEvent')) {
                obj['IsBasedOnUserEvent'] = ApiClient.convertToType(data['IsBasedOnUserEvent'], 'Boolean');
            }
        }
        return obj;
    }

    /**
    * @member {String} Type
    */
    'Type' = undefined;
    /**
    * @member {String} Name
    */
    'Name' = undefined;
    /**
    * @member {Boolean} Enabled
    */
    'Enabled' = undefined;
    /**
    * @member {String} Category
    */
    'Category' = undefined;
    /**
    * @member {Boolean} IsBasedOnUserEvent
    */
    'IsBasedOnUserEvent' = undefined;




}
