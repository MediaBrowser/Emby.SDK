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
* The DevicesLocalFileInfo model module.
* @module model/DevicesLocalFileInfo
* @version 4.8.10.0
*/
export default class DevicesLocalFileInfo {
    /**
    * Constructs a new <code>DevicesLocalFileInfo</code>.
    * @alias module:model/DevicesLocalFileInfo
    * @class
    */

    constructor() {
        
        
        
    }

    /**
    * Constructs a <code>DevicesLocalFileInfo</code> from a plain JavaScript object, optionally creating a new instance.
    * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
    * @param {Object} data The plain JavaScript object bearing properties of interest.
    * @param {module:model/DevicesLocalFileInfo} obj Optional instance to populate.
    * @return {module:model/DevicesLocalFileInfo} The populated <code>DevicesLocalFileInfo</code> instance.
    */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new DevicesLocalFileInfo();
                        
            
            if (data.hasOwnProperty('Name')) {
                obj['Name'] = ApiClient.convertToType(data['Name'], 'String');
            }
            if (data.hasOwnProperty('Id')) {
                obj['Id'] = ApiClient.convertToType(data['Id'], 'String');
            }
            if (data.hasOwnProperty('Album')) {
                obj['Album'] = ApiClient.convertToType(data['Album'], 'String');
            }
            if (data.hasOwnProperty('MimeType')) {
                obj['MimeType'] = ApiClient.convertToType(data['MimeType'], 'String');
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
    * @member {String} Album
    */
    'Album' = undefined;
    /**
    * @member {String} MimeType
    */
    'MimeType' = undefined;




}
