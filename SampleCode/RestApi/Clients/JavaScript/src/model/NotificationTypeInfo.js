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
* The NotificationTypeInfo model module.
* @module model/NotificationTypeInfo
* @version 4.8.10.0
*/
export default class NotificationTypeInfo {
    /**
    * Constructs a new <code>NotificationTypeInfo</code>.
    * @alias module:model/NotificationTypeInfo
    * @class
    */

    constructor() {
        
        
        
    }

    /**
    * Constructs a <code>NotificationTypeInfo</code> from a plain JavaScript object, optionally creating a new instance.
    * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
    * @param {Object} data The plain JavaScript object bearing properties of interest.
    * @param {module:model/NotificationTypeInfo} obj Optional instance to populate.
    * @return {module:model/NotificationTypeInfo} The populated <code>NotificationTypeInfo</code> instance.
    */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new NotificationTypeInfo();
                        
            
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
