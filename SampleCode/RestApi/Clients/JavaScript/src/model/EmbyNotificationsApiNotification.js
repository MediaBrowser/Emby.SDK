/**
 * Emby Server REST API (BETA)
 * Explore the Emby Server API
 *
 * OpenAPI spec version: 4.8.0.5
 * 
 *
 * NOTE: This class is auto generated.
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';
import NotificationsNotificationLevel from './NotificationsNotificationLevel';

/**
* The EmbyNotificationsApiNotification model module.
* @module model/EmbyNotificationsApiNotification
* @version 4.8.0.5
*/
export default class EmbyNotificationsApiNotification {
    /**
    * Constructs a new <code>EmbyNotificationsApiNotification</code>.
    * @alias module:model/EmbyNotificationsApiNotification
    * @class
    */

    constructor() {
        
        
        
    }

    /**
    * Constructs a <code>EmbyNotificationsApiNotification</code> from a plain JavaScript object, optionally creating a new instance.
    * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
    * @param {Object} data The plain JavaScript object bearing properties of interest.
    * @param {module:model/EmbyNotificationsApiNotification} obj Optional instance to populate.
    * @return {module:model/EmbyNotificationsApiNotification} The populated <code>EmbyNotificationsApiNotification</code> instance.
    */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new EmbyNotificationsApiNotification();
                        
            
            if (data.hasOwnProperty('Id')) {
                obj['Id'] = ApiClient.convertToType(data['Id'], 'String');
            }
            if (data.hasOwnProperty('UserId')) {
                obj['UserId'] = ApiClient.convertToType(data['UserId'], 'String');
            }
            if (data.hasOwnProperty('Date')) {
                obj['Date'] = ApiClient.convertToType(data['Date'], 'Date');
            }
            if (data.hasOwnProperty('IsRead')) {
                obj['IsRead'] = ApiClient.convertToType(data['IsRead'], 'Boolean');
            }
            if (data.hasOwnProperty('Name')) {
                obj['Name'] = ApiClient.convertToType(data['Name'], 'String');
            }
            if (data.hasOwnProperty('Description')) {
                obj['Description'] = ApiClient.convertToType(data['Description'], 'String');
            }
            if (data.hasOwnProperty('Url')) {
                obj['Url'] = ApiClient.convertToType(data['Url'], 'String');
            }
            if (data.hasOwnProperty('Level')) {
                obj['Level'] = NotificationsNotificationLevel.constructFromObject(data['Level']);
            }
        }
        return obj;
    }

    /**
    * @member {String} Id
    */
    'Id' = undefined;
    /**
    * @member {String} UserId
    */
    'UserId' = undefined;
    /**
    * @member {Date} Date
    */
    'Date' = undefined;
    /**
    * @member {Boolean} IsRead
    */
    'IsRead' = undefined;
    /**
    * @member {String} Name
    */
    'Name' = undefined;
    /**
    * @member {String} Description
    */
    'Description' = undefined;
    /**
    * @member {String} Url
    */
    'Url' = undefined;
    /**
    * @member {module:model/NotificationsNotificationLevel} Level
    */
    'Level' = undefined;




}
