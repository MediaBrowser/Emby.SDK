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
* The UserNotificationInfo model module.
* @module model/UserNotificationInfo
* @version 4.8.10.0
*/
export default class UserNotificationInfo {
    /**
    * Constructs a new <code>UserNotificationInfo</code>.
    * @alias module:model/UserNotificationInfo
    * @class
    */

    constructor() {
        
        
        
    }

    /**
    * Constructs a <code>UserNotificationInfo</code> from a plain JavaScript object, optionally creating a new instance.
    * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
    * @param {Object} data The plain JavaScript object bearing properties of interest.
    * @param {module:model/UserNotificationInfo} obj Optional instance to populate.
    * @return {module:model/UserNotificationInfo} The populated <code>UserNotificationInfo</code> instance.
    */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new UserNotificationInfo();
                        
            
            if (data.hasOwnProperty('NotifierKey')) {
                obj['NotifierKey'] = ApiClient.convertToType(data['NotifierKey'], 'String');
            }
            if (data.hasOwnProperty('SetupModuleUrl')) {
                obj['SetupModuleUrl'] = ApiClient.convertToType(data['SetupModuleUrl'], 'String');
            }
            if (data.hasOwnProperty('ServiceName')) {
                obj['ServiceName'] = ApiClient.convertToType(data['ServiceName'], 'String');
            }
            if (data.hasOwnProperty('PluginId')) {
                obj['PluginId'] = ApiClient.convertToType(data['PluginId'], 'String');
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
            if (data.hasOwnProperty('DeviceIds')) {
                obj['DeviceIds'] = ApiClient.convertToType(data['DeviceIds'], ['String']);
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
            if (data.hasOwnProperty('GroupItems')) {
                obj['GroupItems'] = ApiClient.convertToType(data['GroupItems'], 'Boolean');
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
    * @member {String} PluginId
    */
    'PluginId' = undefined;
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
    * Limit events based on user ids, for admin notifications
    * @member {Array.<String>} UserIds
    */
    'UserIds' = undefined;
    /**
    * @member {Array.<String>} DeviceIds
    */
    'DeviceIds' = undefined;
    /**
    * @member {Array.<String>} LibraryIds
    */
    'LibraryIds' = undefined;
    /**
    * @member {Array.<String>} EventIds
    */
    'EventIds' = undefined;
    /**
    * Notification intended for a specific user
    * @member {String} UserId
    */
    'UserId' = undefined;
    /**
    * @member {Boolean} IsSelfNotification
    */
    'IsSelfNotification' = undefined;
    /**
    * @member {Boolean} GroupItems
    */
    'GroupItems' = undefined;
    /**
    * This is for webhooks since this will cause xml serialization to fail
    * @member {Object.<String, String>} Options
    */
    'Options' = undefined;




}
