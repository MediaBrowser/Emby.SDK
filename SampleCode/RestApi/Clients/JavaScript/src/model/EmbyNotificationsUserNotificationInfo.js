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
* The EmbyNotificationsUserNotificationInfo model module.
* @module model/EmbyNotificationsUserNotificationInfo
* @version 4.8.0.33
*/
export default class EmbyNotificationsUserNotificationInfo {
    /**
    * Constructs a new <code>EmbyNotificationsUserNotificationInfo</code>.
    * @alias module:model/EmbyNotificationsUserNotificationInfo
    * @class
    */

    constructor() {
        
        
        
    }

    /**
    * Constructs a <code>EmbyNotificationsUserNotificationInfo</code> from a plain JavaScript object, optionally creating a new instance.
    * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
    * @param {Object} data The plain JavaScript object bearing properties of interest.
    * @param {module:model/EmbyNotificationsUserNotificationInfo} obj Optional instance to populate.
    * @return {module:model/EmbyNotificationsUserNotificationInfo} The populated <code>EmbyNotificationsUserNotificationInfo</code> instance.
    */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new EmbyNotificationsUserNotificationInfo();
                        
            
            if (data.hasOwnProperty('NotifierKey')) {
                obj['NotifierKey'] = ApiClient.convertToType(data['NotifierKey'], 'String');
            }
            if (data.hasOwnProperty('SetupModuleUrl')) {
                obj['SetupModuleUrl'] = ApiClient.convertToType(data['SetupModuleUrl'], 'String');
            }
            if (data.hasOwnProperty('ServiceName')) {
                obj['ServiceName'] = ApiClient.convertToType(data['ServiceName'], 'String');
            }
            if (data.hasOwnProperty('FriendlyName')) {
                obj['FriendlyName'] = ApiClient.convertToType(data['FriendlyName'], 'String');
            }
            if (data.hasOwnProperty('Id')) {
                obj['Id'] = ApiClient.convertToType(data['Id'], 'String');
            }
            if (data.hasOwnProperty('Enabled')) {
                obj['Enabled'] = ApiClient.convertToType(data['Enabled'], 'Boolean');
            }
            if (data.hasOwnProperty('UserIds')) {
                obj['UserIds'] = ApiClient.convertToType(data['UserIds'], ['String']);
            }
            if (data.hasOwnProperty('LibraryIds')) {
                obj['LibraryIds'] = ApiClient.convertToType(data['LibraryIds'], ['String']);
            }
            if (data.hasOwnProperty('EventIds')) {
                obj['EventIds'] = ApiClient.convertToType(data['EventIds'], ['String']);
            }
            if (data.hasOwnProperty('UserId')) {
                obj['UserId'] = ApiClient.convertToType(data['UserId'], 'String');
            }
            if (data.hasOwnProperty('IsSelfNotification')) {
                obj['IsSelfNotification'] = ApiClient.convertToType(data['IsSelfNotification'], 'Boolean');
            }
            if (data.hasOwnProperty('Options')) {
                obj['Options'] = ApiClient.convertToType(data['Options'], {'String': 'String'});
            }
        }
        return obj;
    }

    /**
    * @member {String} NotifierKey
    */
    'NotifierKey' = undefined;
    /**
    * @member {String} SetupModuleUrl
    */
    'SetupModuleUrl' = undefined;
    /**
    * @member {String} ServiceName
    */
    'ServiceName' = undefined;
    /**
    * @member {String} FriendlyName
    */
    'FriendlyName' = undefined;
    /**
    * @member {String} Id
    */
    'Id' = undefined;
    /**
    * @member {Boolean} Enabled
    */
    'Enabled' = undefined;
    /**
    * @member {Array.<String>} UserIds
    */
    'UserIds' = undefined;
    /**
    * @member {Array.<String>} LibraryIds
    */
    'LibraryIds' = undefined;
    /**
    * @member {Array.<String>} EventIds
    */
    'EventIds' = undefined;
    /**
    * @member {String} UserId
    */
    'UserId' = undefined;
    /**
    * @member {Boolean} IsSelfNotification
    */
    'IsSelfNotification' = undefined;
    /**
    * @member {Object.<String, String>} Options
    */
    'Options' = undefined;




}
