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
* The EmbyNotificationsNotificationTypeInfo model module.
* @module model/EmbyNotificationsNotificationTypeInfo
* @version 4.8.0.37
*/
export default class EmbyNotificationsNotificationTypeInfo {
    /**
    * Constructs a new <code>EmbyNotificationsNotificationTypeInfo</code>.
    * @alias module:model/EmbyNotificationsNotificationTypeInfo
    * @class
    */

    constructor() {
        
        
        
    }

    /**
    * Constructs a <code>EmbyNotificationsNotificationTypeInfo</code> from a plain JavaScript object, optionally creating a new instance.
    * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
    * @param {Object} data The plain JavaScript object bearing properties of interest.
    * @param {module:model/EmbyNotificationsNotificationTypeInfo} obj Optional instance to populate.
    * @return {module:model/EmbyNotificationsNotificationTypeInfo} The populated <code>EmbyNotificationsNotificationTypeInfo</code> instance.
    */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new EmbyNotificationsNotificationTypeInfo();
                        
            
            if (data.hasOwnProperty('Name')) {
                obj['Name'] = ApiClient.convertToType(data['Name'], 'String');
            }
            if (data.hasOwnProperty('Id')) {
                obj['Id'] = ApiClient.convertToType(data['Id'], 'String');
            }
            if (data.hasOwnProperty('CategoryName')) {
                obj['CategoryName'] = ApiClient.convertToType(data['CategoryName'], 'String');
            }
            if (data.hasOwnProperty('CategoryId')) {
                obj['CategoryId'] = ApiClient.convertToType(data['CategoryId'], 'String');
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
    * @member {String} CategoryName
    */
    'CategoryName' = undefined;
    /**
    * @member {String} CategoryId
    */
    'CategoryId' = undefined;




}
