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
import NotificationsNotificationLevel from './NotificationsNotificationLevel';

/**
* The TextSectionInfo model module.
* @module model/TextSectionInfo
* @version 4.9.2.3
*/
export default class TextSectionInfo {
    /**
    * Constructs a new <code>TextSectionInfo</code>.
    * @alias module:model/TextSectionInfo
    * @class
    */

    constructor() {
        
        
        
    }

    /**
    * Constructs a <code>TextSectionInfo</code> from a plain JavaScript object, optionally creating a new instance.
    * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
    * @param {Object} data The plain JavaScript object bearing properties of interest.
    * @param {module:model/TextSectionInfo} obj Optional instance to populate.
    * @return {module:model/TextSectionInfo} The populated <code>TextSectionInfo</code> instance.
    */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new TextSectionInfo();
                        
            
            if (data.hasOwnProperty('Text')) {
                obj['Text'] = ApiClient.convertToType(data['Text'], 'String');
            }
            if (data.hasOwnProperty('Name')) {
                obj['Name'] = ApiClient.convertToType(data['Name'], 'String');
            }
            if (data.hasOwnProperty('Id')) {
                obj['Id'] = ApiClient.convertToType(data['Id'], 'String');
            }
            if (data.hasOwnProperty('Level')) {
                obj['Level'] = NotificationsNotificationLevel.constructFromObject(data['Level']);
            }
        }
        return obj;
    }

    /**
    * @member {String} Text
    */
    'Text' = undefined;
    /**
    * @member {String} Name
    */
    'Name' = undefined;
    /**
    * @member {String} Id
    */
    'Id' = undefined;
    /**
    * @member {module:model/NotificationsNotificationLevel} Level
    */
    'Level' = undefined;




}
